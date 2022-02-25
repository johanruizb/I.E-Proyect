/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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

    //private JPanel contenedor;
    private JLabel identificador, fechaEvidencia, descipcion1, estado, iconoEstado;
    //private String idEvidencia;
    //private JLabel separador1 = new JLabel();
    //private String descripcion, fecha;
    //private String estado, numeroReferencia;
    private ImageIcon carpeta = new ImageIcon("src/imagenes2/folder.png");
    //private ImageIcon separa2 = new ImageIcon("src/imagenes2/separa50.png");//13, 71, 161//13, 71, 161
    //private Border borde = BorderFactory.createBevelBorder(0, (new Color(214,214,214)), new Color(60,63,65));
    private Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);

    public ManejadorEvidencia(String referencia, String fecha, String descripcion, String estado) {
      
        this.identificador = new JLabel(referencia, carpeta, JLabel.LEFT);
        this.fechaEvidencia = new JLabel(fecha, JLabel.LEFT);
        this.estado = new JLabel(descripcion, JLabel.LEFT);
        //this.descrip = new JLabel(descriccion);

        if (estado.equals("EN-ESPERA")) {
            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/en-aprobacion.png"), SwingConstants.CENTER);
        } else if (estado.equals("APROBADO")) {
            // System.out.println("validando aprobado");
            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/aprobada.png"), SwingConstants.CENTER);
        } else if (estado.equals("RECHAZADA")) {
            this.iconoEstado = new JLabel(new ImageIcon("src/imagenes2/rechazada.png"), SwingConstants.CENTER);
        } else {
            this.iconoEstado = new JLabel(new ImageIcon("imagen/default.png"), SwingConstants.CENTER);
            System.out.println("validando aprobado");
        }
        //JLabel n = new JLabel(separa);

        // iden.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(borde);
        this.setBackground(new Color(238, 238, 238));
        this.setLayout(new GridBagLayout());
        // this.setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints limites = new GridBagConstraints();
        //this.setPreferredSize(new Dimension(500, 50));
        //carpetaIcono.setSize(30, 30);

        JPanel state = new JPanel(new GridBagLayout());
        //state.setPreferredSize(new Dimension(120, 40));
        //this.setAlignmentX(LEFT_ALIGNMENT);
        //limites.anchor = GridBagConstraints.CENTER;
        limites.fill = GridBagConstraints.NONE;

        limites.gridx = 0;
        limites.gridy = 0;

        int separacion = 290;
        
        this.identificador.setPreferredSize(new Dimension(separacion, 40));
        this.add(this.identificador, limites);

        limites.gridx = 1;

        this.fechaEvidencia.setPreferredSize(new Dimension(separacion, 40));
        this.add(this.fechaEvidencia, limites);

        limites.gridx = 0;

        this.estado.setPreferredSize(new Dimension(70, 40));
        state.add(this.estado, limites);
        limites.gridx = 1;
        state.add(this.iconoEstado, limites);

        /*
        limites.gridx = 1;
        this.add(createEmptySpace(), limites);
        limites.gridx = 3;
        this.add(createEmptySpace(), limites);
         */
        limites.gridx = 3;
        this.add(state, limites);

        this.repaint();
        this.revalidate();

    }

    public ManejadorEvidencia(String stado) {
        this.estado = estado;
        // this.numeroReferencia = referencia;
        // this.fecha = fecha;
        // this.descripcion = descripcion;
        // this.estado = estado;
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
