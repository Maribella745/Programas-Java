import java.util.Scanner;
public class ContarLetras {
 public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingresa una palabra: ");
    String palabra = entrada.next();
    int contador = 0;
     for (char letra : palabra.toCharArray()) {
        if (letra == 'a') {
            contador ++;
        }
    }
    System.out.println("La letra a aparece " + contador + " veces.");
    entrada.close();
 }   
}
