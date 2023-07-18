/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la Matricula Campamento:");
        System.out.print("Costo de transporte: ");
        double costoTransporte = scanner.nextDouble();
        System.out.print("Costo de comida: ");
        double costoComida = scanner.nextDouble();
        System.out.print("Costo de instructores: ");
        double costoInstructores = scanner.nextDouble();

        MatriculaCampamento mcamp = new MatriculaCampamento(costoTransporte, costoComida, costoInstructores);

        System.out.println("Ingrese los datos de la Matricula Colegio:");
        System.out.print("Costo de deportes: ");
        double costoDeportes = scanner.nextDouble();
        System.out.print("Costo de folletos: ");
        double costoFolletos = scanner.nextDouble();
        System.out.print("Costo de uniformes: ");
        double costoUniformes = scanner.nextDouble();
        System.out.print("Costo de laboratorios: ");
        double costoLaboratorios = scanner.nextDouble();

        MatriculaColegio mcolegio = new MatriculaColegio(costoDeportes, costoFolletos, costoUniformes, costoLaboratorios);

        tipos.agregarMatricula(mcamp);
        tipos.agregarMatricula(mcolegio);

        tipos.calcularPromedioTarifas();
        System.out.printf("Promedio de tarifas: %.2f\n", tipos.getPromedioMatriculas());

        scanner.close();
    }
}