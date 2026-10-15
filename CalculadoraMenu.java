import java.util.Scanner;
public class CalculadoraMenu {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado; String continuar;
        do {
        System.out.println("\n---CALCULADORA BASICA ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();
            System.out.print("Ingresa el primer numero:");
            num1 =
            entrada.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            num2 =
            entrada.nextDouble();
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    
                        } else {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                            System.out.print("Deseas continuar? (si/no): ");
                            continuar = entrada.next();
                        } while
                        (continuar.equalsIgnoreCase("si"));
                        System.out.println("Calculadora finalizada.");
                        entrada.close();
                    }
                }


                        


            
            

        
        

    
    

