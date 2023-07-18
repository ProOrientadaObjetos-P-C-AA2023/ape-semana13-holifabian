/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author USUARIOPC
 */
class PagoAguaPotable extends Pago {
    String tipo;
    double tarifaFija;
    double metrosCubicosConsumo;
    double costoConsumoCubicos;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void calcularPago() {
        if (tipo.equals("CASA")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        } else if (tipo.equals("COMERCIAL")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tipo='" + tipo + '\'' +
                ", tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                ", pago=" + pago +
                '}';
    }
}