/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author USUARIOPC
 */
class PagoLuzElectrica extends Pago {
    Ciudad ciudad;
    double tarifaBase;
    double kilovatiosConsumidos;
    double costoKilovatio;

    public PagoLuzElectrica(Ciudad ciudad, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public void calcularPago() {
        if (ciudad.nombreCiudad.equals("LOJA")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "ciudad=" + ciudad +
                ", tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                ", pago=" + pago +
                '}';
    }
}
