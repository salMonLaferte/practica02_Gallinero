
public class HamburguesaPavo extends Hamburguesa {

    public HamburguesaPavo() {
        id = 3;
        nombre = "Hamburguesa de Pavo";
        descripcion = " La carne de pavo es fenomenal para preparar hamburguesas\n"
                + " bajas en grasas, eso si luego ya tu eliges con que acompañarla y, en \n"
                + " funcion de eso sera mas o menos sanota.";
        precio = 75;
        conQueso = true;
        esVegetariana = false;
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne de pavo esta bien cocida y jugosa.");
    }

}