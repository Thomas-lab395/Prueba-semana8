/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Principal {
   
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConfiguracionDiaria configuracion = new ConfiguracionDiaria();
        configuracion.configurarPrecios();

        Restaurante restaurante = new Restaurante(configuracion);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Facturar pedido");
            System.out.println("2. Mostrar resumen del dia");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    restaurante.facturarPedido();
                    break;
                case 2:
                    restaurante.mostrarResumenVentas();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema. Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        }
    }
}
    

