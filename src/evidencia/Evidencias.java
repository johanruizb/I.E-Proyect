/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

/**
 *
 * @author ALOMIA
 */
public class Evidencias extends javax.swing.JFrame {

    /**
     * Creates new form Busqueda
     */
    public Evidencias() {
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

        paneInferior = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelBotonMenu = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        panelBotonArchivos = new javax.swing.JPanel();
        archivo = new javax.swing.JLabel();
        panelBotonAlertas = new javax.swing.JPanel();
        alertas = new javax.swing.JLabel();
        panelBotonConfiguracion = new javax.swing.JPanel();
        configuracion = new javax.swing.JLabel();
        panelSuperior = new javax.swing.JPanel();
        identificacion = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        aprobadas = new javax.swing.JLabel();
        noAprobadas = new javax.swing.JLabel();
        pendientesAprobacion = new javax.swing.JLabel();
        barraBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(501, 288));
        setPreferredSize(new java.awt.Dimension(896, 500));

        paneInferior.setForeground(new java.awt.Color(60, 63, 65));
        paneInferior.setLayout(new java.awt.BorderLayout());

        panelMenu.setForeground(new java.awt.Color(255, 255, 255));
        panelMenu.setBackground(new java.awt.Color(33,150,243));
        panelMenu.setMaximumSize(new java.awt.Dimension(150, 500));
        panelMenu.setMinimumSize(new java.awt.Dimension(70, 500));
        panelMenu.setPreferredSize(new java.awt.Dimension(150, 500));
        panelMenu.setVerifyInputWhenFocusTarget(false);

        panelBotonMenu.setOpaque(false);
        panelBotonMenu.setPreferredSize(new java.awt.Dimension(120, 60));
        panelBotonMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelBotonMenuFocusLost(evt);
            }
        });

        menu.setBackground(new java.awt.Color(33, 150, 243));
        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/Menu_Icon_1.png"))); // NOI18N
        menu.setText("Menú");
        menu.setToolTipText("");
        menu.setPreferredSize(null);
        menu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                menuFocusLost(evt);
            }
        });
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        menu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                menuComponentHidden(evt);
            }
        });
        panelBotonMenu.add(menu);
        menu.getAccessibleContext().setAccessibleName(" Menú");

        panelMenu.add(panelBotonMenu);

        panelBotonArchivos.setOpaque(false);
        panelBotonArchivos.setPreferredSize(new java.awt.Dimension(120, 60));

        archivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        archivo.setForeground(new java.awt.Color(255, 255, 255));
        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        archivo.setText("Achivos");
        archivo.setMaximumSize(new java.awt.Dimension(70, 30));
        archivo.setMinimumSize(new java.awt.Dimension(70, 30));
        archivo.setPreferredSize(null);
        archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                archivoMouseExited(evt);
            }
        });
        panelBotonArchivos.add(archivo);

        panelMenu.add(panelBotonArchivos);

        panelBotonAlertas.setOpaque(false);
        panelBotonAlertas.setPreferredSize(new java.awt.Dimension(120, 60));

        alertas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alertas.setForeground(new java.awt.Color(255, 255, 255));
        alertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/Feedback_Icon_2.png"))); // NOI18N
        alertas.setText("Alertas");
        alertas.setToolTipText("");
        alertas.setMaximumSize(new java.awt.Dimension(70, 30));
        alertas.setMinimumSize(new java.awt.Dimension(70, 30));
        alertas.setPreferredSize(null);
        alertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alertasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alertasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alertasMouseExited(evt);
            }
        });
        panelBotonAlertas.add(alertas);

        panelMenu.add(panelBotonAlertas);

        panelBotonConfiguracion.setOpaque(false);
        panelBotonConfiguracion.setPreferredSize(new java.awt.Dimension(120, 60));

        configuracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        configuracion.setForeground(new java.awt.Color(255, 255, 255));
        configuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Proyecto_EM/Settings_Icon_2.png"))); // NOI18N
        configuracion.setText("Setting");
        configuracion.setToolTipText("");
        configuracion.setAlignmentX(200.0F);
        configuracion.setAlignmentY(100.0F);
        configuracion.setMaximumSize(new java.awt.Dimension(70, 30));
        configuracion.setMinimumSize(new java.awt.Dimension(70, 30));
        configuracion.setPreferredSize(null);
        configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                configuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                configuracionMouseExited(evt);
            }
        });
        panelBotonConfiguracion.add(configuracion);

        panelMenu.add(panelBotonConfiguracion);

        paneInferior.add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelSuperior.setForeground(new java.awt.Color(60, 63, 65));
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        identificacion.setBackground(new java.awt.Color(255, 255, 255));
        identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        identificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        identificacion.setText("  ID");
        identificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        identificacion.setPreferredSize(new java.awt.Dimension(50, 40));
        identificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                identificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                identificacionMouseExited(evt);
            }
        });
        panelSuperior.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, -1));
        identificacion.getAccessibleContext().setAccessibleName("");

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });
        panelSuperior.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, 40));

        aprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aprobadas.setText("Evidencias aprobadas");
        aprobadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelSuperior.add(aprobadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 30));

        noAprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noAprobadas.setText("Evidencias no aprobadas");
        noAprobadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelSuperior.add(noAprobadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, 30));

        pendientesAprobacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendientesAprobacion.setText("Evidencias pendientes");
        pendientesAprobacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelSuperior.add(pendientesAprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 130, 30));

        barraBusqueda.setBackground(new java.awt.Color(214, 214, 214));
        barraBusqueda.setText("Buscar...");
        barraBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        barraBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                barraBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                barraBusquedaFocusLost(evt);
            }
        });
        barraBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barraBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barraBusquedaMouseExited(evt);
            }
        });
        barraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barraBusquedaKeyPressed(evt);
            }
        });
        panelSuperior.add(barraBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 430, 40));

        paneInferior.add(panelSuperior, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        // TODO add your handling code here:
        menu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menu.setOpaque(true);
        //menu.setBackground(new Color(187, 187, 187));
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        // TODO add your handling code here:
        menu.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
       // menu.setBackground(new Color(33, 150, 243));
    }//GEN-LAST:event_menuMouseExited

    private void archivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseEntered
        // TODO add your handling code here:
        archivo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_archivoMouseEntered

    private void archivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseExited
        // TODO add your handling code here:
        archivo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_archivoMouseExited

    private void alertasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertasMouseEntered
        // TODO add your handling code here:
        alertas.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_alertasMouseEntered

    private void alertasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertasMouseExited
        // TODO add your handling code here:
        alertas.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_alertasMouseExited

    private void configuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseEntered
        // TODO add your handling code here:
        configuracion.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_configuracionMouseEntered

    private void configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseExited
        // TODO add your handling code here:
        configuracion.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_configuracionMouseExited

    private void identificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseEntered
        // TODO add your handling code here:
        identificacion.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_identificacionMouseEntered

    private void identificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseExited
        // TODO add your handling code here:
        identificacion.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_identificacionMouseExited

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        // TODO add your handling code here:
        buscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        // TODO add your handling code here:
        buscar.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_buscarMouseExited

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
        contador++;
        menu.setOpaque(true);
        archivo.setOpaque(true);
        alertas.setOpaque(true);
        configuracion.setOpaque(true);
        archivo.setText("");
        alertas.setText("");
        configuracion.setText("");
        menu.setText("");
        
        menu.setBackground(new Color(33, 150, 243));
        archivo.setBackground(new Color(33, 150, 243));
        alertas.setBackground(new Color(33, 150, 243));
        configuracion.setBackground(new Color(33, 150, 243));
        System.out.println("evidencia.Evidencias.menuMouseClicked()");
        
        panelMenu.setPreferredSize(new Dimension(70, 500));
        panelMenu.repaint();
        panelMenu.revalidate();
        restableserMenu(contador);
      
    }//GEN-LAST:event_menuMouseClicked

    private void menuComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_menuComponentHidden
        // TODO add your handling code here:

    }//GEN-LAST:event_menuComponentHidden

    private void archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseClicked
        // TODO add your handling code here:
        contador++;
        menu.setOpaque(true);
        archivo.setOpaque(true);
        alertas.setOpaque(true);
        configuracion.setOpaque(true);
        archivo.setText("");
        alertas.setText("");
        configuracion.setText("");
        menu.setText("");
        menu.setBackground(new Color(33, 150, 243));
        archivo.setBackground(new Color(33, 150, 243));
        alertas.setBackground(new Color(33, 150, 243));
        configuracion.setBackground(new Color(33, 150, 243));
        panelMenu.setPreferredSize(new Dimension(70, 500));
        panelBotonArchivos.repaint();
        panelBotonArchivos.revalidate();
        restableserMenu(contador);
        
    }//GEN-LAST:event_archivoMouseClicked

    private void alertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alertasMouseClicked
        // TODO add your handling code here:
        contador++;
        alertas.setOpaque(true);
        archivo.setText("");
        alertas.setText("");
        configuracion.setText("");
        menu.setText("");
        menu.setBackground(new Color(33, 150, 243));
        archivo.setBackground(new Color(33, 150, 243));
        alertas.setBackground(new Color(33, 150, 243));
        configuracion.setBackground(new Color(33, 150, 243));
        
        panelMenu.setPreferredSize(new Dimension(70, 500));
       // alertas.setBackground(new Color(33, 150, 243));
        panelBotonAlertas.repaint();
        panelBotonAlertas.revalidate();
        restableserMenu(contador);
    }//GEN-LAST:event_alertasMouseClicked

    private void configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseClicked
        // TODO add your handling code here:
        contador++;
        archivo.setText("");
        alertas.setText("");
        configuracion.setText("");
        menu.setText("");
        menu.setBackground(new Color(33, 150, 243));
        archivo.setBackground(new Color(33, 150, 243));
        alertas.setBackground(new Color(33, 150, 243));
        configuracion.setBackground(new Color(33, 150, 243));
        
        panelMenu.setPreferredSize(new Dimension(70, 500));
        panelBotonConfiguracion.repaint();
        panelBotonConfiguracion.revalidate();
        restableserMenu(contador);
        
    }//GEN-LAST:event_configuracionMouseClicked
     //restaura el panel de menu a las condiciones estandar
    private void restableserMenu(int con){
        if(contador==2){
        archivo.setText("Archivos");
        alertas.setText("Alertas");
        configuracion.setText("Setting");
        menu.setText("Menú");
        menu.setBackground(new Color(33, 150, 243));
        archivo.setBackground(new Color(33, 150, 243));
        alertas.setBackground(new Color(33, 150, 243));
        configuracion.setBackground(new Color(33, 150, 243));

        panelMenu.setPreferredSize(new Dimension(150, 500));
        panelMenu.repaint();
        panelMenu.revalidate();
        panelBotonArchivos.setPreferredSize(new Dimension(120, 70));
        panelBotonArchivos.repaint();
        panelBotonArchivos.revalidate();
        panelBotonAlertas.setPreferredSize(new Dimension(120, 70));
        panelBotonAlertas.repaint();
        panelBotonAlertas.revalidate();
        panelBotonConfiguracion.setPreferredSize(new Dimension(120, 70));
        panelBotonConfiguracion.repaint();
        panelBotonConfiguracion.revalidate();
        contador=0;
        }
}
    private void menuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuFocusLost
        // TODO add your handling code here: 
    }//GEN-LAST:event_menuFocusLost

    private void barraBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBusquedaMouseEntered
        // TODO add your handling code here:
        barraBusqueda.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_barraBusquedaMouseEntered

    private void barraBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBusquedaMouseExited
        // TODO add your handling code here:
            barraBusqueda.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_barraBusquedaMouseExited

    private void panelBotonMenuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelBotonMenuFocusLost
    
    }//GEN-LAST:event_panelBotonMenuFocusLost

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
      
       if(barraBusqueda.getText().equals("")){
        barraBusqueda.setText("Buscar...");
        //System.out.println("basio");
        }else{
            if(buscando !="") barraBusqueda.setText(buscando);
              buscando = barraBusqueda.getText();
              System.out.println(buscando);
             //System.out.println("entrando en el esle");
             buscando ="";
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void barraBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBusquedaFocusGained
        barraBusqueda.setCursor(new Cursor(Cursor.TEXT_CURSOR));
   
        
        
    }//GEN-LAST:event_barraBusquedaFocusGained

    private void barraBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBusquedaFocusLost
        // TODO add your handling code here:
        if(barraBusqueda.equals("Buscar")|| barraBusqueda.equals("")){
          barraBusqueda.setText("Buscar...");
        }
        
    }//GEN-LAST:event_barraBusquedaFocusLost

    private void barraBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBusquedaMouseClicked
        // TODO add your handling code here:
        barraBusqueda.setText("");
    }//GEN-LAST:event_barraBusquedaMouseClicked

    private void barraBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            System.out.println("Enter funcionando");
        }
    }//GEN-LAST:event_barraBusquedaKeyPressed

    /**
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
            java.util.logging.Logger.getLogger(Evidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evidencias().setVisible(true);
            }
        });
    }
  private static int contador=0;
  private String buscando ="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertas;
    private javax.swing.JLabel aprobadas;
    private javax.swing.JLabel archivo;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel configuracion;
    private javax.swing.JLabel identificacion;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel noAprobadas;
    private javax.swing.JPanel paneInferior;
    private javax.swing.JPanel panelBotonAlertas;
    private javax.swing.JPanel panelBotonArchivos;
    private javax.swing.JPanel panelBotonConfiguracion;
    private javax.swing.JPanel panelBotonMenu;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel pendientesAprobacion;
    // End of variables declaration//GEN-END:variables
}
