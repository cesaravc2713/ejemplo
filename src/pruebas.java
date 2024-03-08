import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ponga un numero para saber si es menor " +
                "o mayor a tres");

        int numero = scanner.nextInt();

        if (numero >= 3) {
            System.out.println("su numero es mayor o igual a 3");
        }
        else {
            System.out.println("su numero es menor a 3");
        }



    }
}
