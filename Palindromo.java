import java.util.Scanner;
public class Palindromo {
    public static boolean
    esPalindromo(String texto) {
        texto = 
        texto.toLowerCase().replace(" ", " ");
        String invertida = new 
        StringBuilder(texto).reverse().toString();
        return texto.equals(invertida);
    }
        public static void main(String[]args) {
            Scanner entrada = new 
            Scanner(System.in);
            System.out.print("Ingresa un apalabra:");
            String palabra = entrada.nextLine();
            if (esPalindromo(palabra)) {
                System.out.println("Es un palindromo");
            } else {
                System.out.println("No es un palindromo");
            }
            entrada.close();
            }
    }
    

