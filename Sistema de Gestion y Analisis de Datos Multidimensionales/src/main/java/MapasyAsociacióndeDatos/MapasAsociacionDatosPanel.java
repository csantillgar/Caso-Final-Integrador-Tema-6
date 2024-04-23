package MapasyAsociacióndeDatos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MapasAsociacionDatosPanel extends JPanel {
    private Map<Integer, String> mapaEnterosLetras;

    public MapasAsociacionDatosPanel() {
        mapaEnterosLetras = new HashMap<>();
        mapaEnterosLetras.put(1, "Uno");
        mapaEnterosLetras.put(2, "Dos");
        mapaEnterosLetras.put(3, "Tres");
        mapaEnterosLetras.put(4, "Cuatro");
        mapaEnterosLetras.put(5, "Cinco");

        JLabel labelTitulo = new JLabel("Mapa de Asociación de Datos");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton botonMostrar = new JButton("Mostrar Mapa");
        botonMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<Integer, String> entry : mapaEnterosLetras.entrySet()) {
                    sb.append("Número: ").append(entry.getKey()).append(", Letra: ").append(entry.getValue()).append("\n");
                }
                areaTexto.setText(sb.toString());
            }
        });

        setLayout(new BorderLayout());
        add(labelTitulo, BorderLayout.NORTH);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        add(botonMostrar, BorderLayout.SOUTH);
    }
}
