
/**
 * Clase que implementa el estado de suspendido
 */
public class SuspendidoEstado implements Estado {
    /**
     * Robot que sera el sujeto de nuestro Estado
     */
    Robot robot;

    /**
     * Constructor de la clase SuspendidoEstado que inicializa al robot
     * @param robot que realiza la acción
     */
    SuspendidoEstado(Robot robot) {
        this.robot = robot;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void suspender() {
        System.out.println("Ya estoy suspendido");

    }

    /**
     * Cambia el estado del robot de suspendido a caminando
     */
    @Override
    public void activar() {
        System.out.println("ok, me activare");
        robot.setEstado(robot.getCaminando());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("No puedo, estoy suspendido");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("No puedo cocinar, estoy suspendido");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void entregarComida() {
        System.out.println("No puedo entregar nada, ya que estoy suspendido");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("No puedo tomar tu orden porque estoy suspendido");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void caminar() {
        System.out.println("No puedo caminar ahora, ya que estoy suspendido");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreDelEstado() {
        return "Suspendido";
    }

}
