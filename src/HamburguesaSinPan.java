
public class HamburguesaSinPan extends Hamburguesa {

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

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne esta bien cocida y jugosa");
    }

}
