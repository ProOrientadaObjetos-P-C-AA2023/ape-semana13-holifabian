/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
class MatriculaCampamento extends Matricula {
    public double costotransporte;
    public double costocomida;
    public double costoinstructores;

    public MatriculaCampamento(double costotransporte, double costocomida, double costoinstructores) {
        super();
        this.costotransporte = costotransporte;
        this.costocomida = costocomida;
        this.costoinstructores = costoinstructores;
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        tarifa = costotransporte + costocomida + costoinstructores;
    }
}