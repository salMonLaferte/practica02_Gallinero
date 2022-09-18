/**
 * Clase que implementa el estado de caminando
 */
public class CaminandoEstado implements Estado {
    Robot robot;

    /**
     * Constructor que inicializa al robot
     * 
     * @param robot
     */
    CaminandoEstado(Robot robot) {
        this.robot = robot;
    }

    /**
     * Metodo que suspende al robot, lo cambia de estado
     */
    @Override
    public void suspender() {
        System.out.println("Esta bien, me suspendere");
        robot.setEstado(robot.getSuspendido());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activar() {
        System.out.println("Ya estoy activo, estoy caminando para tomar tu orden");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("Aun no puedo cocinar nada, ya que estoy caminando para atenderte");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void entregarComida() {
        System.out.println("No le puedo entregar nada, estoy caminando");

    }

    /**
     * Accion que cambia el estado del robot, de caminando a atendiendo
     */
    @Override
    public void caminar() {
        System.out.println("Estoy llegando, ¡listo para atenderte!");
        robot.setEstado(robot.getAtendiendo());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("Te leere el menu cuando te este atendiendo, ahora estoy caminando");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("Estoy caminando, por lo que no puedo tomar tu orden");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreDelEstado() {
        return "Caminando";
    }

}
