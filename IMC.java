import java.util.Scanner;
public class IMC {
    public static void 
    main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);
    }
    }
    

