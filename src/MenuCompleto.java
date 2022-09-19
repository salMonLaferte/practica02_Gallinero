
import java.util.Iterator;

/**
 * Usada para contener a los distintos menus, implementa metodos para acceder a
 * ellos a traves de iteradores.
 */
public class MenuCompleto {
    private MenuDiario menuDiario;
    private MenuEspecial menuEspecial;
    private MenuGeneral menuGeneral;

    /**
     * Crea un menu completo con los submenus diario y especial predeterminados, o
     * con dichos menus vacios, segun se especifique.
     * @param crearloVacio Si es true los submenus diario y especial estaran vacios
     *                     para agregar
     *                     platillos despues, si es false se crearan los submenus
     *                     predeterminados.
     */
    public MenuCompleto(boolean crearloVacio) {
        menuDiario = new MenuDiario(crearloVacio);
        menuEspecial = new MenuEspecial(crearloVacio);
        menuGeneral = new MenuGeneral();
    }

    /**
     * Regresa un iterador sobre el menu diario.
     * @return un iterador para recorrer el menu diario.
     */
    public Iterator<Platillo> obtenerIteradorMenuDiario() {
        return menuDiario.obtenerIterador();
    }

    /**
     * Regresa un iterador sobre el menu especial.
     * @return un iterador para recorrer el menu especial.
     */
    public Iterator<Platillo> obtenerMenuEspecial() {
        return menuEspecial.obtenerIterador();
    }

    /**
     * Regresa un iterador sobre el menu general.
     * @return un iterador para recorrer el menu general.
     */
    public Iterator<Platillo> obtenerIteradorMenuGeneral() {
        return menuGeneral.obtenerIterador();
    }

}
