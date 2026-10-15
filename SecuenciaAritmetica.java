import java.util.Scanner;
public class SecuenciaAritmetica {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int primero =
        entrada.nextInt();
        System.out.print("Ingresa la diferencia: ");
        int diferencia = 
        entrada.nextInt();
        System.out.println("Ingresa el numero maximo: ");
        int maximo = entrada.nextInt();
        int numero = primero;
        System.out.println("Secuencia aritmetica:");
        do {
        System.out.println(numero);
        numero += diferencia;
    } while (numero <= maximo);
    entrada.close();
}
}



    
    

