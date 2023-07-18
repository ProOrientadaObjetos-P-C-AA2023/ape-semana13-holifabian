/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
class MatriculaMaternal extends Matricula {
    public double costodesayunos;
    public double costoalmuerzo;
    public double costomedico;

    public MatriculaMaternal(double costodesayunos, double costoalmuerzo, double costomedico) {
        super();
        this.costodesayunos = costodesayunos;
        this.costoalmuerzo = costoalmuerzo;
        this.costomedico = costomedico;
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        tarifa = costodesayunos + costoalmuerzo + costomedico;
    }
}
