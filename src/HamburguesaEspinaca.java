
public class HamburguesaEspinaca extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaEspinaca
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaEspinaca() {
        id = 8;
        nombre = "Hamburguesas ligeras de pollo y espinacas";
        descripcion = " Si estas a dieta y definitivamente, pasas de comerte hamburguesas \n"
                + " con todos sus acompañamientos, tambien tenemos hamburguesa para ti, pues estas \n"
                + " de pollo y espinacas son geniales. ";
        precio = 65;
        conQueso = true;
        esVegetariana = false;
    }
    /**
     * Metodo que permite el cambio de como preparar la carne
     * de cada hamburguesa.
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh el pollo esta bien cocido y muy delicioso.");
    }

}
