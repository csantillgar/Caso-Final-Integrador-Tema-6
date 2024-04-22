package GestionDatosDinamicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GestionDatosDinamicos extends JPanel {
    private List<Pareja> datos;
    private DefaultListModel<Pareja> modeloLista;
    private JList<Pareja> listaDatos;

    public GestionDatosDinamicos() {
        datos = new ArrayList<>();
        modeloLista = new DefaultListModel<>();
        listaDatos = new JList<>(modeloLista);

        JButton botonAgregar = new JButton("Agregar");
        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí se debería implementar la lógica para agregar una nueva pareja de datos
                // Por ejemplo:
                int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero:"));
                double real = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número real:"));
                Pareja nuevaPareja = new Pareja(entero, real);
                datos.add(nuevaPareja);
                modeloLista.addElement(nuevaPareja);
            }
        });

        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí se debería implementar la lógica para eliminar una pareja de datos
                // Por ejemplo:
                int indiceSeleccionado = listaDatos.getSelectedIndex();
                if (indiceSeleccionado != -1) {
                    datos.remove(indiceSeleccionado);
                    modeloLista.remove(indiceSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un elemento para eliminar.");
                }
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2));
        panelBotones.add(botonAgregar);
        panelBotones.add(botonEliminar);

        setLayout(new BorderLayout());
        add(new JScrollPane(listaDatos), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }
}

