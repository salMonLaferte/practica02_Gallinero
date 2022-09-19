
/**
 * Representa un platillo del restaurante e implementa metodos
 * para acceder a su informacion y prepararlo.
 */
public abstract class Platillo {
    /** Identificador del platillo */
    protected int id;
    /** Nombre del platillo */
    protected String nombre;
    /** Descripción del platillo */
    protected String descripcion;
    /** Precio del platillo */
    protected int precio;
    /** Indicador de si el platillo lleva queso */
    protected boolean conQueso;
    /** Indicador de si el platillo es vegetariano */
    protected boolean esVegetariana;

    /**
     * Prepara el platillo, imprime los pasos de su preparación en la consola.
     */
    public abstract void preparaPlatillo();
    /**
     * Metodo que imprime la descripición de cada platillo.
     */
    @Override
    public final String toString() {
        String informacion = "id: " + id + "\n";
        informacion += "Nombre: " + nombre + "\n";
        informacion += "Descripcion : " + descripcion + "\n";
        if (conQueso)
            informacion += "Tiene queso \n";
        else
            informacion += "No tiene queso \n";
        if (esVegetariana)
            informacion += "Es vegetariana \n";
        else
            informacion += "No es vegetariana \n";

        return informacion;
    }

    /**
     * Regresa el identificador del platillo.
     * 
     * @return el id del platillo.
     */
    public int obtenerId() {
        return id;
    }
}
