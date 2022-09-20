


import java.util.Scanner;
/**
 * Implementa un menú para darle acciones al robot.
 */
public class Main {
    /**
     * Metodo que ejecuta toda la practica.
     * @param args Array de argumentos.
     */
    public static void main(String[] args){
        int accion = 0;//identificador de la accion ingresada por el usuario.
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        MenuCompleto menu = new MenuCompleto(false);//menu completo predeterminado con sus 9 platillos.
        int id = -1;//identificador del platillo seleccionado por el usuario para su orden.
        while(accion != 8){
            //Imprime el estado actual del robot y las acciones disponibles.
            Estado actual = robot.getEstado();
            System.out.println("Estado del robot: " + actual.obtenerNombreDelEstado());
            System.out.println("Introduzca una accion para el robot\n");
            System.out.println("1.Suspender\n2.Activar\n3.Leer menu\n4.Cocinar\n5.EntregarComida\n6.Decirle que te atienda\n7.Tomar tu orden\n8.Finalizar el programa");
            //Lee la accion que el usuario seleccionó.
            try {
                accion = scanner.nextInt();
            } catch (Exception e) {
                accion = -1;//establecemos una accion no valida 
                scanner.next();
            }
            //Si la acción es tomar una orden y el robot se encuentra haciendo eso entonces pide el identificador del platillo.
            if(accion == 7 && actual.obtenerNombreDelEstado().equals(robot.getAtendiendo().obtenerNombreDelEstado())){
                System.out.println("Dime el ID de tu platillo");
                try {
                    id = scanner.nextInt(); 
                } catch (Exception e) {
                    id = -1;//establecemos un id no válido
                    scanner.next();
                }
            }
            //Hacer que el robot realice la opcion seleccionada o decirle al usuario que introduzca un numero adecuado.
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
                    robot.tomarOrden(menu, id);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Por favor introduce un numero del 1 al 8.");
                    break;
            }
        }
        scanner.close();
    }
    
}
