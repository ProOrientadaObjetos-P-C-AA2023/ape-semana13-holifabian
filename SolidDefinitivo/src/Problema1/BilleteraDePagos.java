/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

import java.util.List;

/**
 *
 * @author USUARIOPC
 */
class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    private String mes;
    private List<Pago> pagos;

    public BilleteraPagos(Persona persona, String mes, List<Pago> pagos) {
        this.persona = persona;
        this.mes = mes;
        this.pagos = pagos;
    }

    public void calcularGastoPagos() {
        for (Pago pago : pagos) {
            pago.calcularPago();
            gastoPagos += pago.getPago();
        }
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", gastoPagos=" + gastoPagos +
                ", mes='" + mes + '\'' +
                ", pagos=" + pagos +
                '}';
    }
}