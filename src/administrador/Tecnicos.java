/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class Tecnicos extends JPanel implements Serializable {

    private JLabel nombres, apellidos, descipcion1, totalRegistros;
    private ImageIcon usuario = new ImageIcon("src/imagenes2/iconousuario.png");
    private Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);

    public Tecnicos(String nombre, String apellido, String total) {

        this.nombres = new JLabel(nombre, usuario, JLabel.LEFT);
        this.apellidos = new JLabel(apellido, JLabel.LEFT);
        this.totalRegistros = new JLabel(total, JLabel.LEFT);
        this.setBorder(borde);

        this.setBorder(borde);
        this.setBackground(new Color(238, 238, 238));
        this.setLayout(new GridBagLayout());
        GridBagConstraints limites = new GridBagConstraints();
        limites.fill = GridBagConstraints.NONE;

        limites.gridx = 0;
        limites.gridy = 0;

        int separacion = 290;

        this.nombres.setPreferredSize(new Dimension(separacion, 30));
        this.add(this.nombres);

        //limites.gridx = 1;
        this.apellidos.setPreferredSize(new Dimension(separacion, 30));
        this.add(this.apellidos);

        limites.gridx = 0;

        this.totalRegistros.setPreferredSize(new Dimension(100, 50));
        add(this.totalRegistros, limites);
        limites.gridx = 1;

        limites.gridx = 3;
        this.add(totalRegistros, limites);

        this.repaint();
        this.revalidate();
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Escucho el clik");
            }
        });

    }

    private JLabel createEmptySpace() {
        JLabel x = (new JLabel(""));
        x.setBorder(BorderFactory.createEmptyBorder(0, 200, 0, 0));
        return x;
    }

}
