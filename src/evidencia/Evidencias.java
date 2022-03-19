package evidencia;

import db.BaseDatos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.SwingConstants;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import login.Login;
import registroevidencia.CrearRegistro;
import reutilizable.EmptySpace;

/**
 *
 * @author ALOMIA
 */
public class Evidencias extends JFrame {

    public final int ITEMS_PER_PAGE = 5;

    private JLabel configuracion, alertas, archivo, menu;

    private JButton crearEvidencia, refrescar;
    private JPanel panelMenu, contPanel, boxPanel, centralPanel;
    private JScrollPane scroll;

    private ArrayList<ManejadorEvidencia> evidencias = new ArrayList<>(ITEMS_PER_PAGE);
    private ArrayList<String> userInfo = new ArrayList<>(2);

    private final EscuchaMouse listenerMouse = new EscuchaMouse();
    private final EscuchaAction listenerAction = new EscuchaAction();
    private boolean menuRetraido = false;

    private final Evidencias reference = this;
    private Login viewLogin;
    private BaseDatos bd = new BaseDatos();

    public Evidencias(Login viewL) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(869, 500));
        this.viewLogin = viewL;
        setVisible(false);
        initComponents();
        setLocationRelativeTo(this.viewLogin);
        setVisible(true);
    }

    public void setUserInfo(String email, String password) {
        userInfo.add(0, email);
        userInfo.add(1, password);
        addComponent();
    }

    public void sendEvidencia(String[] datosEvidencia) {
        if (bd.conectarBD()) {
            if (bd.putEvidences(datosEvidencia, userInfo.get(0))) {

                ManejadorEvidencia newItem = new ManejadorEvidencia(datosEvidencia, "EN-ESPERA");
                evidencias.add(0, newItem);
                refreshEvidencia();
            } else {
                JOptionPane.showMessageDialog(reference, "Ha ocurrido un error\n FATAL");
            }
        }
    }

    private void refreshEvidencia() {
        boxPanel.removeAll();

        for (ManejadorEvidencia ev1 : evidencias) {
            boxPanel.add(ev1);
        }

        repaint();
        revalidate();
    }

    private void addComponent() {

        if (bd.conectarBD()) {

            ArrayList<ArrayList<String>> registrosBD = bd.getEvidences(userInfo.get(0));

            System.out.println("registrosBD.size() " + registrosBD.size());

            if (!registrosBD.isEmpty()) {
                for (ArrayList<String> vs : registrosBD) {
                    ManejadorEvidencia temporal = new ManejadorEvidencia(vs);
                    evidencias.add(temporal);
                }

                refreshEvidencia();
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Evidencias(null);
            }
        });
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
        refrescar = new JButton();

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
        menu.setFont(new Font("Segoe UI", 0, 14));
        menu.setForeground(new Color(255, 255, 255));
        menu.setHorizontalAlignment(SwingConstants.LEFT);
        menu.setIcon(new ImageIcon(getClass().getResource("/img/gui/menu.png")));
        menu.setText("Menú    ");
        menu.setToolTipText("");
        menu.setPreferredSize(null);
        menu.addMouseListener(listenerMouse);

        panelMenu.add(menu);
        panelMenu.add(createSeparator());

        archivo.setFont(new Font("Segoe UI", 0, 14));
        archivo.setForeground(new Color(255, 255, 255));
        archivo.setHorizontalAlignment(SwingConstants.LEFT);
        archivo.setIcon(new ImageIcon(getClass().getResource("/img/gui/evidencia.png")));
        archivo.setText("Achivos");
        archivo.setMaximumSize(new Dimension(70, 30));
        archivo.setMinimumSize(new Dimension(70, 30));
        archivo.setPreferredSize(null);

        panelMenu.add(archivo);
        panelMenu.add(createSeparator());

        alertas.setFont(new Font("Segoe UI", 0, 14));
        alertas.setForeground(new Color(255, 255, 255));
        alertas.setHorizontalAlignment(SwingConstants.LEFT);
        alertas.setIcon(new ImageIcon(getClass().getResource("/img/gui/notificacion.png")));

        alertas.setText("Alertas");
        alertas.setToolTipText("");
        alertas.setMaximumSize(new Dimension(70, 30));
        alertas.setMinimumSize(new Dimension(70, 30));
        alertas.setPreferredSize(null);

        panelMenu.add(alertas);
        panelMenu.add(createSeparator());

        configuracion.setFont(new Font("Segoe UI", 0, 14));
        configuracion.setForeground(new Color(255, 255, 255));
        configuracion.setHorizontalAlignment(SwingConstants.LEFT);
        configuracion.setIcon(new ImageIcon(getClass().getResource("/img/gui/ajustes.png")));
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
        crearEvidencia.setIcon(new ImageIcon(getClass().getResource("/img/gui/añadir.png")));
        crearEvidencia.setText("Crear evidencia ");
        crearEvidencia.setPreferredSize(new Dimension(190, 45));
        crearEvidencia.addMouseListener(listenerMouse);
        crearEvidencia.addActionListener(listenerAction);

        refrescar.setBackground(new Color(33, 150, 243));
        refrescar.setForeground(new Color(255, 255, 255));
        refrescar.setIcon(new ImageIcon(getClass().getResource("/img/gui/añadir.png")));
        refrescar.setText("Refrescar ");
        refrescar.setPreferredSize(new Dimension(190, 45));
        refrescar.addMouseListener(listenerMouse);
        refrescar.addActionListener(listenerAction);

        JPanel temporal = new JPanel();
        temporal.setPreferredSize(new Dimension(200, 120));
        temporal.add(crearEvidencia);
        temporal.add(refrescar);

        centralPanel.add(boxPanel);

        contPanel.add(temporal, BorderLayout.LINE_END);
        contPanel.add(panelMenu, BorderLayout.LINE_START);
        contPanel.add(centralPanel, BorderLayout.CENTER);

        add(contPanel);

        pack();
    }

    private JLabel createSeparator() {

        JLabel temp = new JLabel();
        temp.setBorder(BorderFactory.createEmptyBorder(15, 50, 0, 50));

        return temp;
    }

    private class EscuchaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(crearEvidencia)) {
                reference.setVisible(false);
                new CrearRegistro(reference);
            } else if (ae.getSource().equals(refrescar)) {
                evidencias.clear();
                reference.addComponent();
            }
        }
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
            JComponent comp = (JComponent) e.getSource();
            comp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            comp.setOpaque(true);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JComponent comp = (JComponent) e.getSource();
            comp.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        }
    }

}
