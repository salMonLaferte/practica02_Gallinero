package src;

public class HamburguesaZorza extends Hamburguesa{

    public HamburguesaZorza(){
        id = 9;
        nombre = "Hamburguesa de Zorza";
        descripcion = " La zorza es la carne de lomo adobada como si fuera picadillo, \n" 
        + " pero aqui la hemos usado para hacernos unas pedazo de hamburguesas de zorza \n"
        + " que estan para ponerles un piso en La Castellana.";
        precio = 95;
        conQueso = true;
        esVegetariana = false;
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne de lomo esta bien adobada y deliciosa");
    }
    
}

