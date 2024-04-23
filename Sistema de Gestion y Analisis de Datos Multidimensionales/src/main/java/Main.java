import GestionDatosDinamicos.GestionDatosDinamicos;
import AnalisisyOrganizaciondeInformacion.AnalisisOrganizacionInformacion;
import MapasyAsociacióndeDatos.MapasAsociacionDatosPanel;
import IndexaciónyVisualizacióndeArchivos.IndexadorArchivos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.File;
import java.util.List;

public class Main extends JFrame {
    private IndexadorArchivos indexadorArchivos;

    public Main() {
        indexadorArchivos = new IndexadorArchivos();

        // Personalizar el aspecto del JFrame
        UIManager.put("Button.background", new Color(240, 240, 240));
        UIManager.put("Button.font", new Font("Times New Roman", Font.PLAIN, 20));
        UIManager.put("Button.border", BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // Título de la tarea
        JLabel tituloTarea = new JLabel("Caso Final Integrador Tema 6");
        tituloTarea.setFont(new Font("Times New Roman", Font.BOLD, 25));
        tituloTarea.setHorizontalAlignment(SwingConstants.CENTER);
        tituloTarea.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

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


        // Botón para la indexación y visualización de archivos
        JButton botonIndexacionArchivos = new JButton("Indexación y Visualización de Archivos");
        botonIndexacionArchivos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame frame = new JFrame("Indexación y Visualización de Archivos");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setSize(400, 300);
                        frame.setLocationRelativeTo(null);

                        JTextArea areaTexto = new JTextArea();
                        JScrollPane scrollPane = new JScrollPane(areaTexto);
                        frame.add(scrollPane);

                        // Indexar archivos y mostrarlos en el área de texto
                        indexaryMostrarArchivos(areaTexto);

                        frame.setVisible(true);
                    }
                });
            }
        });

        // Nombre del autor
        JLabel nombreAutor = new JLabel("Cintia Santillán García");
        nombreAutor.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        nombreAutor.setHorizontalAlignment(SwingConstants.CENTER);
        nombreAutor.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));


        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 1, 10, 10)); // Añadir espaciado entre botones
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Añadir margen al panel
        panelBotones.add(botonGestionDatos);
        panelBotones.add(botonAnalisisOrganizacion);
        panelBotones.add(botonMapasAsociacionDatos);
        panelBotones.add(botonIndexacionArchivos);

        // Personalizar el JFrame
        getContentPane().setBackground(new Color(230, 230, 230));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(tituloTarea, BorderLayout.NORTH);
        getContentPane().add(panelBotones, BorderLayout.CENTER);
        getContentPane().add(nombreAutor, BorderLayout.SOUTH);
        pack(); // Ajustar el tamaño del JFrame automáticamente
        setSize(600, 500); // Ajustar el tamaño del JFrame
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }


    private void indexaryMostrarArchivos(JTextArea areaTexto) {
        // Directorio a indexar (puedes cambiarlo por el directorio que desees)
        File directorio = new File(System.getProperty("user.dir"));

        // Indexar archivos
        indexadorArchivos.indexarDirectorio(directorio);

        // Ordenar archivos indexados
        indexadorArchivos.ordenarArchivosIndexados();

        // Obtener archivos indexados
        List<String> archivosIndexados = indexadorArchivos.obtenerArchivosIndexados();

        // Mostrar archivos indexados ordenados en el área de texto
        for (String archivo : archivosIndexados) {
            areaTexto.append(archivo + "\n");
        }
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

