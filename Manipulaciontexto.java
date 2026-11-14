import java.util.Scanner;
public class Manipulaciontexto {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String texto = entrada.nextLine();
        texto = texto.toLowerCase();
        int contador = 0;
        String []palabras = texto.split("\\s+");
        for (String palabra : palabras)
        {
            palabra = palabra.replaceAll("[^a-záéíóúüñ]", " ");
           if (palabra.contains("ingenieria") ||
        palabra.contains("ingeniería")) {
            contador++;
        }
        }
        System.out.println("La palabra ingeniería aparece "
            + contador + "veces.");
            entrada.close();
               }
                }
            
               
