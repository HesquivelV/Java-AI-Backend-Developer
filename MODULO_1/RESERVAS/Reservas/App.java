import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int opcion = 0;


        while (opcion != 5) { 
            Menu.mostrarMenu();
            opcion = Menu.leerOpcion(sc); 

            switch (opcion) { 
                case 1:
                    Operaciones.agendar(sc); 
                    break;
                case 2:
                    Operaciones.listar(); 
                    break;
                case 3:
                    Operaciones.cancelar(sc); 
                    break;
                case 4:
                    Operaciones.reporte(); 
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación de forma ordenada... ¡Que tenga un excelente día, Doña Marta!"); 
                    break;
                default:
                    System.out.println("Opción no válida. Por favor elija un número entre 1 y 5.");
            }
        }

        sc.close(); 
    }
}