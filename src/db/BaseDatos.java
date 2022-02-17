package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Usuario;

/**
 * BaseDatos. Clase que se encarga de las transacciones con la base de datos.
 *
 * @author johan
 */
public class BaseDatos {

    private static Connection conn = null;

/*
    public static void main(String[] args) {
        BaseDatos transacciones = new BaseDatos();
        transacciones.conectarBD();
        String[] consultas = new String[]{"email, contraseña"};
        String[] valores = new String[]{"informacion_acceso WHERE email = 'juan@gmail.com'"};

        ArrayList<String> result = consultarInformacion(consultas, valores);

        System.out.println("Resultado " + result);
    }
*/
    /**
     * conectarBD. Metoddo que se encarga de crear la conexion con la base de
     * datos.
     *
     * @author johan
     */
    public static void conectarBD() {
        try {
            System.out.println(Class.forName("org.postgresql.Driver"));

            String url = "jdbc:postgresql://localhost:5432/post_evidence";
            conn = DriverManager.getConnection(url, "root", "root");
            System.out.printf("Conexion en %s establecida con '%s'\n\n", url.split("/")[2], url.split("/")[3]);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * añadirUsuario. Metodo que añade la informacion del usuario a la base de
     * datos.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     */
    public static void añadirUsuario(Usuario user) {

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
        insertarInformacion(consultas, valores);
    }

    /**
     * insertarInformacion. Metodo que se encarga de realizar las consultas con
     * la respectiva informacion a insertar.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     */
    private static void insertarInformacion(String[] consultas, String[] valores) {
        for (int i = 0; i < consultas.length; i++) {

            ResultSet rs = null;
            Statement st = null;

            try {

                conn.setAutoCommit(true);
                st = conn.createStatement();
                String consulta = String.format("INSERT INTO %s VALUES %s;", consultas[i], valores[i]);
                rs = st.executeQuery(consulta);
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
    }

    /**
     * insertarInformacion. Metodo que se encarga de realizar las consultas con
     * la respectiva informacion a insertar.
     *
     * @param user. Instancia de la clase Usuario que contiene la informacion
     * del usuario.
     * @author johan
     */
    private static ArrayList<String> consultarInformacion(String[] consultas, String[] valores) {

        ArrayList<String> row = new ArrayList<String>();

        for (int i = 0; i < consultas.length; i++) {

            ResultSet rs = null;
            //PreparedStatement st = null;
            Statement st = null;

            try {

                conn.setAutoCommit(true);
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

    public static boolean iniciarSesion(String email, String contraseña) {
        String[] consultas = new String[]{"email,contraseña"};
        String[] valores = new String[]{String.format("informacion_acceso WHERE email ='%s'", email)};

        ArrayList<String> result = consultarInformacion(consultas, valores);

        if (result.size() > 0) {
            if (comparar(contraseña, result.get(1))) {
                return true;
            }
        }

        return false;
    }

    private static boolean comparar(String plainPassword, String hashPassword) {
        if (plainPassword.equals(hashPassword)) {
            return true;
        }
        return false;
    }

    private static int sizeofConsulta(ResultSet rs) {
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

    private static ArrayList<String> row(ResultSet rs) {
        int size = sizeofConsulta(rs);
        ArrayList<String> resultado = new ArrayList<String>();

        try {

            for (int i = 1; i <= size; i++) {
                resultado.add(rs.getString(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

}
