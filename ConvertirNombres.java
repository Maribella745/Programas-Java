import java.util.Scanner;
public class ConvertirNombres {
   public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    while (true) {
        System.out.println("Ingresa el nombre completo (o escribesalir):");
        nombre = entrada.nextLine();
        if(nombre.equalsIgnoreCase("salir")) {
            break;
        }
        System.out.println("Nombre en mayúsculas: " +
            nombre.toUpperCase());
    }
    System.out.println("Programa terminado.");
    entrada.close();
        
        }
    }
   


