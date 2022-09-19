
/**
 * Clase que implementa el estado de cocinando
 */
public class CocinandoEstado implements Estado {
    /**
     * Robot que sera el sujeto de nuestro Estado
     */
    Robot robot;

    /**
     * Constructor de la clase CocinandoEstado que inicializa al robot
     * @param robot que realiza la acción
     */
    CocinandoEstado(Robot robot) {
        this.robot = robot;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void suspender() {
        System.out.println("No puedo suspenderme, ya que estoy cocinando");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activar() {
        System.out.println("Ya estoy activo, incluso estoy cocinando");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("No puedo leerte el menu, ya que estoy cocinando");
    }

    /**
     * Metodo que hace que el robot cocine
     * @param menu un menu completo
     * @param int del id
     */
    @Override
    public void cocinar(MenuCompleto menu, int id) {
        robot.cocinarOrden(menu, id);

    }

    /**
     * Metodo que suspende al robot despues de entregar la comida
     */
    @Override
    public void entregarComida() {
        System.out.println("Te entrego tu comida, ahora me suspendere");
        robot.setEstado(robot.getSuspendido());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("Ya tome tu orden :-}");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void caminar() {
        System.out.println("No puedo caminar a donde estas, ya que estoy cocinando");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreDelEstado() {
        return "Cocinando";
    }

}
