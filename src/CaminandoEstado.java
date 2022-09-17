package src;

public class CaminandoEstado implements Estado {

    private Robot robot;

    @Override
    public void suspender() {
        System.out.println("Esta bien, me suspendere");
        robot.setEstado(robot.getSuspendido());
    }

    @Override
    public void activar() {
        System.out.println("Ya estoy activo, estoy caminando para tomar tu orden");
    }


    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("Aun no puedo cocinar nada, ya que estoy caminando para atenderte");
    }

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

    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("Te leere el menu cuando te este atendiendo, ahora estoy caminando");
        
    }

    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("Estoy caminando, por lo que no puedo tomar tu orden");
        
    }

    @Override
    public String obtenerNombreDelEstado() {
        return "Caminando";
    }

}
