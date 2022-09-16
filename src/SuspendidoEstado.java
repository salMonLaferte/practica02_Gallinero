package src;

public class SuspendidoEstado implements Estado {

    private Robot robot;

    @Override
    public void suspender() {
        System.out.println("Ya estoy suspendido");

    }

    @Override
    public void activar() {
        System.out.println("ok, me activare");
        robot.setEstado(robot.getCaminando());

    }

    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("No puedo, estoy suspendido");

    }

    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("No puedo cocinar, estoy suspendido");

    }

    @Override
    public void entregarComida() {
        System.out.println("No puedo entregar nada, ya que estoy suspendido");

    }

    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("No puedo tomar tu orden porque estoy suspendido");
        
    }

    @Override
    public void caminar() {
        System.out.println("No puedo caminar ahora, ya que estoy suspendido");
        
    }

}
