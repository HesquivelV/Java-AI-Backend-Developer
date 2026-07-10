import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion !=5) {
            Menu.mostrar();
            opcion =Menu.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    Operaciones.registrar(sc);
                    break;
                case 2:
                    Operaciones.listar();
                    break;
                case 3:
                    Operaciones.actualizarCantidad(sc);
                    break;
                case 4:
                    Operaciones.verValorTotal();
                    break;
                case 5:
                    System.out.println("Muchas gracias por utilizar el gestor. Hasta pronto. ");
                    break;
                default:
                    System.out.println("Opcion invalida. Elije entre 1 - 5");
                    
            }
            
        }
    }
}