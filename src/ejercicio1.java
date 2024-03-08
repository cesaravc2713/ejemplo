import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año para saber si es bisiesto o no ");
        int year = scanner.nextInt();


        if (year % 4 == 0) {
            System.out.print("es biciesto");
        } else if (year %100== 0 && year % 400 != 0 ) {
            System.out.print("no es biciesto");
        } else {
            System.out.print("no es biciestoo");
        }




    }
}