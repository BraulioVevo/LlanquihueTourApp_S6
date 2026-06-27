package model;

/**
 * La clase representa una excursión culturual guiada
 * extends/herencia de {@link ServicioTuristico} agrega el nombre de un lugar historico por visitar
 */
public class ExcursionCultural extends ServicioTuristico{

    private String lugarHistorico;

    /**
     * Constructor para instanciar una Excursión Cultural
     * @param nombre Representa el nombre de la excursión por realizar
     * @param duracionHoras Indica la duración del recorrido
     * @param cantidadUsuarios Indica el numero de cupos para los visitantes
     * @param lugarHistorico El nombre del sitio que será visitado
     */
    public ExcursionCultural(String nombre, double duracionHoras, int cantidadUsuarios, String lugarHistorico) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Combina los atributos generales de la clase base con el atributo especifico de la clase ExcursionCultural
     * @return Cadena de texto con los datos de la Excursión cultural
     */
    @Override
    public String toString() {
        return super.toString() +
                " | Lugar historico por visitar: " + lugarHistorico;
    }
}
