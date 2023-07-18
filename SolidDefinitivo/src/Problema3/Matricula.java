/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
abstract class Matricula {
    protected double tarifa;


    public double obtenerTarifa() {
        return tarifa;
    }

    public abstract void calcularTarifa();
}