
public class HamburguesaAtun extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaAtun
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaAtun() {
        id = 2;
        nombre = "Hamburguesa de Atun y Bacon";
        descripcion = "Las hamburguesas de atun y bacon, son infinitamente mas \n"
                + "recomendables que cualquier nugget o varita de pescado procesada";
        precio = 75;
        conQueso = false;
        esVegetariana = false;
    }
    /**
     * Metodo que permite el cambio de como preparar la carne
     * de cada hamburguesa.
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh el atun frito esta bien cocido");
    }

}
