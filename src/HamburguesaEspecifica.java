package src;

public class HamburguesaEspecifica extends Hamburguesa {

    public HamburguesaEspecifica(){
        id = 1;
        nombre = "Mi hamburguesa chida";
        descripcion = "Una hamburguesa muy chida chida";
        precio = 20;
        conQueso = true;
        esVegetariana = false;
    }

    @Override
    public void prepararCarne() {
        System.out.println("Wosh wosh se preparo la carne jaja saludos");
    }

}
