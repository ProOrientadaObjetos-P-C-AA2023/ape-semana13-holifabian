/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
class MatriculaEscuela extends Matricula {
    public double costolibros;
    public double costodeportes;
    public double costofolletos;
    public double costouniformes;

    public MatriculaEscuela(double costolibros, double costodeportes, double costofolletos, double costouniformes) {
        super();
        this.costolibros = costolibros;
        this.costodeportes = costodeportes;
        this.costofolletos = costofolletos;
        this.costouniformes = costouniformes;
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        tarifa = costolibros + costodeportes + costofolletos + costouniformes;
    }
}

