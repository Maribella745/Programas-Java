import java.util.Scanner;
import java.util.Random;
public class AdivinarNumero {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int intento;
        System.out.println("Adivina el numero entre 1 y 100.");
        do {
            System.out.print("Ingresa tu numero: ");
            intento = entrada.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System .out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el numero.");
            }
        } while (intento != numeroSecreto);
        entrada.close();
     }
        
 }
    

