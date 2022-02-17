/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registro;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.lang.Runnable;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Victor
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        comprobarEmail = new javax.swing.JTextField();
        nombreEmpresa = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        verificarContraseña = new javax.swing.JPasswordField();
        titulo = new javax.swing.JLabel();
        creaRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(501, 288));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(869, 500));
        bg.setLayout(new javax.swing.BoxLayout(bg, javax.swing.BoxLayout.LINE_AXIS));
        bg.setSize(new Dimension(501,288));

        panel.setBackground(new java.awt.Color(204,204,204));
        panel.setMinimumSize(new java.awt.Dimension(896, 500));
        panel.setPreferredSize(new java.awt.Dimension(896, 500));
        panel.setLayout(new java.awt.GridBagLayout());

        panelPrincipal.setBackground(new java.awt.Color(204,204,204));
        panelPrincipal.setToolTipText("");
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        panelPrincipal.setName(""); // NOI18N

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        nombre.setText("Nombre:");
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        apellidos.setText("Apellidos:");
        apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidosFocusLost(evt);
            }
        });
        apellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidosMouseClicked(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cedula.setText("Número de cedula:");
        cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaFocusLost(evt);
            }
        });
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaMouseClicked(evt);
            }
        });
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        ciudad.setBackground(new java.awt.Color(255, 255, 255));
        ciudad.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        ciudad.setText("Ciudad:");
        ciudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ciudadFocusLost(evt);
            }
        });
        ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadMouseClicked(evt);
            }
        });

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        email.setText("Email:");
        email.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                emailMouseDragged(evt);
            }
        });
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        comprobarEmail.setBackground(new java.awt.Color(255, 255, 255));
        comprobarEmail.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comprobarEmail.setText("Comprobar Email:");
        comprobarEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comprobarEmailFocusLost(evt);
            }
        });
        comprobarEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprobarEmailMouseClicked(evt);
            }
        });
        comprobarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarEmailActionPerformed(evt);
            }
        });

        nombreEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        nombreEmpresa.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        nombreEmpresa.setText("Empresa:");
        nombreEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreEmpresaFocusLost(evt);
            }
        });
        nombreEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreEmpresaMouseClicked(evt);
            }
        });

        departamento.setBackground(new java.awt.Color(255, 255, 255));
        departamento.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        departamento.setText("Area Operativa:");
        departamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                departamentoFocusLost(evt);
            }
        });
        departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departamentoMouseClicked(evt);
            }
        });

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        contraseña.setText("jPasswordField1");
        contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaFocusLost(evt);
            }
        });
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });

        verificarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        verificarContraseña.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        verificarContraseña.setText("jPasswordField2");
        verificarContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                verificarContraseñaFocusLost(evt);
            }
        });
        verificarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificarContraseñaMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro nuevo usuario");
        titulo.setToolTipText("");

        creaRegistro.setBackground(new java.awt.Color(33, 150, 243));
        creaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        creaRegistro.setText("Registrar");
        creaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creaRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreEmpresa)
                            .addComponent(email)
                            .addComponent(cedula)
                            .addComponent(nombre)
                            .addComponent(departamento, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apellidos)
                                .addComponent(ciudad)
                                .addComponent(comprobarEmail)
                                .addComponent(verificarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(creaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprobarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(creaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        titulo.getAccessibleContext().setAccessibleName("Registro nuevo usuario");

        panel.add(panelPrincipal, new java.awt.GridBagConstraints());

        bg.add(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost

        if (nombre.getText().equals("")) {
          
            nombre.setBorder(bordeRojo);
            nombre.setText("Nombres: ");

        } else if (nombre.getText() != "") {
            nombreUsuario = nombre.getText();
            nombre.setText(nombreUsuario);
            nombre.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_nombreFocusLost

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

        if (evt.getSource().equals(nombre)) {
            nombre.setText("");

        }
    }//GEN-LAST:event_nombreMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusLost

        if (apellidos.getText().equals("")) {
          
            apellidos.setBorder(bordeRojo);
            apellidos.setText("Apellidos: ");
        } else if (apellidos.getText() != "") {
            apellidosUsuario = apellidos.getText();
            apellidos.setText(apellidosUsuario);
            apellidos.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_apellidosFocusLost

    private void apellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidosMouseClicked
        // TODO add your handling code here:
        if (evt.getSource().equals(apellidos)) {
            apellidos.setText("");

        }
    }//GEN-LAST:event_apellidosMouseClicked

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost

        if (cedula.getText().equals("")) {
         
            cedula.setBorder(bordeRojo);
            cedula.setText("Cedula:");

        } else if (cedula.getText() != "") {
            numeroCedula = cedula.getText();
            cedula.setText(numeroCedula);
            cedula.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_cedulaFocusLost

    private void cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseClicked

        if (evt.getSource().equals(cedula)) {
            cedula.setText("");

        }
    }//GEN-LAST:event_cedulaMouseClicked

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void ciudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ciudadFocusLost

        if (ciudad.getText().equals("")) {
          
            ciudad.setBorder(bordeRojo);
            ciudad.setText("Ciudad:");
        } else if (ciudad.getText() != "") {
            ciudadUsuario = ciudad.getText();
            ciudad.setText(ciudadUsuario);
            ciudad.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_ciudadFocusLost

    private void ciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadMouseClicked

        if (evt.getSource().equals(ciudad)) {
            ciudad.setText("");
        }
    }//GEN-LAST:event_ciudadMouseClicked

    private void emailMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_emailMouseDragged
    private void validandoEmail(String emailEntrante) {

        String validacion = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(validacion);
        Matcher matcher = pattern.matcher(emailEntrante);

        if (matcher.matches() == true) {
            //JOptionPane.showMessageDialog(this, "Email correcto");
            email.setBorder(bordeAzul);
           
        } else {
            if (matcher.matches() == false) {
                email.setBorder(bordeRojo);
            }
        }
    }
    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost

        if (email.getText().equals("")) {
           
            email.setText("email: ");
            email.setBorder(bordeRojo);
        } else if (email.getText() != "email") {
            emailUsuario = email.getText();
            validandoEmail(emailUsuario);

            email.setText(emailUsuario);
             email.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        if (evt.getSource().equals(email)) {
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseClicked

    private void comprobarEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comprobarEmailFocusLost

        if (emailUsuario.equals(comprobarEmail.getText())&& 
                                 !comprobarEmail.getText().equals("")) {
            comprobarEmail.setBorder(bordeAzul);
        } else {
            if(comprobarEmail.getText().equals("")){
                comprobarEmail.setText("email: ");
            
            comprobarEmail.setBorder(bordeRojo);
            }

        }
    }//GEN-LAST:event_comprobarEmailFocusLost

    private void comprobarEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprobarEmailMouseClicked

        if (evt.getSource().equals(comprobarEmail)) {
            comprobarEmail.setText("");
        }
    }//GEN-LAST:event_comprobarEmailMouseClicked

    private void comprobarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprobarEmailActionPerformed

    private void nombreEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEmpresaFocusLost

        if (nombreEmpresa.getText().equals("")) {
            //JOptionPane.showMessageDialog(this, "Campo no valido");
            nombreEmpresa.setBorder(bordeRojo);
            nombreEmpresa.setText("Empresa: ");
        } else if (nombreEmpresa.getText() != "") {
            empresaUsuario = nombreEmpresa.getText();
            nombreEmpresa.setText("Empresa");
            nombreEmpresa.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_nombreEmpresaFocusLost

    private void nombreEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreEmpresaMouseClicked

        if (evt.getSource().equals(nombreEmpresa)) {
            nombreEmpresa.setText("");
        }
    }//GEN-LAST:event_nombreEmpresaMouseClicked

    private void departamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departamentoFocusLost

        if (departamento.getText().equals("")) {
            //JOptionPane.showMessageDialog(this, "Campo no valido");
            departamento.setText("Area operativa ");
            departamento.setBorder(bordeRojo);
        } else if (departamento.getText() != "") {
            localidad = departamento.getText();
            departamento.setText(localidad);
            departamento.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_departamentoFocusLost

    private void departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departamentoMouseClicked

        if (evt.getSource().equals(departamento)) {
            departamento.setText("");
        }
    }//GEN-LAST:event_departamentoMouseClicked

    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        // TODO add your handling code here:
        if (contraseña.getPassword().equals("")) {
            contraseña.setText("password: ******* ");
            contraseña.setBorder(bordeRojo);
        } else if (password != "") {
            password = new String(contraseña.getPassword());
            
            String passworValido = ("^[A-Za-z\\d$@$#_!%*?&]{06,15}$");

            if (password.matches(passworValido) == true) {
                contraseña.setBorder(bordeAzul);
            } else {
                if (password.matches(passworValido) == false) {
                 
                      contraseña.setText("password: ******* ");
                    contraseña.setBorder(bordeRojo);
                }
            }

        }
    }//GEN-LAST:event_contraseñaFocusLost

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
        // TODO add your handling code here:
        if (evt.getSource().equals(contraseña)) {
            contraseña.setText("");
        }
    }//GEN-LAST:event_contraseñaMouseClicked

    private void verificarContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificarContraseñaFocusLost
        String password2 = new String( verificarContraseña.getPassword());
        if (password2.equals(password)&& !password2.equals("")) {
            verificarContraseña.setBorder(bordeAzul);
            System.out.println(password2);
            System.out.println(password);
        } else {
           // JOptionPane.showMessageDialog(this, "Contaseña invalida");
        // if(password2.equals()){
            verificarContraseña.setBorder(bordeRojo);
            verificarContraseña.setText("password: *******");
        //}
        }
    }//GEN-LAST:event_verificarContraseñaFocusLost

    private void verificarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verificarContraseñaMouseClicked

        if (evt.getSource().equals(verificarContraseña)) {
            verificarContraseña.setText("");
        }
    }//GEN-LAST:event_verificarContraseñaMouseClicked

    private void creaRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creaRegistroMouseClicked
        listaNombre.add(nombreUsuario);
        listaApellidos.add(apellidosUsuario);
        cedulaUsuarios.add(numeroCedula);
        listaCiudades.add(ciudadUsuario);
        IdUsiario.add(numeroCedula);
        emailRegistrado.add(emailUsuario);
        contraseñaUsuario.add(password);
        areaOperativa.add(localidad);

    }//GEN-LAST:event_creaRegistroMouseClicked
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    private ArrayList listaNombre = new ArrayList();
    private ArrayList listaApellidos = new ArrayList();
    private ArrayList cedulaUsuarios = new ArrayList();
    private ArrayList listaCiudades = new ArrayList();
    private ArrayList IdUsiario = new ArrayList();
    private ArrayList<String> emailRegistrado = new ArrayList<String>();
    private ArrayList<String> contraseñaUsuario = new ArrayList<String>();
    private ArrayList areaOperativa = new ArrayList();
    private String nombreUsuario="", apellidosUsuario="", numeroCedula="";
    private String ciudadUsuario="", emailUsuario="", contraseñaUsuarioS="";
    private String empresaUsuario="", localidad="", password;
    private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
    private Border bordeAzul = BorderFactory.createLineBorder(Color.BLUE);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField comprobarEmail;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton creaRegistro;
    private javax.swing.JTextField departamento;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreEmpresa;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField verificarContraseña;
    // End of variables declaration//GEN-END:variables

}
