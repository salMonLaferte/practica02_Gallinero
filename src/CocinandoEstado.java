package src;

public class CocinandoEstado implements Estado {

    private Robot robot;

    @Override
    public void suspender() {
        System.out.println("No puedo suspenderme, ya que estoy cocinando");

    }

    @Override
    public void activar() {
        System.out.println("Ya estoy activo, incluso estoy cocinando");

    }

    @Override
    public void leerMenu(MenuCompleto menu) {
        System.out.println("No puedo leerte el menu, ya que estoy cocinando");
    }

    @Override
    public void cocinar(MenuCompleto menu, int id) {
        robot.cocinarOrden(menu, id);

    }

    @Override
    public void entregarComida() {
        System.out.println("Te entrego tu comida, ahora me suspendere");
        robot.setEstado(robot.getSuspendido());
    }

    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        System.out.println("Ya tome tu orden :-}");        
    }

    @Override
    public void caminar() {
        System.out.println("No puedo caminar a donde estas, ya que estoy cocinando");
    }

    @Override
    public String obtenerNombreDelEstado() {
        return "Cocinando";
    }

}
