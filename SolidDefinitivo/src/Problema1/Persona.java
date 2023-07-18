/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author USUARIOPC
 */
class Persona {
    String nombre;
    String apellido;
    int edad;
    String cedula;
    Ciudad ciudad;

    public Persona(String nombre, String apellido, int edad, String cedula, Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }
}
