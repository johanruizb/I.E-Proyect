package db;

import java.sql.*;
import java.util.Properties;
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

    /**
     * BaseDatos. Metoddo constructor que se encarga de crear la conexion con la
     * base de datos.
     *
     * @author johan
     */
    public BaseDatos() {
        try {

            System.out.println(Class.forName("org.postgresql.Driver"));

            String url = "jdbc:postgresql://0.0.0.0:5432";
            Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "root");
            props.setProperty("ssl", "true");
            conn = DriverManager.getConnection(url, props);

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
    public void añadirUsuario(Usuario user) {

        // Obtener informacion de la instancia de usuario
        String[] infoPersonal = user.getInformacionPersonal();
        String[] infoAcceso = user.getInformacionAcceso();
        String[] infoLocacion = user.getInformacionLocacion();

        // Crear consultas y sus valores
        String[] consultas = new String[]{"informacionpersonal(numeroCedula, nombre, apellido1,apellido2)",
            "informacionacceso(numeroCedula_FK, email, contraseña)",
            "informacionlocacion(numeroCedula_FK, ciudad, empresa, localidad)"
        };

        String[] valores = new String[]{
            String.format("(%s, %s, %s, %s)", infoPersonal[0], infoPersonal[1], infoPersonal[2], infoPersonal[3]),
            String.format("(%s, %s, %s)", infoPersonal[0], infoAcceso[0], infoAcceso[1]),
            String.format("(%s, %s, %s, %s)", infoPersonal[0], infoLocacion[0], infoLocacion[1], infoLocacion[2])
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
    private void insertarInformacion(String[] consultas, String[] valores) {
        for (int i = 0; i < 3; i++) {

            ResultSet rs = null;
            PreparedStatement st = null;

            try {

                conn.setAutoCommit(true);
                st = conn.prepareStatement("INSERT INTO ? VALUES ?");
                st.setString(1, consultas[i]);
                st.setString(2, valores[i]);

                rs = st.executeQuery();

                while (rs.next()) {
                    System.out.print("Insertar informacion \'");
                    System.out.println(rs.getString(1) + "\'");
                }
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

}
