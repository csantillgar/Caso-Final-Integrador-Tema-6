import GestionDatosDinamicos.GestionDatosDinamicos;
import AnalisisyOrganizaciondeInformacion.AnalisisOrganizacionInformacion;
import MapasyAsociacióndeDatos.MapasAsociacionDatosPanel;
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
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame frame = new JFrame("Análisis y Organización de Información");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setSize(400, 300);
                        frame.setLocationRelativeTo(null);

                        AnalisisOrganizacionInformacion analisisOrganizacionInformacion = new AnalisisOrganizacionInformacion();
                        frame.add(analisisOrganizacionInformacion);

                        frame.setVisible(true);
                    }
                });
            }
        });

        // Botones para el módulo de mapas y asociación de datos
        JButton botonMapasAsociacionDatos = new JButton("Mapas y Asociación de Datos");
        botonMapasAsociacionDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame frame = new JFrame("Mapas y Asociación de Datos");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setSize(400, 300);
                        frame.setLocationRelativeTo(null);
                        MapasAsociacionDatosPanel mapasAsociacionDatosPanel = new MapasAsociacionDatosPanel();
                        frame.add(mapasAsociacionDatosPanel);
                        frame.setVisible(true);
                    }
                });
            }
        });


        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));
        panelBotones.add(botonGestionDatos);
        panelBotones.add(botonAnalisisOrganizacion);
        panelBotones.add(botonMapasAsociacionDatos);

        add(panelBotones, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setSize(400, 300);
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


