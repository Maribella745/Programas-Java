import java.util.Scanner;
public class ContarParesImpares {
    public static void main(String[]args) {
        Scanner entrada = new 
        Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        System.out.println("Ingresa 10 nuemros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero" +(i + 1) + ": ");
            numeros[i] = 
            entrada.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;


            }
        }
        System.out.println("\nCantidad de numeros pares: " + pares);
         System.out.println("Cantidad de numeros impares: " + impares);
         entrada.close();
    }
}

        


    
    

