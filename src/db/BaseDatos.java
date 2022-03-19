package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import login.Usuario;

/**
 * BaseDatos. Clase que se encarga de las transacciones con la base de datos.
 *
 * @author johan
 */
public class BaseDatos {

    private Connection conn = null;

    public void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        bd.conectarBD();
        String[] consultas = new String[]{"dummy(cedula)"};
        int dummy = (int) (Math.random() * 10000);
        String[] valores = new String[]{String.format("('%d'),('%d')", dummy, dummy + 1)};

        insertarInformacion(consultas, valores);
    }

    /**
     * conectarBD.Metoddo que se encarga de crear la conexion con la base de
     * datos.
     *
     * @author johan
     * @return
     */
    public boolean conectarBD() {
        try {
            System.out.println(Class.forName("org.postgresql.Driver"));

            String url = "jdbc:postgresql://localhost:5432/post_evidence";
            conn = DriverManager.getConnection(url, "postgres", "root");
            System.out.printf("Conexion en %s establecida con '%s'\n\n", url.split("/")[2], url.split("/")[3]);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    /**
     * añadirUsuario.Metodo que añade la informacion del usuario a la base de
     * datos.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     * @return
     */
    public boolean añadirUsuario(Usuario user) {

        // Obtener informacion de la instancia de usuario
        String[] infoPersonal = user.getInformacionPersonal();
        String[] infoAcceso = user.getInformacionAcceso();
        String[] infoLocacion = user.getInformacionLocacion();

        // Crear consultas y sus valores
        String[] consultas = new String[]{"informacion_personal(numeroCedula, nombre, apellido1,apellido2)",
            "informacion_acceso(numeroCedula_FK, email, contraseña)",
            "informacion_locacion(numeroCedula_FK, ciudad, empresa, localidad)"
        };

        String[] valores = new String[]{
            String.format("('%s', '%s', '%s', '%s')", infoPersonal[0], infoPersonal[1], infoPersonal[2], infoPersonal[3]),
            String.format("('%s', '%s', '%s')", infoPersonal[0], infoAcceso[0], infoAcceso[1]),
            String.format("('%s', '%s', '%s', '%s')", infoPersonal[0], infoLocacion[0], infoLocacion[1], infoLocacion[2])
        };

        // Ejecutar consultas usando el for
        boolean isOk = insertarInformacion(consultas, valores);

        return isOk;
    }

    /**
     * insertarInformacion. Metodo que se encarga de realizar las consultas con
     * la respectiva informacion a insertar.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     */
    private boolean insertarInformacion(String[] inserciones, String[] valores) {
        for (int i = 0; i < inserciones.length; i++) {
            Statement st = null;
            try {
                st = conn.createStatement();
                String consulta = String.format("INSERT INTO %s VALUES %s;", inserciones[i], valores[i]);
                st.executeUpdate(consulta);
                int numeroInserciones = (valores[i].split("\\)").length);
                System.out.println(String.format("INSERT 0 %d", numeroInserciones));
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } finally {
                try {
                    if (st != null) {
                        st.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * insertarInformacion. Metodo que se encarga de realizar las consultas con
     * la respectiva informacion a insertar.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     */
    private ArrayList<String> consultarInformacion(String[] consultas, String[] valores) {

        ArrayList<String> row = new ArrayList<>();

        for (int i = 0; i < consultas.length; i++) {

            ResultSet rs = null;
            //PreparedStatement st = null;
            Statement st = null;

            try {

                st = conn.createStatement();

                String consulta = String.format("SELECT %s FROM %s;", consultas[i], valores[i]);
                System.out.println("Consulta: " + consulta);
                rs = st.executeQuery(consulta);

                row = row(rs);
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (rs != null && st != null) {
                        rs.close();
                        st.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return row;
    }

    public boolean putEvidences(String[] datosEvidencia, String email) {
        // datosEvidencia = {n_contrato, id_informe, observaciones, ciudad, fecha_registro, tipo_trabajo, fecha }
        String subQuery = "(SELECT serial_registro FROM registro_evidencias WHERE id_informe='%s')";

        System.out.println("Subconsulta " + String.format(subQuery, datosEvidencia[1]));

        //SELECT serial_registro FROM registro_evidencias WHERE id_informe='222222;';
        String[] tablas = new String[]{"registro_evidencias(id_informe,email,fecha,estado)",
            "registro_detalles(serial_evidencia_FK,email,id_informe,n_contrato,observaciones,fecha_registro,tipo_trabajo,ciudad)"};

        String valores[];
        valores = new String[]{String.format("('%s','%s','%s','%s')", datosEvidencia[1], email, datosEvidencia[6], "EN-ESPERA"),
            String.format("(%s,'%s','%s','%s','%s','%s','%s','%s')", String.format(subQuery, datosEvidencia[1]),
            email, datosEvidencia[1], datosEvidencia[0], datosEvidencia[2], datosEvidencia[4], datosEvidencia[5], datosEvidencia[3])};

        for (int i = 0; i < 2; i++) {
            Statement st = null;
            try {
                st = conn.createStatement();
                String consulta = String.format("INSERT INTO %s VALUES %s;", tablas[i], valores[i]);

                System.out.println("Consulta " + consulta);

                st.executeUpdate(consulta);
                int numeroInserciones = (valores[i].split("\\)").length);
                System.out.println(String.format("INSERT 0 %d", numeroInserciones));
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } finally {
                try {
                    if (st != null) {
                        st.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        }

        return true;
    }

    public ArrayList<ArrayList<String>> getEvidences(String email) {
        ArrayList<ArrayList<String>> resultados = new ArrayList<>();

        ResultSet rs = null;
        Statement st = null;

        try {

            st = conn.createStatement();

            String consulta = String.format("SELECT id_informe, fecha, estado FROM registro_evidencias WHERE email='%s';", email);
            System.out.println("Consulta: " + consulta);
            rs = st.executeQuery(consulta);

            int size = sizeofConsulta(rs);

            do {
                ArrayList<String> fila = new ArrayList<>();
                for (int i = 1; i <= size; i++) {
                    String res = new String(rs.getString(i));
                    fila.add(res);
                }
                resultados.add(0, fila);
            } while (rs.next());

            return resultados;

        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null && st != null) {
                    rs.close();
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultados;
    }

    public boolean iniciarSesion(String email, String contraseña) {
        String[] consultas = new String[]{"email, contraseña"};
        String[] valores = new String[]{String.format("informacion_acceso WHERE email ='%s'", email)};

        ArrayList<String> result = consultarInformacion(consultas, valores);

        if (!result.isEmpty()) {
            if (comparar(contraseña, result.get(1))) {
                return true;
            }
        }

        return false;
    }

    private boolean comparar(String plainPassword, String hashPassword) {
        return (SHA2.getSHA512(plainPassword)).equals(hashPassword);
    }

    private int sizeofConsulta(ResultSet rs) {
        int size = 0;

        try {
            while (rs.next()) {
                for (int i = 1; true; i++) {
                    if (rs.getString(i) != null) {
                        size++;
                    }
                }
            }
        } catch (SQLException ex) {
            return size;
        }

        return size;
    }

    private ArrayList<String> row(ResultSet rs) {
        int size = sizeofConsulta(rs);
        ArrayList<String> resultado = new ArrayList<>();

        try {
            for (int i = 1; i <= size; i++) {
                resultado.add(rs.getString(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    private ArrayList<ArrayList<String>> multiRows(ResultSet rs) {
        int size = sizeofConsulta(rs);
        ArrayList<ArrayList<String>> temp = new ArrayList<>();

        try {
            while (rs.next()) {
                ArrayList<String> fila = new ArrayList<>();
                for (int i = 1; i <= size; i++) {
                    fila.add(rs.getString(i));
                }
                temp.add(0, fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

//        for (ArrayList<String> al : resultado) {
//            for (String s : al) {
//               System.out.println("resultado " + s);
//            }
//        }
        return temp;
    }

}
