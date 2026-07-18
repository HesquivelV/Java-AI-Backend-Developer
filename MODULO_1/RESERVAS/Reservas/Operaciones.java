import java.util.Scanner;

public class Operaciones {


    private static final int MAX_RESERVAS = 10; 
    private static String[] clientes = new String[MAX_RESERVAS]; 
    private static int[] horas = new int[MAX_RESERVAS]; 
    private static int[] servicios = new int[MAX_RESERVAS]; 
    private static int contador = 0; 

    
    private static boolean horaYaOcupada(int horaBuscada) {
        for (int i = 0; i < contador; i++) {
            if (horas[i] == horaBuscada) {
                return true; 
            }
        }
        return false;
    }

    
    private static String obtenerNombreServicio(int codigo) {
        switch (codigo) {
            case 1: return "CORTE PELO"; 
            case 2: return "TINTE"; 
            case 3: return "MANNICURE"; 
            default: return "DESCONOCIDO";
        }
    }

   
    private static double obtenerPrecioServicio(int codigo) {
        switch (codigo) {
            case 1: return 25000; 
            case 2: return 60000; 
            case 3: return 30000; 
            default: return 0;
        }
    }

    
    public static void agendar(Scanner sc) {
        if (contador >= MAX_RESERVAS) {
            System.out.println("Lo sentimos, la agenda del día está llena (Máx 10 citas)."); 
            return;
        }

       
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        if (!Validador.nombreValido(nombre)) { 
            System.out.println("Error: El nombre del cliente no puede estar vacío."); 
            return;
        }

       
        System.out.print("Ingrese la hora de la cita (8 a 17): ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Debe ingresar una hora válida (número entero).");
            sc.nextLine();
            return;
        }
        int hora = sc.nextInt();
        sc.nextLine();

        if (!Validador.horaValida(hora)) { 
            System.out.println("Error: El horario de atención permitido es de 8:00 a 18:00 (Citas de 8 a 17)."); //[cite: 5]
            return;
        }

        if (horaYaOcupada(hora)) { 
            System.out.println("Error: La hora " + hora + ":00 ya se encuentra reservada por otro cliente."); //[cite: 5]
            return;
        }

       
        System.out.println("Servicios disponibles:");
        System.out.println("1. CORTE PELO ($25.000)");
        System.out.println("2. TINTE ($60.000)");
        System.out.println("3. MANICURE ($30.000)"); 
        System.out.print("DIGITE EL CODIGO DEL SERVICIO: ");
        if (!sc.hasNextInt()) {
            System.out.println("CODIGO INVALIDO.");
            sc.nextLine();
            return;
        }
        int servicio = sc.nextInt();
        sc.nextLine();

        if (!Validador.servicioValido(servicio)) { 
            System.out.println("Error: El servicio seleccionado debe ser 1, 2 o 3."); 
            return;
        }

      
        clientes[contador] = nombre; 
        horas[contador] = hora; 
        servicios[contador] = servicio; 
        contador++; 

        System.out.println("¡Reserva agendada con éxito para las " + hora + ":00!");
    }

    
    public static void listar() {
        if (contador == 0) {
            System.out.println("Aún no hay reservas registradas para el día de hoy."); 
            return;
        }

        System.out.println("\n--- LISTADO DE RESERVAS DEL DÍA ---");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". Cliente: " + clientes[i] + 
                            " | Hora: " + horas[i] + ":00" + 
                             " | Servicio: " + obtenerNombreServicio(servicios[i])); 
        }
    }

   
    public static void cancelar(Scanner sc) {
        if (contador == 0) {
            System.out.println("No hay ninguna reserva registrada para poder cancelar.");
            return;
        }

        listar(); 
        System.out.print("Ingrese el número de la reserva que desea cancelar: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Entrada no válida.");
            sc.nextLine();
            return;
        }
        int numeroReserva = sc.nextInt();
        sc.nextLine();

        
        if (numeroReserva < 1 || numeroReserva > contador) { 
            System.out.println("Error: Ese número de reserva no existe en el registro."); 
            return;
        }


        int indiceBorrar = numeroReserva - 1;

        for (int i = indiceBorrar; i < contador - 1; i++) {
            clientes[i] = clientes[i + 1]; 
            horas[i] = horas[i + 1]; 
            servicios[i] = servicios[i + 1]; 
        }

        clientes[contador - 1] = null;
        horas[contador - 1] = 0;
        servicios[contador - 1] = 0;

        contador--; 
        System.out.println("La reserva número " + numeroReserva + " ha sido cancelada correctamente.");
    }

    public static void reporte() {
        System.out.println("\n--- REPORTE CONTABLE DIARIO ---");
        System.out.println("Total de citas agendadas: " + contador); 

        double dineroFacturado = 0; 
        for (int i = 0; i < contador; i++) {
            dineroFacturado += obtenerPrecioServicio(servicios[i]); 
        }

        System.out.println("Dinero total facturado: $" + dineroFacturado);
    }
}