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
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import registroevidencia.CrearRegistro;

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

    private Evidencias reference = this;
    private Vector<ManejadorEvidencia> evidencias = new Vector<ManejadorEvidencia>(ITEMS_PER_PAGE);
    public static final int ITEMS_PER_PAGE = 5;

    public Evidencias() {
        initComponents();
        addComponent();
    }

    private void addComponent() {

        System.out.println("Agregando...");

        evidencias = new Vector<ManejadorEvidencia>();

        for (int i = 0; i < ITEMS_PER_PAGE; i++) {
            evidencias.add(new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO"));
            evidencias.add(new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Rechazada", "RECHAZADA"));
            evidencias.add(new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "En aprobacion", "EN-ESPERA"));
        }

        refreshEvidencia();
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
        crearEvidencia.addMouseListener(listenerMouse);

        JPanel temporal = new JPanel();
        temporal.add(crearEvidencia);

        centralPanel.add(boxPanel);

        contPanel.add(temporal, BorderLayout.LINE_END);
        contPanel.add(panelMenu, BorderLayout.LINE_START);
        contPanel.add(centralPanel, BorderLayout.CENTER);

        add(contPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public void addEvidencia(String referencia, String fecha, String descripcion, String estado) {
        ManejadorEvidencia newItem = new ManejadorEvidencia(referencia, fecha, descripcion, estado);

        evidencias.add(0, newItem);
        refreshEvidencia();
    }

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

    private void refreshEvidencia() {
        boxPanel.removeAll();

        for (ManejadorEvidencia ev1 : evidencias) {
            boxPanel.add(ev1);
        }

        repaint();
        revalidate();
    }

    private class EscuchaMouse extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            // CREAR EVIDENCIA
            if (e.getSource().equals(crearEvidencia)) {
                crearEvidencia.setEnabled(false);
                reference.setVisible(false);
                new CrearRegistro(reference);
                crearEvidencia.setEnabled(true);
            }

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
            JComponent comp = (JComponent) e.getSource();
            comp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            comp.setOpaque(true);
        }
    }

}
