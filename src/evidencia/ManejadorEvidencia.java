/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ALOMIA
 */
public class ManejadorEvidencia extends JPanel {
    //private JPanel contenedor;
    private String id="",fecha="";
    private ImageIcon icono;
    private JLabel componente;
    public ManejadorEvidencia(String id){
        this.id = id;  
        
    }
    private void creacomponente(String id){
        componente= new JLabel(id);
        add(componente);
        
    }
    
}
