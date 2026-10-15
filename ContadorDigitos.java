import java.util.Scanner;
public class ContadorDigitos {
   public static void main(String[]args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Ingresa un numero entero: ");
int numero = entrada.nextInt();
numero = Math.abs(numero);
int contador = 0;
if (numero == 0) {
    contador = 1;
} else {
while (numero > 0) {
    numero = numero / 10; contador++;
}
}
System.out.println("El numero tiene " + contador + "digitos.");
entrada.close();
   }
}
