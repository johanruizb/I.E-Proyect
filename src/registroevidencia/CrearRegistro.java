/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registroevidencia;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;

/**
 *
 * @author ALOMIA
 */
public class CrearRegistro extends javax.swing.JFrame {

    private javax.swing.JPanel backPanel;
    private javax.swing.JButton trabajoAprobado, trabajoRechazado, botonAprobado,
            botonRechazada;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField tipoTrabajo;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JTextField numeroInforme, numeroRegistro, selecinarFecha;
    private javax.swing.JTextField ciudadOperacion, fechaRegistroInformacion;
    //  private javax.swing.JPanel jPanel1,contenedorComponentes;

    /**
     * Creates new form CrearRegistro
     */
    public CrearRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagConstraints gridBagConstraints;
        //instanciando componentes
        backPanel = new javax.swing.JPanel();//panel1
        backPanel.setLayout(new GridBagLayout());
        numeroRegistro = new javax.swing.JTextField();//identificador registro
        numeroInforme = new javax.swing.JTextField();//numero de informe
        trabajoAprobado = new javax.swing.JButton();//trabajo aprobado
        trabajoRechazado = new javax.swing.JButton();//trabajo rechazada
        observaciones = new javax.swing.JTextArea();//observaciones
        scroll = new javax.swing.JScrollPane();//escroll observaciones
        selecinarFecha = new javax.swing.JTextField();//selector fecha
        tipoTrabajo = new javax.swing.JTextField();//tipo traabajo realizado
        ciudadOperacion = new javax.swing.JTextField();//ciudad de operacion
        fechaRegistroInformacion = new javax.swing.JTextField();
        botonRechazada = new javax.swing.JButton();//boton para no aprobar evidencia
        botonAprobado = new javax.swing.JButton();//boton para aprobar evidencia
       //=======================================================================
        numeroRegistro.setColumns(20);
        numeroRegistro.setText("ID: numero contrato");
        numeroRegistro.setMinimumSize(new java.awt.Dimension(700, 50));
        numeroRegistro.setPreferredSize(new java.awt.Dimension(700, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        backPanel.add(numeroRegistro, gridBagConstraints);
        //======================================================================
        numeroInforme.setColumns(20);
        numeroInforme.setText("Rf: numero referencia");
        numeroInforme.setMinimumSize(new java.awt.Dimension(700, 50));
        numeroInforme.setPreferredSize(new java.awt.Dimension(700, 50));
        numeroInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaEvidenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        backPanel.add(numeroInforme, gridBagConstraints);
         //===================================================================
        trabajoAprobado.setText("Registro Aprobado");
        trabajoAprobado.setMaximumSize(new java.awt.Dimension(150, 50));
        trabajoAprobado.setMinimumSize(new java.awt.Dimension(150, 50));
        trabajoAprobado.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        backPanel.add(trabajoAprobado, gridBagConstraints);
        //===================================================================
        botonRechazada.setText("Registro no aprobado");
       // botonRechazada.setMaximumSize(new java.awt.Dimension(50, 50));
       // botonRechazada.setMinimumSize(new java.awt.Dimension(50, 50));
       botonRechazada.setPreferredSize(new java.awt.Dimension(50, 50));
        botonRechazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noAprobadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
         
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(botonRechazada, gridBagConstraints);
        //===================================================================
        scroll.setPreferredSize(new java.awt.Dimension(10, 100));
        observaciones.setColumns(10);
        observaciones.setRows(10);
        observaciones.setTabSize(10);
        observaciones.setLineWrap(true);
        observaciones.setText("Esta es el area de observaciones del componenete");    
        //====================================================================
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        scroll.getViewport().setOpaque(false);//ELIMINA EL ENMARCADO DEL SCROLL
        scroll.setOpaque(false); // SE LE QUITA LA OPACIDAD AL COMPONENTE
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0));
        scroll.getVerticalScrollBar().setOpaque(false);
        scroll.setViewportView(observaciones);
        //scroll.setBorder(null);// SIN BORDE
        backPanel.add(scroll, gridBagConstraints);
        //=================================================================
        selecinarFecha.setText("Seleccionar fecha ejecucion");
        selecinarFecha.setMaximumSize(new java.awt.Dimension(700, 50));
        selecinarFecha.setMinimumSize(new java.awt.Dimension(700, 50));
        selecinarFecha.setPreferredSize(new java.awt.Dimension(700, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(selecinarFecha, gridBagConstraints);
        //============================================================
        tipoTrabajo.setText("Seleccion tipo de trabajo");
        tipoTrabajo.setMaximumSize(new java.awt.Dimension(700, 50));
        tipoTrabajo.setMinimumSize(new java.awt.Dimension(700, 50));
        tipoTrabajo.setPreferredSize(new java.awt.Dimension(700, 50));
        tipoTrabajo.setSelectionEnd(27);
        tipoTrabajo.setSelectionStart(27);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(tipoTrabajo, gridBagConstraints);
        //=================================================================
        ciudadOperacion.setText("Cali, valle");
        ciudadOperacion.setMaximumSize(new java.awt.Dimension(700, 50));
        ciudadOperacion.setMinimumSize(new java.awt.Dimension(700, 50));
        ciudadOperacion.setPreferredSize(new java.awt.Dimension(700, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(ciudadOperacion, gridBagConstraints);
        //=====================================================================
        fechaRegistroInformacion.setText("25/30/2026");
        fechaRegistroInformacion.setMaximumSize(new java.awt.Dimension(700, 50));
        fechaRegistroInformacion.setMinimumSize(new java.awt.Dimension(700, 50));
        fechaRegistroInformacion.setPreferredSize(new java.awt.Dimension(700, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(fechaRegistroInformacion, gridBagConstraints);
        //=====================================================================
        trabajoRechazado.setText("No aprobada");
        trabajoRechazado.setMaximumSize(new java.awt.Dimension(150, 50));
        trabajoRechazado.setMinimumSize(new java.awt.Dimension(150, 50));
        trabajoRechazado.setOpaque(true);
        trabajoRechazado.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(trabajoRechazado, gridBagConstraints);
        //======================================================================
        botonAprobado.setText("Aprobada");
        botonAprobado.setMaximumSize(new java.awt.Dimension(150, 50));
        botonAprobado.setMinimumSize(new java.awt.Dimension(150, 50));
        botonAprobado.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(botonAprobado, gridBagConstraints);
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noAprobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noAprobadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noAprobadoActionPerformed

    private void referenciaEvidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaEvidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaEvidenciaActionPerformed

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
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
