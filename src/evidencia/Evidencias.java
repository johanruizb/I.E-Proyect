package evidencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.Vector;
import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 *
 * @author ALOMIA
 */
public class Evidencias extends JFrame {

    private JLabel configuracion, alertas, archivo, menu;

    private JButton crearEvidencia;
    private JPanel panelMenu, contPanel, boxPanel, centralPanel;
    private JScrollPane scroll;

    private final EscuchaMouse listenerMouse = new EscuchaMouse();
    private boolean menuRetraido = false;

    public Evidencias() {
        initComponents();
        addComponent();
    }

    private void addComponent() {

        System.out.println("Agregando...");

        Vector<ManejadorEvidencia> evidencias = new Vector<ManejadorEvidencia>();

        for (int i = 0; i < 10; i++) {
            evidencias.add(new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO"));
        }

        for (ManejadorEvidencia ev1 : evidencias) {
            boxPanel.add(ev1);
        }

        repaint();
        revalidate();
    }

    private void initComponents() {


        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(0, 0));

        panelMenu = new JPanel();
        menu = new JLabel();
        archivo = new JLabel();
        alertas = new JLabel();
        configuracion = new JLabel();
        contPanel = new JPanel(new BorderLayout());
        scroll = new JScrollPane();
        boxPanel = new JPanel();
        centralPanel = new JPanel();
        crearEvidencia = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(new Point(0, 0));
        setMinimumSize(new Dimension(501, 288));
        setPreferredSize(new Dimension(896, 500));

        contPanel.setPreferredSize(new Dimension(722, 1200));
        contPanel.setBackground(Color.BLACK);

        panelMenu.setForeground(new Color(255, 255, 255));
        panelMenu.setBackground(new Color(33, 150, 243));
        panelMenu.setMaximumSize(new Dimension(150, 500));
        panelMenu.setMinimumSize(new Dimension(70, 500));
        panelMenu.setPreferredSize(new Dimension(150, 500));
        panelMenu.setVerifyInputWhenFocusTarget(false);

        menu.setBackground(new Color(33, 150, 243));
        menu.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        menu.setForeground(new Color(255, 255, 255));
        menu.setHorizontalAlignment(SwingConstants.LEFT);
        menu.setIcon(new ImageIcon(getClass().getResource("/imagenes2/Menu_Icon_1.png"))); // NOI18N
        menu.setText("Menú    ");
        menu.setToolTipText("");
        menu.setPreferredSize(null);
        menu.addMouseListener(listenerMouse);

        panelMenu.add(menu);
        panelMenu.add(createSeparator());

        archivo.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        archivo.setForeground(new Color(255, 255, 255));
        archivo.setHorizontalAlignment(SwingConstants.LEFT);
        archivo.setIcon(new ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        archivo.setText("Achivos");
        archivo.setMaximumSize(new Dimension(70, 30));
        archivo.setMinimumSize(new Dimension(70, 30));
        archivo.setPreferredSize(null);

        panelMenu.add(archivo);
        panelMenu.add(createSeparator());

        alertas.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        alertas.setForeground(new Color(255, 255, 255));
        alertas.setHorizontalAlignment(SwingConstants.LEFT);
        alertas.setIcon(new ImageIcon(getClass().getResource("/imagenes2/Feedback_Icon_2.png"))); // NOI18N

        alertas.setText("Alertas");
        alertas.setToolTipText("");
        alertas.setMaximumSize(new Dimension(70, 30));
        alertas.setMinimumSize(new Dimension(70, 30));
        alertas.setPreferredSize(null);

        panelMenu.add(alertas);
        panelMenu.add(createSeparator());


        configuracion.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        configuracion.setForeground(new Color(255, 255, 255));
        configuracion.setHorizontalAlignment(SwingConstants.LEFT);
        configuracion.setIcon(new ImageIcon(getClass().getResource("/imagenes2/Settings_Icon_2.png"))); // NOI18N
        configuracion.setText("Ajustes");

        configuracion.setAlignmentX(200.0F);
        configuracion.setAlignmentY(100.0F);
        configuracion.setMaximumSize(new Dimension(70, 30));
        configuracion.setMinimumSize(new Dimension(70, 30));
        configuracion.setPreferredSize(null);

        panelMenu.add(configuracion);

        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));
        scroll.getVerticalScrollBar().setOpaque(false);
        scroll.setBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(50);


        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        scroll.setViewportView(boxPanel);

        crearEvidencia.setBackground(new Color(33, 150, 243));
        crearEvidencia.setForeground(new Color(255, 255, 255));
        crearEvidencia.setIcon(new ImageIcon(getClass().getResource("/imagenes2/add.png"))); // NOI18N
        crearEvidencia.setText("Crear evidencia ");
        crearEvidencia.setHorizontalAlignment(SwingConstants.LEFT);
        crearEvidencia.setHorizontalTextPosition(SwingConstants.RIGHT);

        centralPanel.add(boxPanel);
        contPanel.add(panelMenu, BorderLayout.LINE_START);
        contPanel.add(centralPanel, BorderLayout.CENTER);

        add(contPanel);

        pack();
    }


    private void aprobadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprobadasMouseExited
        aprobadas.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_aprobadasMouseExited

    private void aprobadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprobadasMouseEntered
        // TODO add your handling code here:
        aprobadas.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_aprobadasMouseEntered


    private void aprobadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprobadasMouseClicked
        // TODO add your handling code here:
        aprobadas.setOpaque(true);
        aprobadas.setBackground(new Color(33, 150, 243));
        pendientesAprobacion.setBackground(new Color(214, 214, 214));
        noAprobadas.setBackground(new Color(214, 214, 214));
        //incorporando evidencia la sub menú
        manejador = new ManejadorEvidencia("APROBADA");
        //if(manejador.getEstado().equals("APROBADA")){
        System.out.println("Funcionando");
        // System.out.println("Selecionaste no aprobadas");
        System.out.println(manejador.getEstado());
        creaEvidencia("19082236 ", " 17/02/2022 ", "Rechazado", "APROBADA");

        repaint();
        revalidate();
        //}

    }//GEN-LAST:event_aprobadasMouseClicked

    private void noAprobadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noAprobadasMouseEntered
        // TODO add your handling code here:
        noAprobadas.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_noAprobadasMouseEntered

    private void noAprobadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noAprobadasMouseExited
        // TODO add your handling code here:
        noAprobadas.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_noAprobadasMouseExited

    private void noAprobadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noAprobadasMouseClicked
        // TODO add your handling code here:
        // System.out.println("Selecionaste no aprobadas");
        noAprobadas.setOpaque(true);
        aprobadas.setBackground(new Color(214, 214, 214));
        noAprobadas.setBackground(new Color(33, 150, 243));
        pendientesAprobacion.setBackground(new Color(214, 214, 214));

        //if(manejador.getEstado().equals("RECHAZADA")){
        //    System.out.println("Selecionaste no aprobadas");
        //System.out.println(manejador.getDescripcion());
        //creaEvidencia("19082236 ", " 17/02/2022 ", "Rechazado", "RECHAZADA");
        // repaint();
        // revalidate();
        //}
    }//GEN-LAST:event_noAprobadasMouseClicked

    private void pendientesAprobacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendientesAprobacionMouseEntered
        // TODO add your handling code here:
        pendientesAprobacion.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pendientesAprobacionMouseEntered

    private void pendientesAprobacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendientesAprobacionMouseExited
        // TODO add your handling code here:
        pendientesAprobacion.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_pendientesAprobacionMouseExited

    private void pendientesAprobacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendientesAprobacionMouseClicked
        // TODO add your handling code here:
        pendientesAprobacion.setOpaque(true);
        pendientesAprobacion.setBackground(new Color(33, 150, 243));
        aprobadas.setBackground(new Color(214, 214, 214));
        noAprobadas.setBackground(new Color(214, 214, 214));

    }//GEN-LAST:event_pendientesAprobacionMouseClicked

    private void crearEvidenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearEvidenciaMouseEntered
        // TODO add your handling code here:
        crearEvidencia.setCursor(new Cursor(Cursor.HAND_CURSOR));
        crearEvidencia.setBackground(new Color(171, 71, 188));
    }//GEN-LAST:event_crearEvidenciaMouseEntered

    private void crearEvidenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearEvidenciaMouseExited
        // TODO add your handling code here:
        crearEvidencia.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        crearEvidencia.setBackground(new Color(33, 150, 243));
    }//GEN-LAST:event_crearEvidenciaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());

                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Evidencias().setVisible(true);
                        }
                    });

                } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    private JLabel createSeparator() {

        JLabel temp = new JLabel();
        temp.setBorder(BorderFactory.createEmptyBorder(15, 50, 0, 50));

        return temp;
    }

    private class EscuchaMouse extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            // MENU - MOUSE
            if (e.getSource().equals(menu)) {

                if (menuRetraido) {
                    menuRetraido = false;

                    menu.setText("Menú    ");
                    archivo.setText("Achivos");
                    alertas.setText("Alertas");
                    configuracion.setText("Ajustes");

                    panelMenu.setPreferredSize(new Dimension(150, 500));
                } else {
                    menuRetraido = true;

                    archivo.setText("");
                    alertas.setText("");
                    configuracion.setText("");
                    menu.setText("");

                    panelMenu.setPreferredSize(new Dimension(60, 500));
                }

                panelMenu.repaint();
                panelMenu.revalidate();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JLabel comp = (JLabel) e.getSource();
            comp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            comp.setOpaque(true);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JLabel comp = (JLabel) e.getSource();
            comp.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        }
    }
    
    private static int contador = 0;
    private String buscando = "";
    private ManejadorEvidencia componente;
    private ManejadorEvidencia manejador;
    //private JScrollPane scroll;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertas;
    private javax.swing.JLabel aprobadas;
    private javax.swing.JLabel archivo;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JPanel boxPanel;
    private javax.swing.JLabel buscar;
    private javax.swing.JPanel busqueda;
    private javax.swing.JLabel configuracion;
    private javax.swing.JPanel contPanel;
    private javax.swing.JButton crearEvidencia;
    private javax.swing.JLabel identificacion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel noAprobadas;
    private javax.swing.JPanel paneInferior;
    private javax.swing.JPanel panelBotonAlertas;
    private javax.swing.JPanel panelBotonArchivos;
    private javax.swing.JPanel panelBotonConfiguracion;
    private javax.swing.JPanel panelBotonMenu;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel pendientesAprobacion;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel submenu;
    // End of variables declaration//GEN-END:variables

}
