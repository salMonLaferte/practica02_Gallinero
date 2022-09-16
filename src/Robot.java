package src;

public class Robot {

    Estado suspendidoEstado;
    Estado cocinandoEstado;
    Estado caminandoEstado;
    Estado atendiendoEstado;

    Estado estadoActual;

    public Robot() {
        suspendidoEstado = new SuspendidoEstado();
        cocinandoEstado = new CocinandoEstado();
        caminandoEstado = new CaminandoEstado();
        atendiendoEstado = new AtendiendoEstado();

    }

    public void suspender() {
        estadoActual.suspender();
    }

    public void activar() {
        estadoActual.activar();
    }

    public void leerMenu(MenuCompleto menu) {
        estadoActual.leerMenu(menu);
    }

    public void imprimirMenu(MenuCompleto menu){
        //xd
        System.out.println("menuxd");
    }

    public void cocinar(MenuCompleto menu, int id) {
        estadoActual.cocinar(menu, id);
    }

    /**
     * 
     * @param menu
     * @param id
     * @return true si la orden es valida
     * 
     */
    public boolean validarOrden(MenuCompleto menu, int id){
        return true;
        //recibe menu
    }

    public void cocinarOrden(MenuCompleto menu, int id){
        //prepara platillo
        System.out.println("Se preparo");
    }

    public void entregarComida() {
        estadoActual.entregarComida();
    }


    public Estado getSuspendido() {
        return suspendidoEstado;
    }

    public Estado getAtendiendo() {
        return atendiendoEstado;
    }

    public Estado getCaminando() {
        return caminandoEstado;
    }

    public Estado getCocinando() {
        return cocinandoEstado;
    }

    public void setEstado(Estado estado) {
        estadoActual = estado;
    }
}
