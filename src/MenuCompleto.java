package src;

import java.util.Iterator;
/**
 * Usada para contener a los distintos menus, implementa metodos para acceder a ellos
 * a traves de iteradores.
 */
public class MenuCompleto {
    private MenuDiario menuDiario;
    private MenuEspecial menuEspecial;
    private MenuGeneral menuGeneral;

    /**
     * Regresa un iterador sobre el menu diario.
     * @return un iterador para recorrer el menu diario.
     */
    public Iterator<Platillo> obtenerMenuDiario(){
        return menuDiario.obtenerIterador();
    }

    /**
     * Regresa un iterador sobre el menu especial.
     * @return un iterador para recorrer el menu especial.
     */
    public Iterator<Platillo> obtenerMenuEspecial(){
        return menuEspecial.obtenerIterador();
    }

    /**
     * Regresa un iterador sobre el menu general.
     * @return un iterador para recorrer el menu general.
     */
    public Iterator<Platillo> obtenerMenuGeneral(){
        return menuGeneral.obtenerIterador();
    }

}
