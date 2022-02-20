/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import java.awt.Color;
import java.awt.FlowLayout;
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
    private JLabel icono, infoEstado, carpetaIcono;
    private JLabel fechaEvidencia, iden, reference, descipcion1;
    private String idEvidencia;
    //private JLabel separador1 = new JLabel();
    private String descripcion, fecha;
    private String estado, numeroReferencia;
    private ImageIcon carpeta = new ImageIcon("src/imagenes2/folder.png");
    //private ImageIcon separa2 = new ImageIcon("src/imagenes2/separa50.png");//13, 71, 161//13, 71, 161
    //private Border borde = BorderFactory.createBevelBorder(0, (new Color(214,214,214)), new Color(60,63,65));
    private Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);

    public ManejadorEvidencia(String referencia, String fecha, String descripcion, String estado) {
//     
        
        //this.idEvidencia = id;
        this.numeroReferencia = referencia;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.carpetaIcono = new JLabel(" ID:", new ImageIcon("src/imagenes2/folder.png"), SwingConstants.CENTER);
        //this.iden = new JLabel(id,SwingConstants.CENTER);
        this.reference = new JLabel(referencia, SwingConstants.LEFT);
        this.fechaEvidencia = new JLabel(fecha, SwingConstants.CENTER);
        this.descipcion1 = new JLabel(descripcion, SwingConstants.RIGHT);
        //this.descrip = new JLabel(descriccion);

        if (estado.equals("EN-ESPERA")) {
            this.icono = new JLabel(new ImageIcon("src/imagenes2/en-aprobacion.png"), SwingConstants.CENTER);
        } else if (estado.equals("APROBADO")) {
            // System.out.println("validando aprobado");
            this.icono = new JLabel(new ImageIcon("src/imagenes2/aprobada.png"), SwingConstants.CENTER);
        } else if (estado.equals("RECHAZADA")) {
            this.icono = new JLabel(new ImageIcon("src/imagenes2/rechazada.png"), SwingConstants.CENTER);
        } else {
            this.icono = new JLabel(new ImageIcon("imagen/default.png"), SwingConstants.CENTER);
            System.out.println("validando aprobado");
        }
        //JLabel n = new JLabel(separa);

        // iden.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(borde);
        this.setBackground(new Color(238, 238, 238));
        this.setLayout(new GridLayout(1,5));
       // this.setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();
       

        this.setSize(500, 25);
        carpetaIcono.setSize(30, 30);
        this.add(carpetaIcono);
    
        this.add(this.reference);

        this.add(this.fechaEvidencia);
      
        this.add(descipcion1);
        
        this.add(this.icono);

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

    ;

    public String getFecha() {
        return fecha;
    }

    public String getNumerReferencia() {
        return numeroReferencia;
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
        return iden;
    }

    public void setId(JLabel id) {
        this.iden = id;
    }

    public Border getBorde() {
        return borde;
    }

    public void setBorde(Border borde) {
        this.borde = borde;
    }

}
