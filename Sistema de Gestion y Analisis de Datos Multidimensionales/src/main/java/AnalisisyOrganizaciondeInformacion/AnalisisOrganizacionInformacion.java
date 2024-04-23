package AnalisisyOrganizaciondeInformacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class AnalisisOrganizacionInformacion extends JPanel {
    public AnalisisOrganizacionInformacion() {
        // Simulación de datos de ventas
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta("Producto A", 100, "Juan", "01/01/2024"));
        ventas.add(new Venta("Producto B", 150, "Ana", "02/01/2024"));
        ventas.add(new Venta("Producto C", 200, "Pedro", "03/01/2024"));
        ventas.add(new Venta("Producto D", 120, "María", "04/01/2024"));
        ventas.add(new Venta("Producto E", 180, "Carlos", "05/01/2024"));

        // Botones para ordenar y filtrar las ventas
        JButton botonOrdenarPorNombre = new JButton("Ordenar por Nombre");
        botonOrdenarPorNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.sort(ventas, new Comparator<Venta>() {
                    public int compare(Venta v1, Venta v2) {
                        return v1.getNombreCliente().compareTo(v2.getNombreCliente());
                    }
                });
                mostrarVentas(ventas);
            }
        });

        JButton botonOrdenarPorFecha = new JButton("Ordenar por Fecha");
        botonOrdenarPorFecha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.sort(ventas, new Comparator<Venta>() {
                    public int compare(Venta v1, Venta v2) {
                        return v1.getFecha().compareTo(v2.getFecha());
                    }
                });
                mostrarVentas(ventas);
            }
        });

        // Botón para filtrar ventas
        JButton botonFiltrarPorProducto = new JButton("Filtrar por Producto 'Producto A'");
        botonFiltrarPorProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<Venta> ventasFiltradas = new ArrayList<>();
                for (Venta venta : ventas) {
                    if (venta.getProducto().equals("Producto A")) {
                        ventasFiltradas.add(venta);
                    }
                }
                mostrarVentas(ventasFiltradas);
            }
        });

        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1));
        panelBotones.add(botonOrdenarPorNombre);
        panelBotones.add(botonOrdenarPorFecha);
        panelBotones.add(botonFiltrarPorProducto);

        // Lista de ventas
        JList<Venta> listaVentas = new JList<>(ventas.toArray(new Venta[0]));

        setLayout(new BorderLayout());
        add(new JScrollPane(listaVentas), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void mostrarVentas(List<Venta> ventas) {
        JList<Venta> listaVentas = new JList<>(ventas.toArray(new Venta[0]));
        JOptionPane.showMessageDialog(null, new JScrollPane(listaVentas), "Ventas", JOptionPane.PLAIN_MESSAGE);
    }
}

class Venta {
    private String producto;
    private double monto;
    private String nombreCliente;
    private String fecha;

    public Venta(String producto, double monto, String nombreCliente, String fecha) {
        this.producto = producto;
        this.monto = monto;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String toString() {
        return "Producto: " + producto + ", Monto: " + monto + ", Cliente: " + nombreCliente + ", Fecha: " + fecha;
    }
}

