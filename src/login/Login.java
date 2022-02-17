/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import db.BaseDatos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import registro.Registro;

/**
 *
 * @author jr0237
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        bg = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        entradas = new javax.swing.JPanel();
        correo = new javax.swing.JTextField();
        iconEmail = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        recordar = new javax.swing.JCheckBox();
        registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(501, 288));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(869, 500));
        bg.setLayout(new javax.swing.BoxLayout(bg, javax.swing.BoxLayout.LINE_AXIS));
        bg.setSize(new Dimension(501,288));

        panel.setPreferredSize(new java.awt.Dimension(235, 375));
        panel.setLayout(new java.awt.GridBagLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/1.png"))); // NOI18N
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
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(ingresar, gridBagConstraints);

        entradas.setOpaque(false);
        entradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoMouseClicked(evt);
            }
        });
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        entradas.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 36));

        iconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/correo.png"))); // NOI18N
        entradas.add(iconEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/password.png"))); // NOI18N
        entradas.add(iconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setText("Contraseña");
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
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
        recordar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        recordar.setNextFocusableComponent(ingresar);
        recordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(recordar, gridBagConstraints);

        registro.setText("No tienes un usuario? Registrate aqui.");
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        panel.add(registro, gridBagConstraints);

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

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
        ingresar.setEnabled(false);

        String email = !"Correo o usuario".equals(correo.getText())
                ? correo.getText()
                : "NONE";

        String contraseña = !"Contraseña".equals(String.valueOf(this.contraseña.getPassword()))
                ? String.valueOf(this.contraseña.getPassword())
                : "NONE";

        BaseDatos.conectarBD();
        if (BaseDatos.iniciarSesion(email, contraseña)) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña erronea o usuario inexistente");
        }
        defaultText();

        ingresar.setEnabled(true);
    }//GEN-LAST:event_ingresarActionPerformed

    private void recordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordarActionPerformed
        // TODO add your handling code here:
        defaultText();
    }//GEN-LAST:event_recordarActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseClicked
        // TODO add your handling code here:
        defaultText();
        if ("Correo o usuario".equals(correo.getText())) {
            correo.setText("");
            correo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_correoMouseClicked

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
        // TODO add your handling code here:
        defaultText();
        if ("Contraseña".equals(String.valueOf(contraseña.getPassword()))) {
            contraseña.setText("");
            contraseña.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_contraseñaMouseClicked

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        // TODO add your handling code here:

        {
            /*Ocultar o destruir ventana actual*/
            this.dispose();

            /* Crear y mostrar el registro */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Registro().setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_registroMouseClicked

    private void registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseEntered
        // TODO add your handling code here:
        registro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registroMouseEntered

    private void registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseExited
        // TODO add your handling code here:
        registro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registroMouseExited
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JPanel entradas;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconPass;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JCheckBox recordar;
    private javax.swing.JLabel registro;
    // End of variables declaration//GEN-END:variables
}
