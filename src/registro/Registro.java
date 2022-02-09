package registro;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class Registro extends javax.swing.JFrame {

    private Object pattern;

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        creaRegistro = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 650));
        setName("Registro"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 0, 255));
        nombre.setText("nombre");
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
        apellidos.setForeground(new java.awt.Color(0, 0, 204));
        apellidos.setText("apellidos:");
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
        cedula.setForeground(new java.awt.Color(51, 0, 204));
        cedula.setText("ID usuario:");
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
        ciudad.setForeground(new java.awt.Color(51, 0, 204));
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
        email.setForeground(new java.awt.Color(51, 0, 204));
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
        comprobarEmail.setForeground(new java.awt.Color(51, 0, 204));
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
        nombreEmpresa.setForeground(new java.awt.Color(51, 0, 204));
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
        departamento.setForeground(new java.awt.Color(51, 0, 204));
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
        contraseña.setForeground(new java.awt.Color(51, 0, 204));
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
        verificarContraseña.setForeground(new java.awt.Color(51, 0, 204));
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

        creaRegistro.setBackground(new java.awt.Color(51, 0, 204));
        creaRegistro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        creaRegistro.setForeground(new java.awt.Color(51, 0, 204));
        creaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creaRegistro.setText("crear registro");
        creaRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 2, true));
        creaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creaRegistroMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 0, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro de usario");

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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(creaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
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

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void comprobarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprobarEmailActionPerformed

    private void creaRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creaRegistroMouseClicked
        // TODO add your handling code here:  
        listaNombre.add(nombreUsuario);
        listaApellidos.add(apellidosUsuario);
        cedulaUsuarios.add(numeroCedula);
        emailRegistrado.add(emailUsuario);
        contraseñaUsuario.add(password);
        areaOperativa.add(departamento);
        imprimeNombre();
        imprimeApellido();
        imprimeCedula();
        imprimeEmail();
        imprimeContraseña();
        imprimeAreaOperativa();
    }//GEN-LAST:event_creaRegistroMouseClicked

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

        if (evt.getSource().equals(nombre)) {
            nombre.setText("");

        }
    }//GEN-LAST:event_nombreMouseClicked

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost

        if (nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nombre no valido");
            nombre.setBorder(bordeRojo);
            nombre.setText("Nombres: ");

        } else if (nombre.getText() != "") {
            nombreUsuario = nombre.getText();
            nombre.setText(nombreUsuario);
            nombre.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_nombreFocusLost
    private void imprimeNombre() {
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i));
        }

    }

    private void apellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidosMouseClicked
        // TODO add your handling code here:
        if (evt.getSource().equals(apellidos)) {
            apellidos.setText("");

        }
    }//GEN-LAST:event_apellidosMouseClicked

    private void apellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusLost

        if (apellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Apellido no valido");
            apellidos.setBorder(bordeRojo);
            apellidos.setText("Apellidos: ");
        } else if (apellidos.getText() != "") {
            apellidosUsuario = apellidos.getText();
            apellidos.setText(apellidosUsuario);
            apellidos.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_apellidosFocusLost
    private void imprimeApellido() {
        for (int i = 0; i < listaApellidos.size(); i++) {
            System.out.println(listaApellidos.get(i));
        }
    }
    private void cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseClicked

        if (evt.getSource().equals(cedula)) {
            cedula.setText("");

        }
    }//GEN-LAST:event_cedulaMouseClicked

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost

        if (cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Identificación no valida");
            cedula.setBorder(bordeRojo);
            cedula.setText("Cedula:");

        } else if (cedula.getText() != "") {
            numeroCedula = cedula.getText();
            cedula.setText(numeroCedula);
            cedula.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_cedulaFocusLost
    private void imprimeCedula() {
        for (int i = 0; i < cedulaUsuarios.size(); i++) {
            System.out.println(cedulaUsuarios.get(i));
        }

    }
    private void ciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadMouseClicked

        if (evt.getSource().equals(ciudad)) {
            ciudad.setText("");
        }
    }//GEN-LAST:event_ciudadMouseClicked

    private void ciudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ciudadFocusLost

        if (ciudad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo no valido");
            ciudad.setBorder(bordeRojo);
            ciudad.setText("Ciudad:");
        } else if (ciudad.getText() != "") {
            ciudadUsuario = ciudad.getText();
            ciudad.setText(ciudadUsuario);
            ciudad.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_ciudadFocusLost

    private void emailMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_emailMouseDragged

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost

        if (email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email invalido");
            email.setText("email: ");

        } else if (email.getText() != "email") {
            emailUsuario = email.getText();
            validandoEmail(emailUsuario);
            /*String validacion = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
             Pattern pattern = Pattern.compile(validacion);
              Matcher matcher = pattern.matcher(emailUsuario); 
              if(matcher.matches()!=true){
                  JOptionPane.showMessageDialog(this, "Correcto");
              }else{
                  if(matcher.matches()==false){
                      JOptionPane.showMessageDialog(this, "Correcto");
                  }
              }*/
            //System.out.println( emailUsuario +" : "+ matcher.matches()+"\n");

            email.setText(emailUsuario);
        }
    }//GEN-LAST:event_emailFocusLost
    private void validandoEmail(String emailEntrante) {

        String validacion = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(validacion);
        Matcher matcher = pattern.matcher(emailEntrante);

        if (matcher.matches() == true) {
            //JOptionPane.showMessageDialog(this, "Email correcto");
            email.setBorder(bordeAzul);
            // System.out.println(email +" : "+ matcher.matches()+"\n");

        } else {
            if (matcher.matches() == false) {
                JOptionPane.showMessageDialog(this, "Email incorrecto");
                email.setBorder(bordeRojo);
            }
        }
    }

    private void imprimeEmail() {
        for (int i = 0; i < emailRegistrado.size(); i++) {
            System.out.println(emailRegistrado.get(i));
        }
    }

    private void comprobarEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprobarEmailMouseClicked

        if (evt.getSource().equals(email)) {
            email.setText("");
        }
    }//GEN-LAST:event_comprobarEmailMouseClicked

    private void comprobarEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comprobarEmailFocusLost

        if (emailUsuario.equals(comprobarEmail.getText())) {
            comprobarEmail.setBorder(bordeAzul);
        } else {
            JOptionPane.showMessageDialog(this, "El Email es incorrecto");
            comprobarEmail.setBorder(bordeRojo);

        }

    }//GEN-LAST:event_comprobarEmailFocusLost

    private void nombreEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreEmpresaMouseClicked

        if (evt.getSource().equals(nombreEmpresa)) {
            nombreEmpresa.setText("");
        }
    }//GEN-LAST:event_nombreEmpresaMouseClicked

    private void nombreEmpresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEmpresaFocusLost

        if (nombreEmpresa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo no valido");
            nombreEmpresa.setBorder(bordeRojo);
            nombreEmpresa.setText("Empresa: ");
        } else if (nombreEmpresa.getText() != "") {
            empresaUsuario = nombreEmpresa.getText();
            nombreEmpresa.setText("Empresa");
            nombreEmpresa.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_nombreEmpresaFocusLost

    private void departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departamentoMouseClicked

        if (evt.getSource().equals(departamento)) {
            departamento.setText("");
        }
    }//GEN-LAST:event_departamentoMouseClicked

    private void departamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departamentoFocusLost

        if (departamento.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo no valido");
            departamento.setText("Area operativa ");
            departamento.setBorder(bordeRojo);
        } else if (departamento.getText() != "") {
            localidad = departamento.getText();
            departamento.setText(localidad);
            departamento.setBorder(bordeAzul);
        }
    }//GEN-LAST:event_departamentoFocusLost
    private void imprimeAreaOperativa() {
        for (int i = 0; i < areaOperativa.size(); i++) {
            System.out.println(areaOperativa.get(i));
        }
    }
    private void verificarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verificarContraseñaMouseClicked

        if (evt.getSource().equals(verificarContraseña)) {
            verificarContraseña.setText("");
        }
    }//GEN-LAST:event_verificarContraseñaMouseClicked

    private void verificarContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificarContraseñaFocusLost
        String password2 = new String(contraseña.getPassword());
        if (password2.equals(password)) {
            verificarContraseña.setBorder(bordeAzul);
            //System.out.println(password2);
        } else {
            JOptionPane.showMessageDialog(this, "Contaseña invalida");
            verificarContraseña.setBorder(bordeRojo);
        }
    }//GEN-LAST:event_verificarContraseñaFocusLost

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
        // TODO add your handling code here:
        if (evt.getSource().equals(contraseña)) {
            contraseña.setText("");
        }
    }//GEN-LAST:event_contraseñaMouseClicked
    /*
          un dígito debe aparecer al menos una vez
           puede tener mayusculas y minisculas
         
          no se permite ningún espacio en blanco en toda la cadena
           al debe tener minimo 6 caracteres maximo 15 caracteres
     */
    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        // TODO add your handling code here:
        if (contraseña.getPassword().equals("")) {
            contraseña.setText("password: ******* ");
            contraseña.setBorder(bordeRojo);
        } else if (password != "") {
            password = new String(contraseña.getPassword());
            // System.out.println("Soy passwor " + password);
            //String passwd = password;  
            String passworValido = ("^[A-Za-z\\d$@$#_!%*?&]{06,15}$");

            if (password.matches(passworValido) == true) {
                contraseña.setBorder(bordeAzul);
            } else {
                if (password.matches(passworValido) == false) {
                    JOptionPane.showMessageDialog(this, "debe tenerma caracteres alfanumericos"
                            + "y ser mayor a 8");
                    contraseña.setBorder(bordeRojo);
                }
            }

        }
    }//GEN-LAST:event_contraseñaFocusLost
    private void imprimeContraseña() {
        for (int i = 0; i < contraseñaUsuario.size(); i++) {
            System.out.println(contraseñaUsuario.get(i));
        }
    }
    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        if (evt.getSource().equals(email)) {
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseClicked

    private ArrayList listaNombre = new ArrayList();
    private ArrayList listaApellidos = new ArrayList();
    private ArrayList cedulaUsuarios = new ArrayList();
    private ArrayList listaCiudades = new ArrayList();
    private ArrayList IdUsiario = new ArrayList();
    private ArrayList<String> emailRegistrado = new ArrayList<String>();
    private ArrayList<String> contraseñaUsuario = new ArrayList<String>();
    private ArrayList areaOperativa = new ArrayList();
    private String nombreUsuario, apellidosUsuario, numeroCedula;
    private String ciudadUsuario, emailUsuario, contraseñaUsuarioS;
    private String empresaUsuario, localidad, password;
    private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
    private Border bordeAzul = BorderFactory.createLineBorder(Color.BLUE);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField comprobarEmail;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel creaRegistro;
    private javax.swing.JTextField departamento;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreEmpresa;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField verificarContraseña;
    // End of variables declaration//GEN-END:variables
}
