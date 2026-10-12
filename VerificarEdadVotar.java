import java.util.Scanner;
public class VerificarEdadVotar {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = entrada.nextInt();
        if (edad >=18) {System.out.println("Puedes votar.");
        } else {
    System.out.println("No tienes edad suficiente para votar.");
        }

    }
    
}
