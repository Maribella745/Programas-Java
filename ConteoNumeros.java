import java.util.Scanner;
public class ConteoNumeros {
    public static void main(String[]args) {
        Scanner entrada = new  Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        System.out.print("Cuantos numeros vas a ingresar? ");
        int cantidad = entrada.nextInt();
        for ( int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el numero " + i + ":");
            int numero = entrada.nextInt();
            if (numero > 0) {positivos++;
            } else if (numero < 0) {negativos++;
            } else {
                ceros++;
    
            }
        }
    System.out.println("Numeros mayores que cero; " + positivos);
    System.out.println("Numeros menores que cero; " + negativos);
    System.out.println("Numeros iguales a cero; " + ceros);
    entrada.close();


    }
    
}
