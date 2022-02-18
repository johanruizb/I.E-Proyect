/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class ManejadorEvidencia extends JPanel implements Serializable {

    //private JPanel contenedor;
    private JLabel icono, infoEstado;
    private JLabel fechaEvidencia, id, reference, descipcion1;
    private String idEvidencia;
    //private JLabel separador1 = new JLabel();
    private String descripcion, fecha;
    private String estado, numerReferencia;
    private ImageIcon separa = new ImageIcon("src/imagenes2/espaciador.png");
    private ImageIcon separa2 = new ImageIcon("src/imagenes2/separa50.png");//13, 71, 161//13, 71, 161
    //private Border borde = BorderFactory.createBevelBorder(0, (new Color(214,214,214)), new Color(60,63,65));
      private Border borde = BorderFactory.createLineBorder(new Color(204,204,204),2, true);
    public ManejadorEvidencia(String id, String referencia, String fecha, String descripcion, String estado) {

        //this.numerReferencia = referencia;
        this.idEvidencia = id;
        this.numerReferencia = referencia;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.id = new JLabel(id);
        this.reference = new JLabel(referencia);
        this.fechaEvidencia = new JLabel(fecha);
        this.descipcion1 = new JLabel(descripcion);
        //this.descrip = new JLabel(descriccion);

        if (estado.equals("EN-ESPERA")) {
            this.icono = new JLabel(new ImageIcon("src/imagenes2/en-aprobacion.png"));
        } else if (estado.equals("APROBADO")) {
           // System.out.println("validando aprobado");
            this.icono = new JLabel(new ImageIcon("src/imagenes2/aprobada.png"));
        } else if (estado.equals("RECHAZADA")) {
            this.icono = new JLabel(new ImageIcon("src/imagenes2/rechazada.png"));//src/magenes2/rechazada.png
        } else {
            this.icono = new JLabel(new ImageIcon("imagen/default.png"));
             System.out.println("validando aprobado");
        }
        JLabel n = new JLabel(separa);
        this.setBorder(borde);
        this.setBackground(new Color(238,238,238));
        this.setLayout(new FlowLayout());
        this.setSize(700, 30);
        //agregando componnetes
        this.add(this.id);

        this.add(this.reference);

        this.add(n);
        this.add(this.fechaEvidencia);
        JLabel n1 = new JLabel(separa);
        this.add(n1);
        this.add(descipcion1);
        JLabel n2 = new JLabel(separa2);
        this.add(n2);
        this.add(this.icono);

        this.repaint();
        this.revalidate();

    }

    public JLabel getIcono() {
        return icono;
    }

    public String getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(String idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIcono(JLabel icono) {
        this.icono = icono;
    }

    public JLabel getId() {
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public Border getBorde() {
        return borde;
    }

    public void setBorde(Border borde) {
        this.borde = borde;
    }

}
