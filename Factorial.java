import java.util.Scanner;
public class Factorial {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es: " + factorial);
        entrada.close();
        


    }
    
}
