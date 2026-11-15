import java.util.Scanner;
public class AreaPerimetroCirculo {
 public static double
 calcularArea(double radio) {
    return Math.PI * radio * radio;
 }
 public static double
 calcularPerimetro(double radio) {
    return 2 * Math.PI * radio;
 }
 public static void main(String[]args) {
    Scanner entrada = new 
    Scanner(System.in);
    System.out.print("Ingresa el radio del circulo: ");
    double radio =
    entrada.nextDouble();
    double area = 
    calcularArea(radio);
    double perimetro =
    calcularPerimetro(radio);
    System.out.println("El area del calculo es: " + area);
    System.out.println("El parametro del calculo es: " + perimetro);
    entrada.close();

 }   
}
