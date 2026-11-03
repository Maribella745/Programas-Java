import java.util.Scanner;
public class InvertirElmentos {
public static void main(String[]args) {
Scanner entrada = new 
Scanner(System.in);
int[] numeros = new int[6];
System.out.println("Ingresa 6 numeros enteros:");
for (int i = 0; i < 6; i++) {
    System.out.print("Numero " + (i + 1) + ": ");
    numeros[i] =
    entrada.nextInt();
}
    for (int i = 0; i < 3; i++){
        int auxiliar = numeros[i];
        numeros[i] = numeros[5 - i];
        numeros[5 - i] = auxiliar; }
        System.out.println("Arreglo invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
    }
    entrada.close();
}
    
}
