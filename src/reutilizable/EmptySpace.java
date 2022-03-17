package reutilizable;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author johan
 */
public class EmptySpace extends JLabel {

    public static final String ANCHO = "ANCHO";
    public static final String ALTO = "ALTO";

    protected EmptySpace() {
    }

    public EmptySpace(int alto, int ancho) {
        setOpaque(false);

        Border bordeVacio = BorderFactory.createEmptyBorder(alto, ancho, alto, ancho);
        setBorder(bordeVacio);
    }

    public EmptySpace(int size, String rellenar) {
        setOpaque(false);

        if (rellenar.equals(ALTO)) {
            Border bordeVacio = BorderFactory.createEmptyBorder(size, 0, size, 0);
            setBorder(bordeVacio);
        } else if (rellenar.equals(ANCHO)) {
            Border bordeVacio = BorderFactory.createEmptyBorder(0, size, 0, size);
            setBorder(bordeVacio);
        } else {
            setToolTipText("Por favor ingresa un rellenado correcto");
        }
    }

    public void setColor(Color c) {
        setText(" ");
        setBackground(c);
        setOpaque(true);
    }

}
