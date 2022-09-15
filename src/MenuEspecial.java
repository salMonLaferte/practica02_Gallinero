package src;

import java.util.Hashtable;
import java.util.Iterator;
/**
 * Representa el menu especial con los platillos mas caros e implementa 
 * metodos para modificar e iterar dicho menu.
 */
public class MenuEspecial {

    /**Coleccion con todos los platillos del menu. */
    private Hashtable<Integer, Platillo> platillos;

    /**
     * Genera el menu especial predeterminado que contiene las hamburguesas: Zorsa,
     * Toro y Pescado.
     * @param crearloVacio Si es true, el menu generado estara vacio; si es false el menu generado sera
     * el predeterminado.
     */
    public MenuEspecial(boolean crearloVacio){
        platillos = new Hashtable<Integer, Platillo>();
        if(crearloVacio)
            return;
        HamburguesaZorza hamburguesaZorza = new HamburguesaZorza();
        HamburguesaToro hamburguesaToro = new HamburguesaToro();
        HamburguesaPescado hamburguesaPescado = new HamburguesaPescado();
        platillos.put(hamburguesaZorza.id, hamburguesaZorza);
        platillos.put(hamburguesaToro.id, hamburguesaToro);
        platillos.put(hamburguesaPescado.id, hamburguesaPescado);
    }

    /**
     * Agrega un platillo al menu, siempre y cuando no se encuentre dentro del menu 
     * otro platillo con el mismo id.
     * @param platillo Platillo para agregar.
     */
    public void agregarPlatillo(Platillo platillo){
        platillos.putIfAbsent(platillo.obtenerId(), platillo);
    }

    /**
     * Regresa un iterador sobre los platillos de este menu.
     * @return Un iterador para recorrer los platillos de este menu.
     */
    public Iterator<Platillo> obtenerIterador(){
        return platillos.values().iterator();
    }

}
