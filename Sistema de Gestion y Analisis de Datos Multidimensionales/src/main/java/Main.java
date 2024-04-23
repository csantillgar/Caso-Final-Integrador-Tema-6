import GestionDatosDinamicos.GestionDatosDinamicos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main extends JFrame {
    public Main() {
        // Botones para la gestión de datos dinámicos
        JButton botonGestionDatos = new JButton("Gestión de Datos Dinámicos");
        botonGestionDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame frame = new JFrame("Gestión de Datos Dinámicos");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setSize(400, 300);
                        frame.setLocationRelativeTo(null);

                        GestionDatosDinamicos gestionDatosDinamicos = new GestionDatosDinamicos();
                        frame.add(gestionDatosDinamicos);

                        frame.setVisible(true);
                    }
                });
            }
        });

        // Botones para el análisis y organización de información
        JButton botonAnalisisOrganizacion = new JButton("Análisis y Organización de Información");
        botonAnalisisOrganizacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "María", "Carlos");
                // Aquí podrías llamar a métodos de la clase AnalisisOrganizacionInformacion si la tienes definida
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 1));
        panelBotones.add(botonGestionDatos);
        panelBotones.add(botonAnalisisOrganizacion);

        add(panelBotones, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setSize(400, 200);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}



