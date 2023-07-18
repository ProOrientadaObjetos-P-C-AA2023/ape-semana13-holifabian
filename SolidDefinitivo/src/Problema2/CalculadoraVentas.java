/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

import java.util.ArrayList;

/**
 *
 * @author USUARIOPC
 */
class CalculadoraVentas {
    public double calcularPrecioTotal(ArrayList<Televisor> televisores) {
        double precioTotal = 0;
        for (Televisor televisor : televisores) {
            precioTotal += televisor.obtenerPrecio();
        }
        return precioTotal;
    }

    public double televisorMasCaro(ArrayList<Televisor> televisores) {
        double precioMasCaro = Double.MIN_VALUE;// Inicializa el precio más caro con el valor mínimo posible para un double
        for (Televisor televisor : televisores) {
            if (televisor.obtenerPrecio() > precioMasCaro) {
                precioMasCaro = televisor.obtenerPrecio();
            }
        }
        return precioMasCaro;
    }

    public String listaMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
}