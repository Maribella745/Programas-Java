import java.util.ArrayList;
import java.util.Scanner;
public class OrdenamientoBurbuja {
  public static void main(String[]args) {
    Scanner entrada = new 
    Scanner(System.in);
   System.out.println("¿Cuantos números deseas ingresar?");
   int cantidad = entrada.nextInt();
   ArrayList<Integer> numeros = new 
   ArrayList<>();
   // Ingresas los números
   for (int i = 0; i < cantidad; i++) {
    System.out.println("Ingresa el numero " + (i + 1) + ":");
    int numero = entrada.nextInt();
    numeros.add(numero);
   }
   // Ordenamiento burbuja
    for (int i = 0; i < numeros.size() - 1; 
    i++) {
        for (int j = 0; j < numeros.size()
            - 1 -i; j++) {
        if (numeros.get(j) > numeros.get(j + 1)) {
            int temporal = numeros.get(j);
            numeros.set(j,numeros.get(j + 1));
            numeros.set(j + 1, temporal);
        }
    }
}
        // Mostrara los numeros ordenados
            System.out.println("Números ordenados de menor a mayor:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            entrada.close();
        }
            }
    

   

  
