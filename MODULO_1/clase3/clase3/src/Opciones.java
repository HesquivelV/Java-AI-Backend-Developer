public class Opciones {
 public static void main(String[] args) {
    
    int opcion = 2;

    switch (opcion) {
        case 1:
            System.out.println("Nuevo pedido.");
            break;
        case 2:
            System.out.println("Aplicar descuento.");
            break;

        case 3:
            System.out.println("Cerra caja");
            break;

        default:
            System.out.println("Opcion invalida");
            break;
    }
    /*Nueva version de case mas moderna*/
    /*switch (opcion) {
        case 1 -> System.out.println("Nuevo pedido");
        case 2 -> System.out.println("Aplicar descuento");
        case 3 -> System.out.println("Cerra caja");
        default -> System.out.println("Opcion invalida");

    }*/
 }
}
