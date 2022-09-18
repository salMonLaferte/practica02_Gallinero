
public class HamburguesaAtun extends Hamburguesa {

    public HamburguesaAtun() {
        id = 2;
        nombre = "Hamburguesa de Atun y Bacon";
        descripcion = "Las hamburguesas de atun y bacon, son infinitamente mas \n"
                + "recomendables que cualquier nugget o varita de pescado procesada";
        precio = 75;
        conQueso = false;
        esVegetariana = false;
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh el atun frito esta bien cocido");
    }

}
