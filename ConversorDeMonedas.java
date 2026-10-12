import java.util.Scanner;
public class ConversorDeMonedas {
    public static void main(String[]arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad en pesos mexicanos:");
        double pesos = entrada.nextDouble();
        System.out.println("Selecciona la moneda a convertir:");
        System.out.println("1. Dolar estdounidense (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht tailandes (THB)");
        System.out.println("4. Yen japones (JPY)");
        System.out.println("5. Won surcoresno (KRW)");
        System.out.println("6. Dolar autraliano (AUD)");
        System.out.println("7. Sol peruano (PEN)");
        System.out.println("8. Dolar canadiense (CAD)");
        System.out.println("9. Bolivar venezolano (VES)");
        System.out.println("10. Peso argentino (ARS)");
        int opcion = entrada.nextInt();
        double resultado;
        switch (opcion) {
            case 1:
                resultado = pesos / 18.5;
                System.out.println("Resultado en USD: " + resultado);
                break;
                case 2: 
                resultado = pesos / 20.0;
                System.out.println("Resultado en EUR: " + resultado);
                break;
                case 3: 
                resultado = pesos / 0.55;
                System.out.println("Resultado en THB: " + resultado);
                break;
                case 4: 
                resultado = pesos / 0.12;
                System.out.println("Resultado en JPY: " + resultado);
                break;
                case 5: 
                resultado = pesos / 0.013;
                System.out.println("Resultado en KRW: " + resultado);
                break;
                case 6: 
                resultado = pesos / 12.2;
                System.out.println("Resultado en AUD: " + resultado);
                break;
                case 7: 
                resultado = pesos / 5.0;
                System.out.println("Resultado en PEN: " + resultado);
                break;
                case 8: 
                resultado = pesos / 13.5;
                System.out.println("Resultado en CAD: " + resultado);
                break;
                case 9: 
                resultado = pesos / 0.05;
                System.out.println("Resultado en VES: " + resultado);
                break;
                case 10: 
                resultado = pesos / 0.015;
                System.out.println("Resultado en ARS: " + resultado);
                break;
                default:
                    System.out.println("Opcion no valida.");
        
                
        }

    }
    
}
