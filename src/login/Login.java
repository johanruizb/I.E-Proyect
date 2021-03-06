package login;

import db.BaseDatos;
import evidencia.Evidencias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import registro.Registro;

/**
 *
 * @author jr0237
 */
public class Login extends JFrame {

    private JPanel bg;
    private JPasswordField contraseña;
    private JTextField correo;
    private JPanel entradas;
    private JLabel iconEmail;
    private JLabel iconPass;
    private JButton ingresar;
    private JLabel logo;
    private JPanel panel;
    private JCheckBox recordar;
    private JLabel registro;

    private final Login reference = this;
    private final EscuchaFoco focusEscucha = new EscuchaFoco();
    private final EscuchaMouse mouseEscucha = new EscuchaMouse();
    private final EscuchaAction actionEscucha = new EscuchaAction();

    private BaseDatos bd = new BaseDatos();

    /**
     * Creates new form Login
     */
    public Login() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(869, 500));

        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bg = new JPanel();
        panel = new JPanel();
        logo = new JLabel();
        ingresar = new JButton();
        entradas = new JPanel();
        correo = new JTextField();
        iconEmail = new JLabel();
        iconPass = new JLabel();
        contraseña = new JPasswordField();
        recordar = new JCheckBox();
        registro = new JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        bg.setLayout(new BoxLayout(bg, BoxLayout.LINE_AXIS));

        panel.setPreferredSize(new java.awt.Dimension(235, 375));
        panel.setLayout(new java.awt.GridBagLayout());

        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setIcon(new ImageIcon(getClass().getResource("/img/login/1.png")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        panel.add(logo, gridBagConstraints);

        ingresar.setBackground(new java.awt.Color(33, 150, 243));
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresar.setMaximumSize(new java.awt.Dimension(100, 35));
        ingresar.setMinimumSize(new java.awt.Dimension(100, 35));
        ingresar.setPreferredSize(new java.awt.Dimension(100, 35));

        ingresar.addFocusListener(focusEscucha);
        ingresar.addActionListener(actionEscucha);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(ingresar, gridBagConstraints);

        entradas.setOpaque(false);
        entradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correo.setForeground(new java.awt.Color(204, 204, 204));
        correo.setText("Correo o usuario");
        correo.setToolTipText("");
        correo.addFocusListener(focusEscucha);
        entradas.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 36));

        iconEmail.setIcon(new ImageIcon(getClass().getResource("/img/login/correo.png")));
        entradas.add(iconEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconPass.setIcon(new ImageIcon(getClass().getResource("/img/login/contraseña.png")));
        entradas.add(iconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setText("Contraseña");
        contraseña.addFocusListener(focusEscucha);
        entradas.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 36));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panel.add(entradas, gridBagConstraints);

        recordar.setText("Recordar usuario");
        recordar.setContentAreaFilled(false);
        recordar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recordar.setHorizontalAlignment(SwingConstants.CENTER);
        recordar.setHorizontalTextPosition(SwingConstants.RIGHT);

        recordar.addFocusListener(focusEscucha);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(recordar, gridBagConstraints);

        registro.setText("No tienes un usuario? Registrate aqui.");

        registro.addMouseListener(mouseEscucha);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panel.add(registro, gridBagConstraints);

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

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login();
            }
        });
    }

    private class EscuchaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(ingresar)) {
                ingresar.setEnabled(false);

                String email = correo.getText();
                String password = String.valueOf(contraseña.getPassword());

                boolean isEmpty = ("Correo o usuario".equals(email) || "".equals(email))
                        || ("Contraseña".equals(password) || "".equals(password));

                if (!isEmpty) {
                    if (bd.conectarBD() && bd.iniciarSesion(email, password)) {
                        reference.dispose();
                        Evidencias evidencias = new Evidencias(reference);
                        evidencias.setUserInfo(email, password);
                    } else {
                        JOptionPane.showMessageDialog(reference, "Contraseña erronea o usuario inexistente");
                    }
                } else {
                    JOptionPane.showMessageDialog(reference, "Ingresa tu correo y contraseña");
                }

                ingresar.setEnabled(true);
            }
        }

    }

    private class EscuchaMouse extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource().equals(registro)) {
                // Ocultar o destruir ventana actual
                reference.setVisible(false);

                // Crear y mostrar el registro
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Registro(reference);
                    }
                });
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource().equals(registro)) {
                registro.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        }
    }

    private class EscuchaFoco extends FocusAdapter {

        @Override
        public void focusGained(FocusEvent e) {
            if (e.getSource() == correo) {
                defaultText();
                if ("Correo o usuario".equals(correo.getText())) {
                    correo.setText("");
                    correo.setForeground(Color.BLACK);
                }
            } else if (e.getSource() == contraseña) {
                defaultText();
                if ("Contraseña".equals(String.valueOf(contraseña.getPassword()))) {
                    contraseña.setText("");
                    contraseña.setForeground(Color.BLACK);
                }
            } else if (e.getSource().equals(recordar)) {
                defaultText();
            } else if (e.getSource().equals(ingresar)) {
                defaultText();
            }
        }

        private void defaultText() {
            if ("".equals(correo.getText())) {
                correo.setText("Correo o usuario");
                correo.setForeground(new Color(204, 204, 204));

            } else if (!"Correo o usuario".equals(correo.getText())) {
                correo.setForeground(Color.BLACK);
            }

            if ("".equals(String.valueOf(contraseña.getPassword()))) {
                contraseña.setText("Contraseña");
                contraseña.setForeground(new Color(204, 204, 204));

            } else if (!"Contraseña".equals(String.valueOf(contraseña.getPassword()))) {
                contraseña.setForeground(Color.BLACK);
            }
        }

    }
}
