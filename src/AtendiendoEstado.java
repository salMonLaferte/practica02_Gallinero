package src;

public class AtendiendoEstado implements Estado {

    private Robot robot;

    @Override
    public void suspender() {
        System.out.println("No puedo suspenderme, estoy atendiendo");
    }

    @Override
    public void activar() {
        System.out.println("Ya estoy activo :p");

    }

    @Override
    public void leerMenu(MenuCompleto menu) {
        robot.imprimirMenuCompleto(menu);
    }

    
    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        if(robot.validarOrden(menu, id)){
            System.out.println("Ok, ahorita te lo preparo");
            robot.setEstado(robot.getCocinando());
        }else{
            System.out.println("El ID no es valido");
        }
        
    }

    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("Todavia no tomo tu orden >:-o");
    }


    @Override
    public void entregarComida() {
        System.out.println("Aun no tengo tu orden");

    }

    @Override
    public void caminar() {
        System.out.println("No necesito caminar, ya que estoy atendiendote");
        
    }

    @Override
    public String obtenerNombreDelEstado() {
        return "Atendiendo";
    }


}
