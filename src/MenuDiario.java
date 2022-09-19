
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Representa el menu diario a gusto del gerente, e implementa metodos para
 * modificar e iterar dicho menu.
 */
public class MenuDiario {

    /** Coleccion con todos los platillos del menu. */
    private ArrayList<Platillo> platillos;

    /**
     * Genera un menu diario vacio, o bien uno predeterminado con las hamburguesas:
     * aguacate, espinaca
     * y sin pan.
     * @param crearloVacio Si es true, el menu generado estara vacio; si es false el
     *                     menu generado sera
     *                     el predeterminado.
     */
    public MenuDiario(boolean crearloVacio) {
        platillos = new ArrayList<Platillo>();
        if (crearloVacio)
            return;
        HamburguesaAguacate hamburguesaAguacate = new HamburguesaAguacate();
        HamburguesaEspinaca hamburguesaEspinaca = new HamburguesaEspinaca();
        HamburguesaSinPan hamburguesaSinPan = new HamburguesaSinPan();
        platillos.add(hamburguesaAguacate);
        platillos.add(hamburguesaEspinaca);
        platillos.add(hamburguesaSinPan);
    }

    /**
     * Agrega un platillo al menu, siempre y cuando no se encuentre dentro del menu
     * otro platillo con el mismo id.
     * @param platillo Platillo para agregar.
     */
    public void agregarPlatillo(Platillo platillo) {
        for (Platillo p : platillos) {
            if (p.obtenerId() == platillo.obtenerId())
                return;
        }
        platillos.add(platillo);
    }

    /**
     * Regresa un iterador sobre los platillos de este menu.
     * @return Un iterador para recorrer los platillos de este menu.
     */
    public Iterator<Platillo> obtenerIterador() {
        return platillos.iterator();
    }
}
