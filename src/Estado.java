package src;

public interface Estado {
    public void suspender();

    public void activar();

    public void leerMenu(MenuCompleto menu);

    public void tomarOrden(MenuCompleto menu, int id);

    public void cocinar(MenuCompleto menu, int id);

    public void entregarComida();

    public void caminar();

}
