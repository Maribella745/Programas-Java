import java.util.Scanner;
public class SumaElementos {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        System.out.println("Ingresa 5 numeros enteros:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Numero" + (i + 1) + ": ");
            numeros[i] =
            entrada.nextInt();
            suma = suma + numeros[i];
        }
        System.out.println("La suma total de los elementos es: " + suma);
        entrada.close();

    }
    
}
