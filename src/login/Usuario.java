package login;

/**
 *
 * @author johan
 */
public class Usuario {

    private String nombreUsuario = "", apellidosUsuario = "", numeroCedula = "";
    private String emailUsuario = "", password = "";
    private String ciudadUsuario = "", empresaUsuario = "", localidadUsuario = "";

    public void setInformacionPersonal(String nombre, String apellidos, String documento) {
        if ("".equals(nombreUsuario + apellidosUsuario + numeroCedula)) {
            nombreUsuario = nombre;
            apellidosUsuario = apellidos;
            numeroCedula = documento;
        }
    }

    public void setInformacionAcceso(String email, String contraseña) {
        if ("".equals(emailUsuario + password)) {
            emailUsuario = email;
            password = contraseña;
        }
    }

    public void setInformacionLocacion(String ciudad, String empresa, String localidad) {
        if ("".equals(ciudadUsuario + empresaUsuario + localidadUsuario)) {
            ciudadUsuario = ciudad;
            empresaUsuario = empresa;
            localidadUsuario = localidad;
        }
    }

    /**
     * getInformacionPersonal. Metodo que retorna la informacion personal del
     * usuario.
     *
     * @return String[]. {numeroCedula, nombreUsuario, apellido1, apellido2}
     * @author johan
     */
    public String[] getInformacionPersonal() {
        if (!"".equals(nombreUsuario + apellidosUsuario + numeroCedula)) {

            String apellido1 = apellidosUsuario.split(" ")[0];
            String apellido2 = (apellidosUsuario.split(" ")[1]).length() > 1 ? (apellidosUsuario.split(" ")[1]) : "NONE";

            return new String[]{numeroCedula, nombreUsuario, apellido1, apellido2};
        }

        return new String[]{null};
    }

    /**
     * getInformacionAcceso. Metodo que retorna la informacion de acceso del
     * usuario al sistema.
     *
     * @return String[]. {emailUsuario, password}
     * @author johan
     */
    public String[] getInformacionAcceso() {
        if (!"".equals(emailUsuario + password)) {
            return new String[]{emailUsuario, password};
        }
        return new String[]{null};
    }

    /**
     * getInformacionLocacion. Metodo que retorna la informacion de la locacion
     * del usuario.
     *
     * @return String[]. {ciudadUsuario, empresaUsuario, localidadUsuario}
     * @author johan
     */
    public String[] getInformacionLocacion() {
        if (!"".equals(ciudadUsuario + empresaUsuario + localidadUsuario)) {
            return new String[]{ciudadUsuario, empresaUsuario, localidadUsuario};
        }
        return new String[]{null};
    }

}
