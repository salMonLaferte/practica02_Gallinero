
public class HamburguesaSinPan extends Hamburguesa {
     /**
     * Metodo constructor de la clase HamburguesaSinPan
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaSinPan() {
        id = 5;
        nombre = "Hamburguesa de dieta sin Pan";
        descripcion = "¿Quien ha dicho que las hamburguesas son bombas de calorias,\n" +
                "+colesterol y trigliceridos? Unas hamburguesas de carne con poca grasa,\n" +
                "queso fresco y sin pan";
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
        System.out.println("Wosh wosh la carne esta bien cocida y jugosa");
    }

}
