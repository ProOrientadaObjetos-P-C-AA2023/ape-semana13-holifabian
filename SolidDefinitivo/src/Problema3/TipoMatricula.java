/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIOPC
 */
class TipoMatricula {
    private double promedioMatriculas;
    private List<Matricula> matriculas;

    public TipoMatricula() {
        matriculas = new ArrayList<>();
    }

    public void agregarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void calcularPromedioTarifas() {
        double sumaTarifas = 0;
        for (Matricula matricula : matriculas) {
            sumaTarifas += matricula.obtenerTarifa();
        }
        promedioMatriculas = sumaTarifas / matriculas.size();
    }
}

