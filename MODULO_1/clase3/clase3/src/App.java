import java.util.Scanner;

public class App {
    
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Cuantas personas en la mesa?: ");
        int personas = sc.nextInt();
        //sc.nextLine();//luego de un nestInt se necesita limpiar el bufer

        System.out.println("Mesa de " + nombre + ", " + personas + " personas.");

        double subtotal = 12000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica decuento? " + aplicaDescuento);


        int unidades = 5;
        double comoDecimal = unidades;
        System.out.println("IMplicita: " + comoDecimal);

        double precio = 19990.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: "+ precioRecortado);


    }
}


