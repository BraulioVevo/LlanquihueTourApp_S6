package model;

/**
 * Representa un paseo Lacustre por el lago Llanquihue
 * extends/herencia de {@link ServicioTuristico} especificando el tipo embarcación.
 */

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    /**
     * Constructor para crear un nuevo paseo Lacustre.
     * @param nombre Indica el nombre del paseo.
     * @param duracionHoras Indica el tiempo aproximado que dura la navegación.
     * @param cantidadUsuarios Indica la cantidad de usuarios máximo permitidos a bordo.
     * @param tipoEmbarcacion Indica el tipo de transporte maritimo (ej: "Velero", "Lancha" etc.
     */
    public PaseoLacustre(String nombre, double duracionHoras, int cantidadUsuarios, String tipoEmbarcacion) {
        super(nombre, duracionHoras, cantidadUsuarios);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Combina los atributos generales de la clase base con el atributo especifico de la clase PaseoLacustre
     * @return Cadena de texto con el tipo de embarcación a utilizar
     */
    @Override
    public String toString() {
        return super.toString() +
                " | Tipo de embarcación: " + tipoEmbarcacion;
    }
}
