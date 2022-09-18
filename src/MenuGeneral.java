
import java.util.Iterator;

/**
 * Representa el menu general, fijo, que siempre contendra lo mismo. Implementa
 * metodos para iterar el menu.
 */
public class MenuGeneral {

    /** Coleccion con todos los platillos del menu. */
    private Platillo[] platillos;

    /**
     * Crea el menu general predeterminado con las hamburguesas: vegana, pavo y
     * atun.
     */
    public MenuGeneral() {
        platillos = new Platillo[3];
        platillos[0] = new HamburguesaVegana();
        platillos[1] = new HamburguesaPavo();
        platillos[2] = new HamburguesaAtun();
    }

    /**
     * Regresa un iterador sobre los platillos de este menu.
     * 
     * @return Un iterador para recorrer los platillos de este menu.
     */
    public Iterator<Platillo> obtenerIterador() {
        IteradorMenuGeneral iterador = new IteradorMenuGeneral(platillos);
        return iterador;
    }

}
