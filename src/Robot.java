package src;

import java.util.Iterator;

public class Robot {

    private Estado suspendidoEstado;
    private Estado cocinandoEstado;
    private Estado caminandoEstado;
    private Estado atendiendoEstado;

    private Estado estadoActual;

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

    public void cocinar(MenuCompleto menu, int id) {
        estadoActual.cocinar(menu, id);
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

    public Estado getEstado(){
        return estadoActual;
    }

    /**
     * Imprime en la consola los tres submenus, en el orden: general, diario y especial.
     * @param menu Menu el cual contiene las instancias de cada submenu a imprimir.
     */
    public void imprimirMenuCompleto(MenuCompleto menu){
        //Imprime menu general.
        System.out.println("LOS SIGUIENTES PLATILLOS CORRESPONDEN AL MENU GENERAL BEEP BOOP");
        Iterator<Platillo> iterador = menu.obtenerIteradorMenuGeneral();
        imprimirSubMenu(iterador);
        //Imprime menu diario.
        System.out.println("LOS SIGUIENTES PLATILLOS CORRESPONDEN AL MENU DIARIO BEEP BOOP");
        iterador = menu.obtenerIteradorMenuDiario();
        imprimirSubMenu(iterador);
        //Imprime menu especial.
        System.out.println("LOS SIGUIENTES PLATILLOS CORRESPONDEN AL MENU ESPECIAL BEEP BOOP");
        iterador = menu.obtenerMenuEspecial();
        imprimirSubMenu(iterador);
    }

    /**
     * Recorre e imprime cada elemento de la coleccion de platillos desde la posicion actual 
     * a la cual apunta el iterador hasta el final de la coleccion.
     * @param iterador Iterador que recorre la coleccion desde su posicion actual hasta el final.
     */
    private void imprimirSubMenu(Iterator<Platillo> iterador){
        while(iterador.hasNext()){
            Platillo platillo = iterador.next();
            System.out.println(platillo);   
        }
    }

    /**
     * Busca el id especificado en los platillos de los menus: general, diario y especial dentro 
     * de la instancia del menu completo para determinar si exsite un platillo con ese id.
     * @param menu Instancia del menu completo donde se buscara el platillo con determinado id.
     * @param id Identificador del platillo que se busca saber si está en el menu o no.
     * @return true si existe un platillo con el id especificado, false en caso contrario.
     * 
     */
    public boolean validarOrden(MenuCompleto menu, int id){
        Iterator<Platillo> iterador = menu.obtenerIteradorMenuGeneral();
        if(buscaPlatillo(iterador, id))
            return true;
        iterador = menu.obtenerIteradorMenuDiario();
        if(buscaPlatillo(iterador, id))
            return true;
        iterador = menu.obtenerMenuEspecial();
        if(buscaPlatillo(iterador, id))
            return true;
        return false;
    }

    /**
     * Busca un platillo con el id especificado desde la posicion actual del iterador hasta 
     * el final de la coleccion de platillos.
     * @param iterador Iterador que recorre la coleccion de platillos desde la posicion actual hasta el final.
     * @param id  Identificador del platillo que se busca.
     * @return true si existe un platillo con el id especificado en el recorrido desde la posicion actual del iterador
     * hasta el final de la coleccion, falso en caso contrario.
     */
    private boolean buscaPlatillo(Iterator<Platillo> iterador, int id){
        while(iterador.hasNext()){
            Platillo platillo = iterador.next();
            if(platillo.obtenerId() == id){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca y prepara el primer platillo encontrado en el menu con el id especificado.
     * La busqueda se realiza en el orden: menu general, menu diario y menu especial.
     * @param menu Instancia de Menu completo que contiene los submenus: general, diario y especial.
     * @param id Identificador del platillo que se quiere preparar.
     */
    public void cocinarOrden(MenuCompleto menu, int id){
        Iterator<Platillo> iterador = menu.obtenerIteradorMenuGeneral();
        if(buscaYPreparaPlatillo(iterador, id))
            return;
        iterador = menu.obtenerIteradorMenuDiario();
        if(buscaYPreparaPlatillo(iterador, id))
            return;
        iterador = menu.obtenerMenuEspecial();
        buscaYPreparaPlatillo(iterador, id);
    }

    /**
     * Recorre la coleccion de platillos desde la posicion actual del iterador hasta el final de 
     * la coleccion y cocina el primer platillo cuya id sea la especificada.
     * @param iterador Iterador que recorre desde la posicion actual hasta el final de la coleccion.
     * @param id El identificador del platillo que se quiere preparar.
     * @return true si se preparo un platillo, falso en caso contrario.
     */
    private boolean buscaYPreparaPlatillo(Iterator<Platillo> iterador, int id){
        while(iterador.hasNext()){
            Platillo platillo = iterador.next();
            if(platillo.obtenerId() == id){
                platillo.preparaPlatillo();
                return true;
            }
        }
        return false;
    }
    
}