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
import javax.swing.border.Border;
import reutilizable.EmptySpace;

/**
 *
 * @author ALOMIA
 */
public class ManejadorEvidencia extends JPanel implements Serializable {

    private JLabel identificador, fechaEvidencia, descipcion1, estado; //,iconoEstado;
    private EmptySpace colorEstado;
    private ImageIcon carpeta;
    private Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);
    private JPanel state = new JPanel(new GridBagLayout());

    public ManejadorEvidencia(String referencia, String fecha, String descripcion, String estado) {

        this.carpeta = new ImageIcon(getClass().getResource("/img/gui/carpeta.png"));

        this.identificador = new JLabel(referencia, carpeta, JLabel.LEFT);
        this.fechaEvidencia = new JLabel(fecha, JLabel.LEFT);
        this.estado = new JLabel(descripcion, JLabel.CENTER);
        this.colorEstado = new EmptySpace(12, EmptySpace.ALTO);

        switch (estado) {
            case "EN-ESPERA":
                this.colorEstado.setColor(Color.ORANGE);
                break;
            case "APROBADO":
                this.colorEstado.setColor(Color.GREEN.darker());
                break;
            case "RECHAZADA":
                this.colorEstado.setColor((Color.RED.darker()));
                break;
            default:
                this.colorEstado.setColor(Color.MAGENTA.darker());
                break;
        }

        this.setBorder(borde);
        this.setBackground(new Color(238, 238, 238));
        this.setLayout(new GridBagLayout());

        GridBagConstraints limites = new GridBagConstraints();

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
        state.add(colorEstado, limites);
        limites.gridx = 3;
        this.add(state, limites);

        this.repaint();
        this.revalidate();

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
}
