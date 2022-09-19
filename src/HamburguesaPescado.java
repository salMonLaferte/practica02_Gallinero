
public class HamburguesaPescado extends Hamburguesa {
    /**
     * Metodo constructor de la clase HamburguesaPescado
     * (proporciona la descripcion especifica de está hamburguesa).
     */
    public HamburguesaPescado() {
        id = 4;
        nombre = "Hamburguesa de Pescado estilo Tailandes";
        descripcion = " ¿Quieres dejar al personal con la boca abierta preparando\n"
                + " unas hamburguesas originales? Pues tu opcion perfecta es esta, con su \n"
                + "exquisito sabor tailandes.";
        precio = 95;
        conQueso = false;
        esVegetariana = false;
    }
    /**
     * Metodo que permite el cambio de como preparar la carne
     * de cada hamburguesa.
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne esta bien cocida y jugosa(estilo tailandes).");
    }

}
