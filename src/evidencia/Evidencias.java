package evidencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
<<<<<<< HEAD
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
=======
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5

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
<<<<<<< HEAD
        System.out.println("Agregando...");

        Vector<ManejadorEvidencia> evidencias = new Vector<ManejadorEvidencia>();

        for (int i = 0; i < 10; i++) {
            evidencias.add(new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO"));
        }

        for (ManejadorEvidencia ev1 : evidencias) {
            boxPanel.add(ev1);
        }

=======
        // scroll = new JScrollPane();
        //JPanel boxPanel = new JPanel();
       // boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.PAGE_AXIS));
        //boxPanel.setPreferredSize(new Dimension(500, 1000));
        System.out.println("Agregando...");
        //contenedorEvidencias.setLayout(new GridLayout(8, 0, 20, 2));
        ManejadorEvidencia ev1 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO");
        ManejadorEvidencia ev2 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Rechazado", "RECHAZADA");
        ManejadorEvidencia ev3 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        ManejadorEvidencia ev4 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        ManejadorEvidencia ev5 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "EN-ESPERA");
        ManejadorEvidencia ev6 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO");
        ManejadorEvidencia ev7 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Rechazado", "RECHAZADA");
        ManejadorEvidencia ev8 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        ManejadorEvidencia ev9 = new ManejadorEvidencia("19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO");
        // ManejadorEvidencia ev10 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Rechachado", "RECHAZADA");
        // ManejadorEvidencia ev11 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        // ManejadorEvidencia ev12 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        // ManejadorEvidencia ev13 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Aprobada", "EN-ESPERA");
        //  ManejadorEvidencia ev14 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO");
        // ManejadorEvidencia ev15 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Rechazado", "RECHAZADA");
        //  ManejadorEvidencia ev16 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        //  ManejadorEvidencia ev17 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Rechachado", "RECHAZADA");
        // ManejadorEvidencia ev18 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        //  ManejadorEvidencia ev19 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        //  ManejadorEvidencia ev20 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Aprobada", "EN-ESPERA");
        // ManejadorEvidencia ev21 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Aprobada", "APROBADO");
        // ManejadorEvidencia ev22 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "Rechazado", "RECHAZADA");
        // ManejadorEvidencia ev23 = new ManejadorEvidencia(" ID : ", "19082236 ", " 17/02/2022 ", "En proceso", "EN-ESPERA");
        // boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        //contenedorEvidencias.add( boxPanel);

        boxPanel.add(ev1);
        boxPanel.add(ev2);
        boxPanel.add(ev3);
        boxPanel.add(ev4);
        boxPanel.add(ev5);
        boxPanel.add(ev6);
        boxPanel.add(ev7);
        boxPanel.add(ev8);
        boxPanel.add(ev9);
        //scroll.add(boxPanel);
        //contenedorEvidencias.add(boxPanel);
        //contenedorEvidencias.add(new JLabel("Probando"));

        contPanel.add(boxPanel);
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5
        repaint();
        revalidate();
    }

    private void initComponents() {

<<<<<<< HEAD
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
=======
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
        jPanel2 = new javax.swing.JPanel();
        busqueda = new javax.swing.JPanel();
        barraBusqueda = new javax.swing.JTextField();
        identificacion = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        submenu = new javax.swing.JPanel();
        aprobadas = new javax.swing.JLabel();
        noAprobadas = new javax.swing.JLabel();
        pendientesAprobacion = new javax.swing.JLabel();
        contPanel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        boxPanel = new javax.swing.JPanel();
        crearEvidencia = new javax.swing.JButton();

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
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Menu_Icon_1.png"))); // NOI18N
        menu.setText("Menú");
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5
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

<<<<<<< HEAD
        alertas.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        alertas.setForeground(new Color(255, 255, 255));
        alertas.setHorizontalAlignment(SwingConstants.LEFT);
        alertas.setIcon(new ImageIcon(getClass().getResource("/imagenes2/Feedback_Icon_2.png"))); // NOI18N
=======
        alertas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alertas.setForeground(new java.awt.Color(255, 255, 255));
        alertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Feedback_Icon_2.png"))); // NOI18N
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5
        alertas.setText("Alertas");
        alertas.setToolTipText("");
        alertas.setMaximumSize(new Dimension(70, 30));
        alertas.setMinimumSize(new Dimension(70, 30));
        alertas.setPreferredSize(null);

        panelMenu.add(alertas);
        panelMenu.add(createSeparator());

<<<<<<< HEAD
        configuracion.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        configuracion.setForeground(new Color(255, 255, 255));
        configuracion.setHorizontalAlignment(SwingConstants.LEFT);
        configuracion.setIcon(new ImageIcon(getClass().getResource("/imagenes2/Settings_Icon_2.png"))); // NOI18N
        configuracion.setText("Ajustes");
=======
        configuracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        configuracion.setForeground(new java.awt.Color(255, 255, 255));
        configuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Settings_Icon_2.png"))); // NOI18N
        configuracion.setText("Setting");
        configuracion.setToolTipText("");
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5
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

<<<<<<< HEAD
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
=======
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 80));

        busqueda.setMaximumSize(new java.awt.Dimension(400, 50));
        busqueda.setMinimumSize(new java.awt.Dimension(400, 50));
        busqueda.setPreferredSize(new java.awt.Dimension(700, 40));
        busqueda.setLayout(new java.awt.BorderLayout());

        barraBusqueda.setBackground(new java.awt.Color(214, 214, 214));
        barraBusqueda.setText("Buscar...");
        barraBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        barraBusqueda.setPreferredSize(new java.awt.Dimension(64, 28));
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
        busqueda.add(barraBusqueda, java.awt.BorderLayout.CENTER);

        identificacion.setBackground(new java.awt.Color(255, 255, 255));
        identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        identificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        identificacion.setText("  ID");
        identificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        identificacion.setPreferredSize(new java.awt.Dimension(50, 30));
        identificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                identificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                identificacionMouseExited(evt);
            }
        });
        busqueda.add(identificacion, java.awt.BorderLayout.WEST);
        identificacion.getAccessibleContext().setAccessibleName("");

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        buscar.setPreferredSize(new java.awt.Dimension(50, 40));
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
        busqueda.add(buscar, java.awt.BorderLayout.EAST);

        jPanel2.add(busqueda);
        busqueda.getAccessibleContext().setAccessibleName("");

        submenu.setMaximumSize(new java.awt.Dimension(450, 40));
        submenu.setMinimumSize(new java.awt.Dimension(450, 40));
        submenu.setName(""); // NOI18N
        submenu.setPreferredSize(new java.awt.Dimension(1200, 40));

        aprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aprobadas.setText("Evidencias aprobadas");
        aprobadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        aprobadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aprobadasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aprobadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aprobadasMouseExited(evt);
            }
        });

        noAprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noAprobadas.setText("Evidencias no aprobadas");
        noAprobadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        noAprobadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noAprobadasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noAprobadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noAprobadasMouseExited(evt);
            }
        });

        pendientesAprobacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendientesAprobacion.setText("Evidencias pendientes");
        pendientesAprobacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pendientesAprobacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendientesAprobacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendientesAprobacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendientesAprobacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout submenuLayout = new javax.swing.GroupLayout(submenu);
        submenu.setLayout(submenuLayout);
        submenuLayout.setHorizontalGroup(
            submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(noAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pendientesAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        submenuLayout.setVerticalGroup(
            submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendientesAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(submenu);

        contPanel.setPreferredSize(new java.awt.Dimension(722, 1200));

        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));
        scroll.getVerticalScrollBar().setOpaque(false);
        scroll.setBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(50);

        boxPanel.setLayout(new javax.swing.BoxLayout(boxPanel, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(boxPanel);

        crearEvidencia.setBackground(new java.awt.Color(33, 150, 243));
        crearEvidencia.setForeground(new java.awt.Color(255, 255, 255));
        crearEvidencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/add.png"))); // NOI18N
        crearEvidencia.setText("Crear evidencia ");
        crearEvidencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crearEvidencia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        crearEvidencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearEvidenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearEvidenciaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contPanelLayout = new javax.swing.GroupLayout(contPanel);
        contPanel.setLayout(contPanelLayout);
        contPanelLayout.setHorizontalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll)
                    .addGroup(contPanelLayout.createSequentialGroup()
                        .addGap(0, 563, Short.MAX_VALUE)
                        .addComponent(crearEvidencia))))
        );
        contPanelLayout.setVerticalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPanelLayout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearEvidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 590, Short.MAX_VALUE))
        );

        jPanel2.add(contPanel);

        paneInferior.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
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

    private void restableserMenu(int con) {
        if (contador == 2) {
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
            contador = 0;
        }
    }

    private void creaEvidencia(String referencia, String fecha, String descripcion, String estado) {
        String id = "ID:";
        manejador = new ManejadorEvidencia(estado);

        // if (manejador.getEstado().equals("APROBADA")) {
        ManejadorEvidencia evi = new ManejadorEvidencia(referencia, fecha, descripcion, estado);
        System.out.println("eNTRE A CREAR EVIDENCIA");
        //boxPanel.removeAll();
//        boxPanel.add(evi);

        //      boxPanel.revalidate();
        //    boxPanel.repaint();
        //}
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

        if (barraBusqueda.getText().equals("")) {
            barraBusqueda.setText("Buscar...");
            //System.out.println("basio");
        } else {
            if (buscando != "") {
                barraBusqueda.setText(buscando);
            }
            buscando = barraBusqueda.getText();
            System.out.println(buscando);
            //System.out.println("entrando en el esle");
            buscando = "";
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void barraBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBusquedaFocusGained
        barraBusqueda.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    }//GEN-LAST:event_barraBusquedaFocusGained

    private void barraBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_barraBusquedaFocusLost
        // TODO add your handling code here:
        if (barraBusqueda.equals("Buscar") || barraBusqueda.equals("")) {
            barraBusqueda.setText("Buscar...");
        }

    }//GEN-LAST:event_barraBusquedaFocusLost

    private void barraBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBusquedaMouseClicked
        // TODO add your handling code here:
        barraBusqueda.setText("");
    }//GEN-LAST:event_barraBusquedaMouseClicked

    private void barraBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            System.out.println("Enter funcionando");
        }
    }//GEN-LAST:event_barraBusquedaKeyPressed
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5

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
<<<<<<< HEAD
=======
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
>>>>>>> e31cecec8ce0baa3a6c1caa1b4c1e326f2c60cb5
}
