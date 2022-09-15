package src;

public class Main {
    public static void main(String[] args){
        Platillo platillo = new HamburguesaSinPan();
        platillo.preparaPlatillo();
        System.out.println(platillo);
    }
    
}
