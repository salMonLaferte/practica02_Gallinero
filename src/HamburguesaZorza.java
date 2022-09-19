
public class HamburguesaZorza extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaZorza
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaZorza() {
        id = 9;
        nombre = "Hamburguesa de Zorza";
        descripcion = " La zorza es la carne de lomo adobada como si fuera picadillo, \n"
                + " pero aqui la hemos usado para hacernos unas pedazo de hamburguesas de zorza \n"
                + " que estan para ponerles un piso en La Castellana.";
        precio = 95;
        conQueso = true;
        esVegetariana = false;
    }
    /**
     * Metodo que permite el cambio de como preparar la carne
     * de cada hamburguesa.
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne de lomo esta bien adobada y deliciosa");
    }

}
