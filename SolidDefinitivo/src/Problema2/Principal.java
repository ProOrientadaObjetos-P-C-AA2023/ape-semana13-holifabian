/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Televisor> tvs = new ArrayList<>();
        System.out.println("Ingrese número de televisores: ");
        int numTV = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numTV; i++) {
            System.out.println("Ingrese los datos del televisor " + i + ":");
            Televisor televisor = new Televisor();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            televisor.establecerMarca(marca);

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            televisor.establecerPrecio(precio);

            tvs.add(televisor);
            System.out.println();
        }

        CalculadoraVentas calculadora = new CalculadoraVentas();
        double precioTotal = calculadora.calcularPrecioTotal(tvs);
        System.out.println("Precio total de los televisores: " + precioTotal);

        double precioMasCaro = calculadora.televisorMasCaro(tvs);
        System.out.println("Precio del televisor más caro: " + precioMasCaro);

        String marcasVendidas = calculadora.listaMarcasVendidas(tvs);
        System.out.println("Marcas vendidas:\n" + marcasVendidas);

        scanner.close();
    }
}