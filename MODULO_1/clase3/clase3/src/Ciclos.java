import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
/*         
        for (int i = 1; i <= 5; i++){
            System.out.println("Plato numero#: "+ i +" Impreso en el recibo");
        }
    }
*/
//Ciclo while 
/*
int mesas = 3;
while (mesas > 0){
    System.out.println("Faltan "+ mesas + " mesas");
    mesas --;
}
System.out.println("Limpiar");
    }*/
// do while hace y lueg evalua

Scanner sc = new Scanner(System.in);
int opcion;

do {
    System.out.println("1. Continuar 2. Salir");
    System.out.print("Elige: ");
    opcion = sc.nextInt();

}while (opcion != 2);
System.out.println("Saliste del menu.");

    }

}

