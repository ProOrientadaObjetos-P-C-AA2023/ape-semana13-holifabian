/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

/**
 *
 * @author USUARIOPC
 */
class Televisor {

    private String marca;
    private double precio;

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecio(double p) {
        precio = p;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("TV:%s\n%s\n",
                obtenerMarca(),
                obtenerPrecio());
    }
}
