package src;

public class HamburguesaToro extends Hamburguesa{

    public HamburguesaToro(){
        id = 6;
        nombre = "Hamburguesa de rabo de Toro";
        descripcion = " El guiso de rabo de toro es uno de los mas espectaculares\n" 
        + " porque la carne queda tierna y melosa, es de esos placeres que se disfrutan \n"
        + " como pocos.";
        precio = 95;
        conQueso = true;
        esVegetariana = false;
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Wosh wosh la carne de rabo de toro esta bien cocida y tierna.");
    }
    
}
