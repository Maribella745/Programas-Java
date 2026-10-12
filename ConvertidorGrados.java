import java.util.Scanner;
public class ConvertidorGrados {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados Celsius:");
        double celsius = entrada.nextDouble();
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperatura en Fahrenheit" + fahrenheit);
            break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.println("Temperatura en kelvin:" + kelvin);
                break;
                default:
                    System.out.println("Opcion no valida.");

        }
        
    }
    
}
