import java.util.Scanner;
public class VarificarEdad {
    
public static boolean puedeVotar(int edad) {
    return edad >= 18;
}
public static void main(String[]args){
Scanner entrada = new
Scanner(System.in);
System.out.print("Ingrasa tu edad: ");
int edad = entrada.nextInt();
boolean resultado = 
puedeVotar(edad);
if (resultado) {
    System.out.println("La persona puede votar.");
} else {
    System.out.println("La persona no puede votar.");
}
entrada.close();
}
}