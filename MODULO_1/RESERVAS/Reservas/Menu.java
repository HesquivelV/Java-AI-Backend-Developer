import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        System.out.println("\n=== GESTOR DE RESERVAS (Marta Peluquería) ===");
        System.out.println("1. Agendar una reserva");
        System.out.println("2. Listar todas las reservas del día");
        System.out.println("3. Cancelar una reserva");
        System.out.println("4. Ver el reporte del día");
        System.out.println("5. Salir del programa");
    }

    public static int leerOpcion(Scanner sc) {
        while (true) {
            System.out.print("Elige una opción (1-5): ");
            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                sc.nextLine(); 
                return opcion;
            } else {
                System.out.println("Error: Por favor introduce un número entero válido.");
                sc.nextLine(); 
            }
        }
    }
}