package src;

/**
 * Interface que nos da las acciones de los estados
 */
public interface Estado {

    /**
     * Dice si el robot se puede suspender o no dependiendo de su estado
     */
    public void suspender();

    /**
     * Dice si el robot se puede activar o no dependiendo de su estado
     */
    public void activar();

    /**
     * Dice si el robot puede leer el menu o no dependiendo de su estado
     */
    public void leerMenu(MenuCompleto menu);

    /**
     * Dice si el robot puede tomar tu orden o no dependiendo de su estado
     */
    public void tomarOrden(MenuCompleto menu, int id);

    /**
     * Dice si el robot puede cocinar o no dependiendo de su estado
     */
    public void cocinar(MenuCompleto menu, int id);

    /**
     * Dice si el robot puede entregar comida o no dependiendo de su estado
     */
    public void entregarComida();

    /**
     * Dice si el robot puede caminar o no dependiendo de su estado
     */
    public void caminar();

    /**
     * Da un string con el estado del robot
     * @return estado del robot en string
     */
    public String obtenerNombreDelEstado();
}
