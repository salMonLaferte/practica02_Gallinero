
public class HamburguesaVegana extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaVegana
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaVegana() {
        id = 7;
        nombre = "Hamburguesa Vegana de bulgur y espinacas";
        descripcion = " Nuestra hamburguesa vegana que queda realmente jugosa y que,\n"
                + " incluso los no veganos, la disfrutan como si de una carne se tratase. \n";
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
        System.out.println(
                "Wosh wosh no hay carne pero algo tenemos que cocer asi que \n, espinacas bien fritas y deliciosas");
    }

}
