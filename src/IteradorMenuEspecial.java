    
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Implementa un iterador para iterar sobre una hashtable de platillos.
 */
public class IteradorMenuEspecial implements Iterator<Platillo> {
    /**Coleccion de llaves de la hashtable */
    Set<Integer> llaves;
    /**Iterador sobe las llaves de la hashtable */
    Iterator<Integer> iterator;
    /**Hashtable a iterar */
    Hashtable<Integer,Platillo> tabla;

    /**
     * Crea un iterador para iterar sobre la hashtable
     * @param tabla Hashtable a iterar
     */
    public IteradorMenuEspecial(Hashtable<Integer,Platillo> tabla){
        llaves = tabla.keySet();
        iterator = llaves.iterator();
        this.tabla = tabla;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Platillo next() {
        return tabla.get(iterator.next());
    }
}

