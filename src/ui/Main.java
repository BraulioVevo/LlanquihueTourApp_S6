package ui;

import model.*;
import data.GestorServicios;

/**
 * Clase Main que sirve como punto de despliegue en consola de los servicios generados
 * mediante el {@link data.GestorServicios}
 */

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        ServicioTuristico servicio1 = gestor.crearServicioTuristico();
        ServicioTuristico servicio2 = gestor.crearExcursionCultural();
        ServicioTuristico servicio3 = gestor.crearPaseoLacustre();
        ServicioTuristico servicio4 = gestor.crearRutaGastronomica();

        System.out.println("\t ==== Sistema de Servicios Llanquihue Tour App ====\n");

        System.out.println(servicio1 + "\n");
        System.out.println(servicio2 + "\n");
        System.out.println(servicio3 + "\n");
        System.out.println(servicio4);
    }
}