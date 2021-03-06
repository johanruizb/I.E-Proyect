package administrador;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author ALOMIA
 */
public class VistaAdministrador extends javax.swing.JFrame {

    private JPanel panel1, panel2;
    private final Border borde = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);

    public VistaAdministrador() {
        initComponents();
        addComponent();
        this.setSize(896, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BoxLayout(this.panel2, BoxLayout.Y_AXIS));
        panel1.add(panel2);
        add(panel1, BorderLayout.CENTER);

    }

    private void addComponent() {
        Tecnicos tecnico = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico1 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico2 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico3 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico4 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico5 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico6 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico7 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico8 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        Tecnicos tecnico9 = new Tecnicos("Victor Alfonso", "Alomia Angulo", "Total registros 18");
        panel2.add(tecnico);
        panel2.add(tecnico1);
        panel2.add(tecnico2);
        panel2.add(tecnico3);
        panel2.add(tecnico4);
        panel2.add(tecnico5);
        panel2.add(tecnico6);
        panel2.add(tecnico7);
        panel2.add(tecnico8);
        panel2.add(tecnico9);
        repaint();
        revalidate();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }
}
