import java.util.Scanner;
import java.util.Random;
public class ejercicio2 {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("piedra, papel o tijera");
        System.out.println("Ingresa tu elección (1 para Piedra, 2 para Papel, 3 para Tijera");

        int opcion = scanner.nextInt();
        int numeroAleatorio = random.nextInt(3)+1;
        do {
            if (opcion == numeroAleatorio) {
                System.out.println("¡Es un empate!");
            } else
                switch(opcion){
                    case 1:
                        if(numeroAleatorio==2){
                            System.out.println("Perdiste, la maquina elegio papel y tu elegiste piedra");
                        } else {
                            System.out.println("Ganaste");
                        }
                        break;
                    case 2:
                        if(numeroAleatorio==3){
                            System.out.println("Perdiste, la maquina elegio tijera y tu elegiste papel");
                        } else {
                            System.out.println("Ganaste");
                        }break;
                    case 3:
                        if(numeroAleatorio==1){
                            System.out.println("Perdiste, la maquina elegio piedra y tu elegiste tijera");
                        } else {
                            System.out.println("Ganaste");
                        }break;
                    default:
                        System.out.println("Entrada no válida. Por favor, elige 1, 2 o 3.");
                        break;





                }


        } while (scanner.nextInt() == 1);
        System.out.println("Gracias por jugar. ¡Hasta luego!");







    }
}