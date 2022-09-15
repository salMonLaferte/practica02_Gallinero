package src;

public class HamburguesaVegana extends Hamburguesa{

    public HamburguesaVegana(){
        id = 7;
        nombre = "Hamburguesa Vegana de bulgur y espinacas";
        descripcion = " Nuestra hamburguesa vegana que queda realmente jugosa y que,\n" 
        +" incluso los no veganos, la disfrutan como si de una carne se tratase. \n";
        precio =75;
        conQueso = false;
        esVegetariana = false;
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh no hay carne pero algo tenemos que cocer asi que \n, espinacas bien fritas y deliciosas");
    }
    
}
