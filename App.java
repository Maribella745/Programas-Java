import java.util.Scanner;
public class App {
    public static void 
    main(String[]args) {
        Scanner entrada = new 
        Scanner(System.in);
        System.out.print("Largo: ");
        double largo =
        entrada.nextDouble();
        System.out.print("Ancho: ");
        double ancho = 
        entrada.nextDouble();
        double area = largo * ancho;
        System.out.println("El area es:"
            + area);
    }
}