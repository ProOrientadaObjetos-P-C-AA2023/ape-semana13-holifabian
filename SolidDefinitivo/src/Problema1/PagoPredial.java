/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author USUARIOPC
 */
class PagoPredial extends Pago {
    double valorPropiedad;
    double porcentaje;

    public PagoPredial(double valorPropiedad, double porcentaje) {
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    public void calcularPago() {
        pago = valorPropiedad - ((valorPropiedad * porcentaje) / 100);
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje +
                ", pago=" + pago +
                '}';
    }
}
