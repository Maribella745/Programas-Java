import java.util.Scanner;
public class ContadorImpares {
    public static void main(String[]args) {
        Scanner entrada = new 
        Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo:");
        int numero = entrada.nextInt();
        int contador = 1;
        if (numero <= 0) {
            System.out.println("Debes ingresar un nuemero positivo.");
        } else {
            System.out.println("Numeros impares del 1 al " + numero + ":");
            do {
                System.out.println(contador);
                 contador += 2;
            } while(contador <= numero);
        }
        entrada.close();
            }
        }


    

    

