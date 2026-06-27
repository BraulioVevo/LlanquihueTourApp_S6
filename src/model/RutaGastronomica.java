package model;

/**
 * La clase representa una ruta gatronomica de Llanquihue Tour.
 * extends/herencia de {@link ServicioTuristico} agregando paradas de degustación.
 */

public class RutaGastronomica extends ServicioTuristico {

    private int cantidadDeParadas;

    /**
     * Constructor para crear una nueva ruta gastronómica
     * @param nombre Representa el nombre del tour gastronómico
     * @param duracionHoras Indica la duración aproximada del recorrido.
     * @param cantidadUsuarios La cantidad de participantes maximo
     * @param cantidadDeParadas Representa la cantidad de paradas gastronómicas por realizar en el recorrido.
     */
    public RutaGastronomica(String nombre, double duracionHoras, int cantidadUsuarios, int cantidadDeParadas) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.cantidadDeParadas = cantidadDeParadas;
    }

    public int getCantidadDeParadas() {
        return cantidadDeParadas;
    }

    public void setCantidadDeParadas(int cantidadDeParadas) {
        this.cantidadDeParadas = cantidadDeParadas;
    }

    /**
     * Combina los atributos generales de la clase base con el atributo especifico de la clase RutaGastronomica.
     * @return Cadena de texto con la información de la ruta.
     */

    @Override
    public String toString() {
        return super.toString() +
                " | Cantidad de paradas: " + cantidadDeParadas;
    }
}
