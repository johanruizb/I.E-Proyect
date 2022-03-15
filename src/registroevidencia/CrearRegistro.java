/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registroevidencia;

import evidencia.Evidencias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class CrearRegistro extends javax.swing.JFrame {

    private javax.swing.JPanel backPanel;
    private javax.swing.JButton trabajoAprobado, trabajoRechazado, crearRegistro,
            botonRechazada, botonAtras;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField tipoTrabajo;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JTextField numeroInforme, numeroRegistro, selecinarFecha;
    private javax.swing.JTextField fechaRegistroInformacion;
    private javax.swing.JPanel panelBotones, panelFecha;
    private Border bordeRojo = BorderFactory.createLineBorder(new Color(213, 0, 0), 2, true);
    private Border borde = BorderFactory.createLineBorder(new Color(112, 112, 112), 1, true);
    private static int click = 0, click2 = 0;
    private boolean bandera = false, desabilitado = true, cierre = false;
    private JComboBox<String> opciones, ciudadOperacion;
    private Date day;
    private GregorianCalendar calender;
    private JLabel dia, mes, año, fecha, espacio;
    private JSpinner dias, meses, años;

    private CrearRegistro reference = this;
    private Evidencias viewEvidencias;

    private ArrayList<String> months = new ArrayList<String>(Arrays.asList(
            "Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Dociembre"));

    /**
     * Creates new form CrearRegistro
     */
    public CrearRegistro(Evidencias viewE) {
        viewEvidencias = viewE;
        initComponents();

        this.setSize(896, 500);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lookAndShow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.awt.GridBagConstraints gridBagConstraints;
        //instanciando componentes
        backPanel = new javax.swing.JPanel();//panel1
        backPanel.setBorder(borde);
        backPanel.setBackground(new Color(204, 204, 204));
        backPanel.setOpaque(true);
        backPanel.setLayout(new GridBagLayout());
        numeroRegistro = new javax.swing.JTextField();//identificador registro
        numeroInforme = new javax.swing.JTextField();//numero de informe
        trabajoAprobado = new javax.swing.JButton();//trabajo aprobado
        trabajoRechazado = new javax.swing.JButton();//trabajo rechazada
        observaciones = new javax.swing.JTextArea();//observaciones
        scroll = new javax.swing.JScrollPane();//escroll observaciones
        selecinarFecha = new javax.swing.JTextField();//selector fecha
        tipoTrabajo = new javax.swing.JTextField();//tipo traabajo realizado
        fechaRegistroInformacion = new javax.swing.JTextField();
        botonRechazada = new javax.swing.JButton();//boton para no aprobar evidencia
        crearRegistro = new javax.swing.JButton();
        calender = new GregorianCalendar();
        //======================================================================
        //======================================================================
        numeroRegistro.setColumns(20);
        numeroRegistro.setText("ID: numero contrato");
        numeroRegistro.setBorder(borde);
        numeroRegistro.setEditable(false);
        numeroRegistro.setPreferredSize(new java.awt.Dimension(500, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        backPanel.add(numeroRegistro, gridBagConstraints);
        //======================================================================
        numeroInforme.setColumns(20);
        numeroInforme.setEditable(false);
        numeroInforme.setText("Rf: numero referencia");
        numeroInforme.setBorder(borde);
        numeroInforme.setPreferredSize(new java.awt.Dimension(400, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        backPanel.add(numeroInforme, gridBagConstraints);
        //===================================================================

        trabajoAprobado.setText("Registro aprobado ");
        trabajoAprobado.setBackground(new Color(33, 150, 243));
        trabajoAprobado.setPreferredSize(new java.awt.Dimension(180, 50));
        trabajoAprobado.setForeground(Color.WHITE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        panelBotones = new JPanel();
        panelBotones.setBorder(borde);
        panelBotones.setLayout(new GridLayout(1, 3));
        panelBotones.setBackground(Color.WHITE);
        backPanel.add(panelBotones, gridBagConstraints);
        //===================================================================
        botonRechazada.setText("Registro no aprobado");
        botonRechazada.setBackground(new Color(33, 150, 243));
        botonRechazada.setPreferredSize(new java.awt.Dimension(190, 50));
        botonRechazada.setForeground(Color.WHITE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        JLabel separa = new JLabel();
        separa.setMaximumSize(new Dimension(1000, 30));
        panelBotones.add(trabajoAprobado);
        panelBotones.add(separa);
        panelBotones.add(botonRechazada);
        backPanel.add(panelBotones, gridBagConstraints);
        //===================================================================
        scroll.setPreferredSize(new java.awt.Dimension(10, 100));
        scroll.setBorder(borde);
        observaciones.setColumns(10);
        observaciones.setRows(10);
        observaciones.setTabSize(10);
        observaciones.setLineWrap(true);
        observaciones.setText("Esta es el area de observaciones");
        //====================================================================
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
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
        backPanel.add(scroll, gridBagConstraints);
        //=================================================================

        panelFecha = new JPanel();
        panelFecha.setLayout(new BoxLayout(panelFecha, BoxLayout.X_AXIS));
        panelFecha.setBackground(Color.WHITE);
        panelFecha.setPreferredSize(new java.awt.Dimension(400, 50));
        panelFecha.setBorder(borde);
        fecha = new JLabel("Fecha de realización: ");
        dia = new JLabel(" Dia: ");
        mes = new JLabel(" Mes: ");
        año = new JLabel(" Año: ");

        dias = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        meses = new JSpinner(new SpinnerListModel(months));
        String year[] = {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030",
            "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"};
        años = new JSpinner(new SpinnerListModel(year));
        dias.setMaximumSize(new Dimension(50, 50));
        meses.setMaximumSize(new Dimension(100, 50));
        años.setMaximumSize(new Dimension(70, 50));
        dias.setBorder(null);

        panelFecha.add(fecha);
        panelFecha.add(dia);
        panelFecha.add(dias);
        panelFecha.add(mes);
        panelFecha.add(meses);
        panelFecha.add(año);
        panelFecha.add(años);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(panelFecha, gridBagConstraints);
        //======================================================================
        String[] seleccionado = {"Selecione el tipo de trabajo", "Revisión Previa",
            "Revison Periodica", "Modificaciones re interna", "Trabajos generados por RP"};
        opciones = new JComboBox<>(seleccionado);
        opciones.setBackground(Color.WHITE);
        opciones.setBorder(borde);
        opciones.setPreferredSize(new java.awt.Dimension(400, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(opciones, gridBagConstraints);

        //======================================================================
        String[] ciudad = new String[]{"Selecione la ciuda de operacion", "Cali",
            "Manizales", "Medellin", "Pereira", "Tulua", "Armenia", "Popayan", "Bogota"};
        ciudadOperacion = new JComboBox<>(ciudad);
        ciudadOperacion.setPreferredSize(new java.awt.Dimension(400, 50));
        ciudadOperacion.setBorder(borde);
        ciudadOperacion.setBackground(Color.WHITE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(ciudadOperacion, gridBagConstraints);
        //=====================================================================
        fechaRegistroInformacion.setText(mostrar());
        fechaRegistroInformacion.setBorder(borde);
        fechaRegistroInformacion.setEditable(false);
        fechaRegistroInformacion.setPreferredSize(new java.awt.Dimension(400, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(fechaRegistroInformacion, gridBagConstraints);
        //=====================================================================
        botonAtras = new JButton("Atras ", new ImageIcon("src/imagenes2/blancoatras.png"));
        botonAtras.setPreferredSize(new java.awt.Dimension(150, 50));
        botonAtras.setBackground(new Color(33, 150, 243));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        backPanel.add(botonAtras, gridBagConstraints);
        //=====================================================================
        espacio = new JLabel();
        espacio.setPreferredSize(new java.awt.Dimension(150, 50));
        espacio.setBackground(new Color(33, 150, 243));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        backPanel.add(espacio, gridBagConstraints);
        //======================================================================
        crearRegistro.setText("Crear registro");
        crearRegistro.setIcon(new ImageIcon("src/imagenes2/add.png"));
        crearRegistro.setBackground(new Color(33, 150, 243));
        crearRegistro.setMaximumSize(new java.awt.Dimension(150, 50));
        crearRegistro.setMinimumSize(new java.awt.Dimension(150, 50));
        crearRegistro.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        backPanel.add(crearRegistro, gridBagConstraints);
        add(backPanel);
        //======================================================================

        //======================================================================
        //Eventos de mause
        numeroRegistro.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                numeroRegistro.setText("");
                numeroRegistro.setEditable(true);
            }
        }
        );
        numeroRegistro.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {

                if (numeroRegistro.getText().equals("")
                        || numeroRegistro.getText().equals("ID: numero contrato")) {
                    numeroRegistro.setText("ID: numero contrato");
                    numeroRegistro.setBorder(bordeRojo);

                } else if (numeroRegistro.getText() != ""
                        || numeroRegistro.getText() != "ID: numero contrato") {

                    numeroRegistro.setText(numeroRegistro.getText());
                    numeroRegistro.setBorder(borde);
                }
            }
        });
        numeroInforme.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                numeroInforme.setText("");
                numeroInforme.setEditable(true);
            }
        });
        numeroInforme.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (numeroInforme.getText().equals("")
                        || numeroInforme.getText().equals("Rf: numero referencia")) {
                    numeroInforme.setText("Rf: numero referencia");
                    numeroInforme.setBorder(bordeRojo);
                } else if (numeroInforme.getText() != ""
                        || numeroInforme.getText() != "Rf: numero referencia") {
                    numeroInforme.setText(numeroInforme.getText());
                    numeroInforme.setBorder(borde);
                }
            }
        });
        botonRechazada.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {

                botonRechazada.setCursor(new Cursor(Cursor.HAND_CURSOR));
                botonRechazada.setBackground(Color.red);
            }
        });
        botonRechazada.addMouseListener(new MouseAdapter() {

            public void mouseExited(MouseEvent e) {

                botonRechazada.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                botonRechazada.setBackground(new Color(33, 150, 243));

                if (click == 1) {
                    botonRechazada.setBackground(new Color(0, 33, 113));

                } else if (click == 2 && click2 == 0) {
                    botonRechazada.setBackground(new Color(33, 150, 243));
                    botonRechazada.setIcon(null);
                    click = 0;
                }
            }
        });
        trabajoAprobado.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                trabajoAprobado.setCursor(new Cursor(Cursor.HAND_CURSOR));
                trabajoAprobado.setBackground(Color.red);

            }
        });
        trabajoAprobado.addMouseListener(new MouseAdapter() {

            public void mouseExited(MouseEvent e) {
                trabajoAprobado.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                trabajoAprobado.setBackground(new Color(33, 150, 243));

                if (click2 == 1) {
                    trabajoAprobado.setBackground(new Color(0, 33, 113));
                    observaciones.setBorder(borde);
                    scroll.setBorder(borde);
                } else if (click2 == 2 && click == 0) {
                    trabajoAprobado.setBackground(new Color(33, 150, 243));
                    trabajoAprobado.setIcon(null);
                    observaciones.setBorder(borde);
                    scroll.setBorder(borde);
                    click2 = 0;
                }
            }
        });
        botonRechazada.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                botonRechazada.setIcon(new ImageIcon("src/imagenes2/xblanco.png"));
                botonRechazada.setBackground(new Color(0, 33, 113));
                observaciones.requestFocus();
                observaciones.setFocusable(true);
                scroll.requestFocus();
                scroll.setFocusable(true);
                click++;
                desabilitado = true;

                if (click2 == 1 && click == 1) {
                    trabajoAprobado.setIcon(null);
                    trabajoAprobado.setBackground(new Color(33, 150, 243));
                    click2 = 0;

                }
                if (click >= 2) {
                    click = 0;
                    botonRechazada.setIcon(null);

                }
            }
        });

        trabajoAprobado.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                trabajoAprobado.setIcon(new ImageIcon("src/imagenes2/blancoApro.png"));
                observaciones.setFocusable(false);
                scroll.setFocusable(false);
                click2++;
                desabilitado = false;
                if (click == 1 && click2 == 1) {

                    botonRechazada.setIcon(null);
                    botonRechazada.setBackground(new Color(33, 150, 243));
                    observaciones.setFocusable(false);
                    click = 0;
                    if (desabilitado == false) {
                        observaciones.setText("Esta es el area de observaciones:");
                        observaciones.setFocusable(false);
                    }

                }
                if (click2 >= 2) {
                    click2 = 0;
                    trabajoAprobado.setIcon(null);
                }
            }
        });

        observaciones.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (observaciones.getText().equals("Esta es el area de observaciones")
                        || observaciones.getText().equals("") && desabilitado == true) {
                    observaciones.setBorder(bordeRojo);
                    scroll.setBorder(bordeRojo);
                    observaciones.setText("Esta es el area de observaciones");
                } else if (observaciones.getText() != ""
                        && observaciones.getText() != "Esta es el area de observaciones") {
                    observaciones.setBorder(borde);
                    scroll.setBorder(borde);
                }

            }
        });
        observaciones.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (observaciones.getText().equals("Esta es el area de observaciones") && desabilitado == false) {
                    observaciones.setText("Esta es el area de observaciones");
                } else {
                    observaciones.setText("");
                }
            }

        });
        botonAtras.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                botonAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
                botonAtras.setBackground(Color.red);
            }
        });

        botonAtras.addMouseListener(new MouseAdapter() {

            public void mouseExited(MouseEvent e) {
                botonAtras.setBackground(new Color(33, 150, 243));
                botonAtras.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
            }
        });

        botonAtras.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // new CrearRegistro().setVisible(false);
                /* Create and display the form */
                reference.dispose();
                viewEvidencias.setVisible(true);
            }

        });
        crearRegistro.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                crearRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                crearRegistro.setBackground(Color.red);

            }
        });

        crearRegistro.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                crearRegistro.setBackground(new Color(33, 150, 243));
                crearRegistro.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
            }
        });

        crearRegistro.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                verificandoDatos();

            }
        });
        selecinarFecha.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {

                if (selecinarFecha.getText().equals("fecha de ejecucion 02/12/2025 ")
                        || selecinarFecha.getText().equals("")) {
                    selecinarFecha.setText("fecha de ejecucion 02/12/2025 ");
                    selecinarFecha.setBorder(bordeRojo);

                } else if (selecinarFecha.getText() != ""
                        || selecinarFecha.getText() != "fecha de ejecucion 02/12/2025 ") {
                    selecinarFecha.setBorder(borde);
                    selecinarFecha.setText(selecinarFecha.getText());
                }
            }
        });
        selecinarFecha.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                selecinarFecha.setText("");

            }
        });
        opciones.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (opciones.getSelectedItem().equals("Selecione el tipo de trabajo")) {
                    opciones.setBorder(bordeRojo);
                } else if (opciones.getSelectedItem() != "Selecione el tipo de trabajo") {
                    opciones.setBorder(borde);
                }
            }
        });
        ciudadOperacion.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (ciudadOperacion.getSelectedItem().equals("Selecione la ciuda de operacion")) {
                    ciudadOperacion.setBorder(bordeRojo);
                } else if (ciudadOperacion.getSelectedItem() != "Selecione la ciuda de operacion") {
                    ciudadOperacion.setBorder(borde);
                }
            }
        });
        //=====================================================================

    }

    //muestra la fecha en el componente
    public String mostrar() {

        String leyenda = "La creacion del registro se realizo el: ";
        String lugar = calender.getTimeZone().getDisplayName();
        int ano = calender.get(Calendar.YEAR);
        int mese = calender.get(Calendar.MONTH) + 1;
        int dia = calender.get(Calendar.DAY_OF_MONTH);
        return leyenda + dia + "/" + mese + "/" + ano + " " + lugar;

    }
//obtiene los datos ingresados en el regristro 

    private void obtenerDatos() {

        String numeroID = numeroRegistro.getText();
        String informeNumero = numeroInforme.getText();
        String observacion = observaciones.getText();
        String localidad = (String) ciudadOperacion.getSelectedItem();
        String fecha = obtenerFecha();
        String proceso = tipoTrabajo.getText();
        String fechaEjecucion = obtenerFecha();

        // SEND TO DB
        viewEvidencias.addEvidencia(numeroID, fecha, "En aprobacion", "EN-ESPERA");

        // reference.dispose();
        // viewEvidencias.setVisible(true);
    }

    private String obtenerFecha() {
        String eldia = String.valueOf(dias.getValue());

        String mesPalabras = String.valueOf(meses.getValue());
        String mess = String.valueOf(months.indexOf(mesPalabras) + 1);

        String anoss = String.valueOf(años.getValue());
        return eldia + "/" + mess + "/" + anoss;
    }

    private void verificandoDatos() {
        boolean faro = true;
        while (faro) {
            
            System.out.println("Estoy funcionando");
            if (numeroRegistro.getText().equals("") || numeroRegistro.getText()
                    .equals("ID: numero contrato")) {
                numeroRegistro.setBorder(bordeRojo);

            }
            if (numeroInforme.getText().equals("Rf: numero referencia")
                    || numeroInforme.getText().equals("")) {
                numeroInforme.setBorder(bordeRojo);
               // JOptionPane.showMessageDialog(this, "Datos incorrectos");

            }
            if (click == 0 && click2 == 0) {
                botonRechazada.setBorder(bordeRojo);
                trabajoAprobado.setBorder(bordeRojo);

            }
            if (click == 1) {
                isEntyObsevaciones();

            } //else {
            //reference.dispose();
            // viewEvidencias.setVisible(true);
            
        }
        reference.dispose();
        viewEvidencias.setVisible(true);
    }

    private void isEntyObsevaciones() {
        if (observaciones.getText().equals("")
                || observaciones.getText().equals("Esta es el area de observaciones")) {
            observaciones.setBorder(bordeRojo);
            scroll.setBorder(bordeRojo);
        }
    }

    private void lookAndShow() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                reference.setVisible(true);
            }
        });
    }

}
