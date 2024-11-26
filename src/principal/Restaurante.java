/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Restaurante {
     private final ConfiguracionDiaria configuracion;
    private final ArrayList<String> pedidos;
    private double ventasTotales;

    public Restaurante(ConfiguracionDiaria configuracion) {
        this.configuracion = configuracion;
        this.pedidos = new ArrayList<>();
        this.ventasTotales = 0;
    }

    public void facturarPedido() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del cliente
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Numero de telefono: ");
        String telefono = scanner.nextLine();
        System.out.print("Es cliente frecuente? (si/no): ");
        boolean clienteFrecuente = scanner.nextLine().equalsIgnoreCase("si");
        System.out.print("Es cliente de la tercera edad? (si/no): ");
        boolean terceraEdad = scanner.nextLine().equalsIgnoreCase("si");

        System.out.print("Ingrese el tipo de comida (economica, regular, premium): ");
        String tipoComida = scanner.nextLine();
        double precioBase = configuracion.getPrecio(tipoComida);

    
        double extras = configuracion.getCostoExtras();
        double total = precioBase + extras;

        
        if (terceraEdad) {
            total *= 0.75;
        } else if (clienteFrecuente) {
            total *= 0.85;
        }

        
        pedidos.add(String.format("%s - %s: $%.2f", nombre, tipoComida, total));
        ventasTotales += total;
        System.out.printf("Total a pagar: $%.2f%n", total);
    }

    public void mostrarResumenVentas() {
        System.out.println("\n--- Resumen del Dia ---");
        System.out.printf("Ventas totales: $%.2f%n", ventasTotales);
        System.out.println("Pedidos realizados:");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}


    

