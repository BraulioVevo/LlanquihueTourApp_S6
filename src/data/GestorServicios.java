package data;

import model.*;

/**
 * Clase encargada de manejar la logica representativa y creación de ejemplares de prueba
 * para los distintos servicios turisticos de Llanquihue Tour.
 */

public class GestorServicios {

    public ServicioTuristico crearServicioTuristico(){
        return new ServicioTuristico("Tour Basico Llanquihue",1 ,10);
    }

    public ServicioTuristico crearRutaGastronomica(){
        return new RutaGastronomica("La ruta del Kuchen", 1.30,7,4);
    }

    public ServicioTuristico crearPaseoLacustre(){
        return new PaseoLacustre("Paseo por el Lago",1.10,14, "Velero");
    }

    public ServicioTuristico crearExcursionCultural(){
        return new ExcursionCultural("Visita historica", 1.25,15, "Museo del Lago Llanquihue");
    }

}
