import GestionDatosDinamicos.GestionDatosDinamicos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Gestión de Datos Dinámicos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setLocationRelativeTo(null);

                GestionDatosDinamicos gestionDatosDinamicos = new GestionDatosDinamicos();
                frame.add(gestionDatosDinamicos);

                frame.setVisible(true);
            }
        });
    }
}
