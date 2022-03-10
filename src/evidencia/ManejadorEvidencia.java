/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class ManejadorEvidencia extends JPanel implements Serializable {

    private JLabel identificador, fechaEvidencia, descipcion1, estado, iconoEstado;
    private ImageIcon carpeta = new ImageIcon("src/imagenes2/folder.png");
    private Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);

    public ManejadorEvidencia(String referencia, String fecha, String descripcion, String estado) {
        this.identificador = new JLabel(referencia, carpeta, JLabel.LEFT);
        this.fechaEvidencia = new JLabel(fecha, JLabel.LEFT);
        this.estado = new JLabel(descripcion, JLabel.CENTER);

        if (estado.equals("EN-ESPERA")) {
            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/en-aprobacion.png"), SwingConstants.CENTER);
        } else if (estado.equals("APROBADO")) {

            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/aprobada.png"), SwingConstants.CENTER);
        } else if (estado.equals("RECHAZADA")) {
            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/rechazada.png"), SwingConstants.CENTER);
        } else {
            this.iconoEstado = new JLabel(new ImageIcon("imagen/default.png"), SwingConstants.CENTER);
        }

        this.setBorder(borde);
        this.setBackground(new Color(238, 238, 238));
        this.setLayout(new GridBagLayout());

        GridBagConstraints limites = new GridBagConstraints();
        JPanel state = new JPanel(new GridBagLayout());

        limites.fill = GridBagConstraints.NONE;
        limites.gridx = 0;
        limites.gridy = 0;

        int separacion = 180;

        this.identificador.setPreferredSize(new Dimension(separacion, 50));
        this.add(this.identificador, limites);

        limites.gridx = 1;
        this.fechaEvidencia.setPreferredSize(new Dimension(separacion, 50));
        this.add(this.fechaEvidencia, limites);

        limites.gridx = 0;
        this.estado.setPreferredSize(new Dimension(80, 50));
        state.add(this.estado, limites);

        limites.gridx = 1;
        state.add(this.iconoEstado, limites);

        limites.gridx = 3;
        this.add(state, limites);

        this.repaint();
        this.revalidate();

    }

    public ManejadorEvidencia(String stado) {
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador.getText();
    }

    public String getFechaEvidencia() {
        return fechaEvidencia.getText();
    }

    public String getDescipcion1() {
        return descipcion1.getText();
    }

    public String getEstado() {
        return estado.getText();
    }

    private JLabel createEmptySpace() {
        JLabel x = (new JLabel(""));
        x.setBorder(BorderFactory.createEmptyBorder(0, 200, 0, 0));
        return x;
    }

}
