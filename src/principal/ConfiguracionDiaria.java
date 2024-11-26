/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class ConfiguracionDiaria {
    private double precioEconomica;
    private double precioRegular;
    private double precioPremium;
    private double costoExtras;

    // Métodos para configurar los precios
    public void configurarPrecios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los precios del dia:");
        System.out.print("Precio de comida economica: ");
        precioEconomica = scanner.nextDouble();
        System.out.print("Precio de comida regular: ");
        precioRegular = scanner.nextDouble();
        System.out.print("Precio de comida premium: ");
        precioPremium = scanner.nextDouble();
        System.out.print("Costo de extras: ");
        costoExtras = scanner.nextDouble();
    }

    public double getPrecio(String tipoComida) {
        switch (tipoComida.toLowerCase()) {
            case "economica":
                return precioEconomica;
            case "regular":
                return precioRegular;
            case "premium":
                return precioPremium;
            default:
                return 0;
        }
    }

    public double getCostoExtras() {
        return costoExtras;
    }
}

