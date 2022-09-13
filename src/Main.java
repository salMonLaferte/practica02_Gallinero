package src;

public class Main {
    public static void main(String[] args){
        Platillo platillo = new HamburguesaEspecifica();
        platillo.preparaPlatillo();
        System.out.println(platillo);
    }
    
}
