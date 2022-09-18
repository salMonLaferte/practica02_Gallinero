
public class HamburguesaEspinaca extends Hamburguesa {

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

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh el pollo esta bien cocido y muy delicioso.");
    }

}
