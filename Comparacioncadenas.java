
    import java.util.Scanner;

public class Comparacioncadenas {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa a la primera cadena: ");
        String cadena1 = entrada.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = entrada.nextLine();
        if (cadena1. length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma lingitud.");
        }
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenidode las cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }
        entrada.close();

        }

    }
    


