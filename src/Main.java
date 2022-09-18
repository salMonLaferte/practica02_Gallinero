


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int accion = 0;
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        MenuCompleto menu = new MenuCompleto(false);
        int id = -1;
        while(accion != 8){
            Estado actual = robot.getEstado();
            System.out.println("Estado del robot: " + actual.obtenerNombreDelEstado());
            System.out.println("Introduzca una accion para el robot\n");
            System.out.println("1.Suspender\n2.Activar\n3.Leer menu\n4.Cocinar\n5.EntregarComida\n6.Decirle que te atienda\n7.Tomar tu orden");
            accion = scanner.nextInt();
            

            switch(accion){
                case 1:
                    robot.suspender();
                    break;
                case 2:
                    robot.activar();
                    break;
                case 3:
                    robot.leerMenu(menu);
                    break;
                case 4:
                    robot.cocinar(menu,id);
                    break;
                case 5:
                    robot.entregarComida();
                    break;
                case 6:
                    robot.caminar();
                    break;
                case 7:
                    if(actual==robot.getAtendiendo()){
                        System.out.println("Dime el ID de tu platillo");
                        id = scanner.nextInt();
                        robot.tomarOrden(menu, id);  
                    }
                    robot.tomarOrden(menu, id);
                    break;
            }
        }
        scanner.close();
    }
    
}
