/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
class MatriculaJardin extends Matricula {
    public double costodesayunos;
    public double costolibros;
    public double costopaseos;

    public MatriculaJardin(double costodesayunos, double costolibros, double costopaseos) {
        super();
        this.costodesayunos = costodesayunos;
        this.costolibros = costolibros;
        this.costopaseos = costopaseos;
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        tarifa = costodesayunos + costolibros + costopaseos;
    }
}