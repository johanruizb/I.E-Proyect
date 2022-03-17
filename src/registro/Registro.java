package registro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

import login.Login;
import login.Usuario;

import db.BaseDatos;

/**
 *
 * @author Victor
 */
public class Registro extends JFrame {

    private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
    private Border bordeAzul = BorderFactory.createLineBorder(Color.BLUE);

    private JTextField apellidos;
    private JTextField cedula;
    private JTextField ciudad;
    private JTextField comprobarEmail;
    private JTextField departamento;
    private JTextField email;
    private JTextField nombre;
    private JTextField nombreEmpresa;
    private JPasswordField contraseña;

    private JButton creaRegistro;
    private JButton cancelar;

    private JPanel panel;
    private JPanel bg;

    private JLabel titulo;
    private JPasswordField verificarContraseña;

    private Login viewLogin;
    private Registro reference = this;

    private final Border bordeVacio = BorderFactory.createEmptyBorder(5, 5, 5, 5);

    public static final int ALTO_CASILLAS = 40;
    public static final int ANCHO_CASILLAS = 200;

    private final EscuchaFoco focusEscucha = new EscuchaFoco();
    private final EscuchaAction actionEscucha = new EscuchaAction();

    /*
    public static void main(String[] args) {
        // Crear y mostrar el registro 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Registro();
            }
        });
    }*/
    /**
     * Creates new form Login
     */
    protected Registro() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(501, 288));
        initComponents();
        // setLocationRelativeTo(viewLogin);
        setVisible(true);
    }

    public Registro(Login viewL) {
        viewLogin = viewL;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(501, 288));
        initComponents();
        setLocationRelativeTo(viewLogin);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        bg = new JPanel();
        panel = new JPanel();
        nombre = new JTextField();
        apellidos = new JTextField();
        cedula = new JTextField();
        ciudad = new JTextField();
        email = new JTextField();
        comprobarEmail = new JTextField();
        nombreEmpresa = new JTextField();
        departamento = new JTextField();
        contraseña = new JPasswordField();
        verificarContraseña = new JPasswordField();
        titulo = new JLabel();
        creaRegistro = new JButton();
        cancelar = new JButton();

        bg.setBackground(new Color(255, 255, 255));
        bg.setPreferredSize(new Dimension(869, 500));
        bg.setLayout(new BoxLayout(bg, BoxLayout.LINE_AXIS));
        bg.setSize(new Dimension(501, 288));

        panel.setBackground(new Color(204, 204, 204));
        panel.setMinimumSize(new Dimension(896, 500));
        panel.setPreferredSize(new Dimension(896, 500));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;

        JPanel datosPersonales = new JPanel();
        datosPersonales.setLayout(new BoxLayout(datosPersonales, BoxLayout.X_AXIS));
        datosPersonales.setOpaque(false);

        panel.add(datosPersonales, constraints);

        nombre.setBackground(new Color(255, 255, 255));
        nombre.setFont(new Font("Roboto", 0, 11));
        nombre.setName("Nombre:");
        nombre.setText(nombre.getName());
        nombre.setToolTipText(nombre.getName().replaceFirst(":", ""));
        nombre.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));
        nombre.addFocusListener(focusEscucha);

        datosPersonales.add(nombre);

        apellidos.setBackground(new Color(255, 255, 255));
        apellidos.setFont(new Font("Roboto", 0, 11));
        apellidos.setName("Apellidos:");
        apellidos.setText(apellidos.getName());
        apellidos.setToolTipText(apellidos.getName().replaceFirst(":", ""));
        apellidos.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));
        apellidos.addFocusListener(focusEscucha);

        datosPersonales.add(apellidos);

        cedula.setBackground(new Color(255, 255, 255));
        cedula.setFont(new Font("Roboto", 0, 11));
        cedula.setName("Número de cedula:");
        cedula.setText(cedula.getName());
        cedula.setToolTipText(cedula.getName().replaceFirst(":", ""));
        cedula.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));
        cedula.addFocusListener(focusEscucha);

        datosPersonales.add(cedula);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(datosPersonales, constraints);

        JPanel datosAcceso1 = new JPanel();
        datosAcceso1.setLayout(new BoxLayout(datosAcceso1, BoxLayout.X_AXIS));
        datosAcceso1.setOpaque(false);

        email.setBackground(new Color(255, 255, 255));
        email.setFont(new Font("Roboto", 0, 11));
        email.setName("Email:");
        email.setText(email.getName());
        email.setToolTipText(email.getName().replaceFirst(":", ""));
        email.setPreferredSize(new Dimension((int) (ANCHO_CASILLAS * 1.5), ALTO_CASILLAS));
        email.addFocusListener(focusEscucha);

        datosAcceso1.add(email);

        comprobarEmail.setBackground(new Color(255, 255, 255));
        comprobarEmail.setFont(new Font("Roboto", 0, 11));
        comprobarEmail.setName("Verificar email:");
        comprobarEmail.setText(comprobarEmail.getName());
        comprobarEmail.setToolTipText(comprobarEmail.getName().replaceFirst(":", ""));
        comprobarEmail.setPreferredSize(new Dimension((int) (ANCHO_CASILLAS * 1.5), ALTO_CASILLAS));
        comprobarEmail.addFocusListener(focusEscucha);

        constraints.gridy = 2;
        datosAcceso1.add(comprobarEmail);
        panel.add(datosAcceso1, constraints);

        JPanel datosAcceso2 = new JPanel();
        datosAcceso2.setLayout(new BoxLayout(datosAcceso2, BoxLayout.X_AXIS));
        datosAcceso2.setOpaque(false);

        contraseña.setBackground(new Color(255, 255, 255));
        contraseña.setFont(new Font("Roboto", 0, 11));
        contraseña.setName("Contraseña:");
        contraseña.setText(contraseña.getName());
        contraseña.setToolTipText(contraseña.getName().replaceFirst(":", ""));
        contraseña.setPreferredSize(new Dimension((int) (ANCHO_CASILLAS * 1.5), ALTO_CASILLAS));
        contraseña.addFocusListener(focusEscucha);

        datosAcceso2.add(contraseña);

        verificarContraseña.setBackground(new Color(255, 255, 255));
        verificarContraseña.setFont(new Font("Roboto", 0, 11));
        verificarContraseña.setName("Contraseña:");
        verificarContraseña.setText(verificarContraseña.getName());
        verificarContraseña.setToolTipText("Verificar contraseña");
        verificarContraseña.setPreferredSize(new Dimension((int) (ANCHO_CASILLAS * 1.5), ALTO_CASILLAS));
        verificarContraseña.addFocusListener(focusEscucha);

        constraints.gridy = 3;
        datosAcceso2.add(verificarContraseña);
        panel.add(datosAcceso2, constraints);

        JPanel datosLocacion = new JPanel();
        datosLocacion.setLayout(new BoxLayout(datosLocacion, BoxLayout.X_AXIS));
        datosLocacion.setOpaque(false);

        ciudad.setBackground(new Color(255, 255, 255));
        ciudad.setFont(new Font("Roboto", 0, 11));
        ciudad.setName("Ciudad:");
        ciudad.setText(ciudad.getName());
        ciudad.setToolTipText(ciudad.getName().replaceFirst(":", ""));
        ciudad.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));
        ciudad.addFocusListener(focusEscucha);

        datosLocacion.add(ciudad);

        nombreEmpresa.setBackground(new Color(255, 255, 255));
        nombreEmpresa.setFont(new Font("Roboto", 0, 11));
        nombreEmpresa.setName("Empresa:");
        nombreEmpresa.setText(nombreEmpresa.getName());
        nombreEmpresa.setToolTipText(nombreEmpresa.getName().replaceFirst(":", ""));
        nombreEmpresa.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));

        nombreEmpresa.addFocusListener(focusEscucha);

        datosLocacion.add(nombreEmpresa);

        departamento.setBackground(new Color(255, 255, 255));
        departamento.setFont(new Font("Roboto", 0, 11));
        departamento.setName("Area Operativa:");
        departamento.setText(departamento.getName());
        departamento.setToolTipText(departamento.getName().replaceFirst(":", ""));
        departamento.setPreferredSize(new Dimension(ANCHO_CASILLAS, ALTO_CASILLAS));
        departamento.addFocusListener(focusEscucha);

        constraints.gridy = 4;
        datosLocacion.add(departamento);
        panel.add(datosLocacion, constraints);

        titulo.setFont(new Font("Roboto", 0, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Registro de usuario");
        titulo.setBorder(bordeVacio);

        constraints.gridy = 0;
        panel.add(titulo, constraints);

        JPanel inferior = new JPanel();
        inferior.setOpaque(false);

        cancelar.setBackground(new Color(33, 150, 243));
        cancelar.setForeground(new Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setPreferredSize(new Dimension(ANCHO_CASILLAS - 80, ALTO_CASILLAS));
        cancelar.addActionListener(actionEscucha);

        inferior.add(cancelar);

        creaRegistro.setBackground(new Color(33, 150, 243));
        creaRegistro.setForeground(new Color(255, 255, 255));
        creaRegistro.setText("Registrar");
        creaRegistro.setPreferredSize(new Dimension(ANCHO_CASILLAS - 80, ALTO_CASILLAS));
        creaRegistro.addActionListener(actionEscucha);

        inferior.add(creaRegistro);

        constraints.gridy = 5;
        panel.add(inferior, constraints);

        bg.add(panel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(bg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(bg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }

    private boolean isWhiteSpace(JTextField componente) {
        if (!isEmpty(componente)) {
            String textComponent = String.valueOf(componente.getText());
            for (String s : textComponent.split("(?!^)")) {
                if (s.equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isEmpty(JTextField componente) {
        String textComponent = String.valueOf(componente.getText());
        return textComponent.equals("");
    }

    private boolean isCorrect(JTextField componente) {
        return !isEmpty(componente) && !isWhiteSpace(componente);
    }

    private void comprobacionBasica(JTextField componente) {
        String textComponent = String.valueOf(componente.getText());
        String defaultText = String.valueOf(componente.getName());

        if (!textComponent.equals(defaultText)) {
            if (isEmpty(componente) || isWhiteSpace(componente)) {
                componente.setBorder(bordeRojo);
                componente.setText(defaultText);
            } else if (isCorrect(componente)) {
                componente.setBorder(bordeAzul);
            }
        }
    }

    private void setEmptyText(JTextField componente) {
        String defaultText = String.valueOf(componente.getName());
        String textComponent = String.valueOf(componente.getText());
        if (textComponent.equals(defaultText)) {
            componente.setText("");
        }
    }

    private boolean validarInfoPersonal() {
        int i = 0;

        if (isCorrect(nombre) && !nombre.getText().equals("Nombre:")) {
            i++;
        } else {
            nombre.setBorder(bordeRojo);
        }

        if (!isEmpty(apellidos) && !apellidos.getText().equals("Apellidos:")) {
            i++;
        } else {
            apellidos.setBorder(bordeRojo);
        }

        if (isCorrect(cedula) && !cedula.getText().equals("Número de cedula:")) {
            i++;
        } else {
            cedula.setBorder(bordeRojo);
        }

        return i == 3;
    }

    private boolean validarInfoAcceso() {
        int i = 0;

        String email1 = email.getText();
        String email2 = comprobarEmail.getText();
        String passW1 = new String(contraseña.getPassword());
        String passW2 = new String(verificarContraseña.getPassword());

        if (validandoEmail(email1) && validandoEmail(email2) && email1.equals(email2)) {
            i++;
        } else {
            email.setBorder(bordeRojo);
            comprobarEmail.setBorder(bordeRojo);
        }
        if (comprobarContraseña(passW1) && comprobarContraseña(passW2) && passW1.equals(passW2)) {
            i++;
        } else {
            contraseña.setBorder(bordeRojo);
            verificarContraseña.setBorder(bordeRojo);
        }

        return i == 2;
    }

    private boolean validarInfoLocacion() {
        int i = 0;

        if (isCorrect(ciudad) && !ciudad.getText().equals("Ciudad:")) {
            i++;
        } else {
            ciudad.setBorder(bordeRojo);
        }

        if (isCorrect(departamento) && !departamento.getText().equals("Area Operativa:")) {
            i++;
        } else {
            departamento.setBorder(bordeRojo);
        }

        if (isCorrect(nombreEmpresa) && !nombreEmpresa.getText().equals("Empresa:")) {
            i++;
        } else {
            nombreEmpresa.setBorder(bordeRojo);
        }

        if (i == 3) {
            return true;
        }

        return false;
    }

    private boolean comprobarDatos() {
        validarInfoPersonal();
        validarInfoAcceso();
        validarInfoLocacion();
        return (validarInfoPersonal() && validarInfoAcceso() && validarInfoLocacion());
    }

    private boolean validandoEmail(String emailEntrante) {
        String validacion = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(validacion);
        Matcher matcher = pattern.matcher(emailEntrante);

        if (matcher.matches()) {
            // JOptionPane.showMessageDialog(this, "Email correcto");
            email.setBorder(bordeAzul);
            return true;
        } else {
            email.setBorder(bordeRojo);
            return false;
        }
    }

    private boolean comprobarContraseña(String passW) {
        String passworValido = ("^[A-Za-z\\d$@$#_!%*?&]{06,15}$");

        Pattern patron = Pattern.compile(passworValido);
        Matcher comparar = patron.matcher(passW);

        return comparar.matches();
    }

    private class EscuchaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(creaRegistro)) {
                if (comprobarDatos()) {
                    BaseDatos.conectarBD();
                    Usuario user = new Usuario();
                    user.setInformacionPersonal(cedula.getText(), nombre.getText(), apellidos.getText());
                    user.setInformacionAcceso(email.getText(), String.valueOf(contraseña.getPassword()));
                    user.setInformacionLocacion(ciudad.getText(), nombreEmpresa.getText(), departamento.getText());
                    BaseDatos.añadirUsuario(user);

                    reference.dispose();

                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new Login().setLocationRelativeTo(reference);
                        }
                    });

                } else {
                    JOptionPane.showMessageDialog(reference,
                            "Formulario incompleto o incorrecto algun campo\nPor favor, revisalo e intentalo de nuevo");
                }
            } else if (ae.getSource().equals(cancelar)) {
                cancelar.setEnabled(false);

                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        viewLogin.setLocationRelativeTo(reference);
                        reference.dispose();
                        viewLogin.setVisible(true);
                    }
                });
            }
        }

    }

    private class EscuchaFoco implements FocusListener {

        @Override
        public void focusGained(FocusEvent fe) {
            setEmptyText((JTextField) fe.getSource());
        }

        @Override
        public void focusLost(FocusEvent fe) {
            if (fe.getSource().equals(apellidos)) {
                if (!apellidos.getText().equals(apellidos.getName())) {
                    if (!isEmpty(apellidos)) {
                        apellidos.setBorder(bordeAzul);
                    } else {
                        apellidos.setBorder(bordeRojo);
                        apellidos.setText(apellidos.getName());
                    }
                }
            } else if (fe.getSource().equals(email)) {
                validandoEmail(email.getText());
            } else if (fe.getSource().equals(comprobarEmail)) {
                if (!comprobarEmail.getText().equals(comprobarEmail.getName())) {
                    String emailUsuario = email.getText();
                    if (emailUsuario.equals(comprobarEmail.getText())
                            && isCorrect(comprobarEmail)) {
                        comprobarEmail.setBorder(bordeAzul);
                        email.setBorder(bordeAzul);
                    } else {
                        comprobarEmail.setBorder(bordeRojo);
                        email.setBorder(bordeRojo);
                        comprobarEmail.setText(comprobarEmail.getName());
                    }
                }
            } else if (fe.getSource().equals(verificarContraseña)) {
                String password = new String(contraseña.getPassword());
                String password2 = new String(verificarContraseña.getPassword());

                if (!(password.equals(contraseña.getName()) && password2.equals(contraseña.getName()))) {
                    if (password2.equals(password) && !isEmpty(contraseña)) {
                        verificarContraseña.setBorder(bordeAzul);
                        contraseña.setBorder(bordeAzul);
                    } else {
                        verificarContraseña.setBorder(bordeRojo);
                        verificarContraseña.setText(contraseña.getName());
                        contraseña.setBorder(bordeRojo);
                    }
                }
            } else if (fe.getSource().equals(contraseña)) {
                String password = new String(contraseña.getPassword());
                if (!password.equals("Contraseña:")) {
                    if (!isCorrect(contraseña)) {
                        contraseña.setBorder(bordeRojo);
                        contraseña.setText("Contraseña:");
                    } else if (isCorrect(contraseña)) {

                        if (comprobarContraseña(password)) {
                            contraseña.setBorder(bordeAzul);
                        } else {
                            contraseña.setBorder(bordeRojo);
                            contraseña.setText("Contraseña:");
                        }
                    }
                }
            } else {
                comprobacionBasica((JTextField) fe.getSource());
            }
        }
    }
}
