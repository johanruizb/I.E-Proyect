/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence.manager;

import java.awt.Color;

/**
 *
 * @author ALOMIA
 */
public class Busqueda extends javax.swing.JFrame {

    /**
     * Creates new form Busqueda
     */
    public Busqueda() {
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

        panelPrincipal = new javax.swing.JPanel();
        barraBusqueda = new javax.swing.JTextField();
        idRegistros = new javax.swing.JLabel();
        lupa = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        registros = new javax.swing.JLabel();
        notificaciones = new javax.swing.JLabel();
        configuracion = new javax.swing.JLabel();
        aprobadas = new javax.swing.JLabel();
        enAprobacion = new javax.swing.JLabel();
        rechazadas = new javax.swing.JLabel();
        mostrarRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        barraBusqueda.setText("Buscar...");
        barraBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(barraBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, 340, 40));

        idRegistros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        idRegistros.setForeground(new java.awt.Color(0, 0, 0));
        idRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        idRegistros.setText("ID");
        idRegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(idRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 40));

        lupa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        lupa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 60, 40));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(51, 102, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu (2).png"))); // NOI18N
        menu.setText("    Menú");
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        menu.setDoubleBuffered(true);
        panelPrincipal.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 70));

        registros.setBackground(new java.awt.Color(255, 255, 255));
        registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        registros.setForeground(new java.awt.Color(51, 102, 255));
        registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo (1).png"))); // NOI18N
        registros.setText("  Registros");
        registros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        registros.setPreferredSize(new java.awt.Dimension(608, 360));
        registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrosMouseClicked(evt);
            }
        });
        panelPrincipal.add(registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 70));

        notificaciones.setBackground(new java.awt.Color(255, 255, 255));
        notificaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        notificaciones.setForeground(new java.awt.Color(51, 102, 255));
        notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/darse-cuenta (1).png"))); // NOI18N
        notificaciones.setText("  Notificatión");
        notificaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        notificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificacionesMouseClicked(evt);
            }
        });
        panelPrincipal.add(notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, 70));

        configuracion.setBackground(new java.awt.Color(255, 255, 255));
        configuracion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        configuracion.setForeground(new java.awt.Color(51, 102, 255));
        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion (1).png"))); // NOI18N
        configuracion.setText("  Settin");
        configuracion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 70));

        aprobadas.setBackground(new java.awt.Color(51, 0, 255));
        aprobadas.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        aprobadas.setForeground(new java.awt.Color(0, 0, 0));
        aprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aprobadas.setText("Aprobadas");
        aprobadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(aprobadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, 30));

        enAprobacion.setBackground(new java.awt.Color(51, 0, 204));
        enAprobacion.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        enAprobacion.setForeground(new java.awt.Color(0, 0, 0));
        enAprobacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enAprobacion.setText(" En aprobación");
        enAprobacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(enAprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, 30));

        rechazadas.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        rechazadas.setForeground(new java.awt.Color(0, 0, 0));
        rechazadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rechazadas.setText("Rechazadas");
        rechazadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelPrincipal.add(rechazadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 110, 30));

        mostrarRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mostrarRegistro.setForeground(new java.awt.Color(0, 0, 0));
        mostrarRegistro.setText("ID: 201943");
        panelPrincipal.add(mostrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 280, 40));

        jLabel1.setText("parte dos");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 170, 40));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrosMouseClicked
        // TODO add your handling code here:
        System.out.println("Escucho");
        if(evt.getSource().equals(registros)){
            registros.setBackground(new Color(51,102,255));
        }
    }//GEN-LAST:event_registrosMouseClicked

    private void notificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificacionesMouseClicked
        // TODO add your handling code here:
          System.out.println("Escucho");
        if(evt.getSource().equals(notificaciones)){
            notificaciones.setBackground(new Color(51,102,255));
        }
       
    }//GEN-LAST:event_notificacionesMouseClicked

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aprobadas;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JLabel configuracion;
    private javax.swing.JLabel enAprobacion;
    private javax.swing.JLabel idRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lupa;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel mostrarRegistro;
    private javax.swing.JLabel notificaciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel rechazadas;
    private javax.swing.JLabel registros;
    // End of variables declaration//GEN-END:variables
}
