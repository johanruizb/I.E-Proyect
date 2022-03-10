/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroevidencia;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 *
 * @author johan
 */
public class NewClass extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel fecha = new JLabel("Fecha realizacion:"), d = new JLabel("Dia:"), m = new JLabel("Mes:"), a = new JLabel("Año:");
    private JSpinner dia = new JSpinner(), mes = new JSpinner(), año = new JSpinner();

    public NewClass() throws HeadlessException {
        initComponent();
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewClass();
            }
        });
    }

    private void initComponent() {
        add(panel);

        panel.add(fecha);
        panel.add(d);

        panel.add(dia);
        panel.add(m);

        panel.add(mes);
        panel.add(a);

        panel.add(año);
    }
}
