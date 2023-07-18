package Problema1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Ciudad ciudadLoja = new Ciudad("LOJA");
        Persona persona = new Persona("Juan", "Pérez", 30, "1234567890", ciudadLoja);

        ArrayList<Pago> pagos = new ArrayList<>();

        DatosAgua datosAgua = new DatosAgua();
        double[][] informacionCasaAgua = datosAgua.datosCasas();
        for (double[] informacion : informacionCasaAgua) {
            PagoAguaPotable pagoAgua = new PagoAguaPotable("CASA", informacion[0], informacion[1], informacion[2]);
            pagos.add(pagoAgua);
        }

        double[][] informacionComercialAgua = datosAgua.datosComerciales();
        for (double[] informacion : informacionComercialAgua) {
            PagoAguaPotable pagoAguaComercial = new PagoAguaPotable("COMERCIAL", informacion[0], informacion[1], informacion[2]);
            pagos.add(pagoAguaComercial);
        }

        DatosLuz datosLuz = new DatosLuz();
        double[][] informacionLuzCasa = datosLuz.datosLoja();
        for (double[] informacion : informacionLuzCasa) {
            PagoLuzElectrica pagoLuz = new PagoLuzElectrica(ciudadLoja, informacion[0], informacion[1], informacion[2]);
            pagos.add(pagoLuz);
        }

        double[][] informacionLuzComercio = datosLuz.datosGeneral();
        for (double[] informacion : informacionLuzComercio) {
            PagoLuzElectrica pagoLuzComercial = new PagoLuzElectrica(new Ciudad("OTRA"), informacion[0], informacion[1], informacion[2]);
            pagos.add(pagoLuzComercial);
        }

        DatosPropiedades datosPropiedades = new DatosPropiedades();
        double[][] informacionPropiedades = datosPropiedades.datos();
        for (double[] informacion : informacionPropiedades) {
            PagoPredial pagoPredial = new PagoPredial(informacion[0], informacion[1]);
            pagos.add(pagoPredial);
        }

        DatosTelefono datosTelefono = new DatosTelefono();
        double[][] informacionTelefono = datosTelefono.datos();
        for (double[] informacion : informacionTelefono) {
            PagoTelefonoConvencional pagoTelefono = new PagoTelefonoConvencional(informacion[0], informacion[1], informacion[2]);
            pagos.add(pagoTelefono);
        }

        BilleteraPagos billeteraPagos = new BilleteraPagos(persona, "Febrero", pagos);
        billeteraPagos.calcularGastoPagos();

        System.out.println(billeteraPagos);
    }
}

