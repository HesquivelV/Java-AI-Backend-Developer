import java.util.Scanner;

public class Validador {

    public static int leerEntero(Scanner sc, String mensaje){
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                int valor = sc.nextInt();
                sc.nextLine();// siempre va detras de un nectINt
                return valor;
            }else{
                System.out.println("Esto no es un numero entero. INtenta de nuevo.. ");
                sc.nextInt();
            }
        }
    }


    public static double leerDecimal(Scanner sc, String mensaje){
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextDouble()){
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            }else{
                System.out.println("Esto no es un numero valido. vuelve a intentar. ");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }


}
