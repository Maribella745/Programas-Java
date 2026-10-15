import java.util.Scanner;
public class MediaPositivos {
    public static void main(String[]args) {
        Scanner entrada = new 
        Scanner(System.in);
        double numero, suma = 0, media;
        int contador = 0;
        System.out.print("Ingresa un numero: ");
        numero = entrada.nextDouble();
        while (numero >= 0) {
            suma = suma + numero;
            contador++;
            System.out.print("Ingresa otro numero: ");
            numero =
            entrada.nextDouble();
        }
        if (contador > 0) {
            media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }
        entrada.close();
        }
    }
    

