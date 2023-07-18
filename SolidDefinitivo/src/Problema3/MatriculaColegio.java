/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
class MatriculaColegio extends Matricula {
    public double costodeportes;
    public double costofolletos;
    public double  costouniformes;
    public double costolaboratorios;

    public MatriculaColegio(double costodeportes, double costofolletos, double costouniformes, double costolaboratorios) {
        super();
        this.costodeportes = costodeportes;
        this.costofolletos = costofolletos;
        this.costouniformes = costouniformes;
        this.costolaboratorios = costolaboratorios;
        calcularTarifa();
    }

    @Override
    public void calcularTarifa() {
        tarifa = costodeportes + costofolletos + costouniformes + costolaboratorios;
    }
}