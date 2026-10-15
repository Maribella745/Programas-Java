import java.util.Scanner;
public class SecuenciaCuadrados {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo:");
        int numero = entrada.nextInt();
        int contador = 1;
        if (numero <= 0) {
            System.out.println("Debes ingresar un numero positivo.");
        } else {
            System.out.println("Cuadrados del 1 al " + numero + ":");
            do {
                System.out.println(contador + " al cuadrado = " + (contador * contador));
                contador++;
            } while (contador <= numero);
        }
        entrada.close();
            }
        }
    
    

