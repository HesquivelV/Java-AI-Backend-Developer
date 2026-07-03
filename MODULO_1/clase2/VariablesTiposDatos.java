import java.util.Scanner;
public class VariablesTiposDatos {

    public static void main(String[]args){

    int edad = 44;
    String nombre = "Heriberto";
    double altura = 1.68;
    
    System.out.println("Mi nobre es: " + nombre + ", tengo "+ edad + " anios y mido " + altura + " metros.");

    
    String nombre2;
    int edad2;
    double altura2;

    Scanner ent = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    nombre2 = ent.nextLine();

    System.out.println("Ingrese su edad: ");
    edad2 = ent.nextInt();

    System.out.println("Ingrese su altura: ");
    altura2 = ent.nextDouble();

    System.out.println("Mi nobre es: " + nombre2 + ", tengo "+ edad2 + " anios y mido " + altura2 + " metros.");

    }

}

