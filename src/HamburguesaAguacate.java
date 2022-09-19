
public class HamburguesaAguacate extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaAguacate
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaAguacate() {
        id = 1;
        nombre = "Hamburguesa con aguacate y queso fundido";
        descripcion = "¿Estas buscando una opcion ligera pero sabrosa?\n"
                + "La opcion perfecta son las hamburguesas con aguacate y queso fundido";
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
