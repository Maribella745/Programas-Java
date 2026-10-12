import java.util.Scanner;
public class CalificacionesFinales {
public static void main(String[]args) {
    
Scanner entrada = new Scanner(System.in);
System.out.println("Ingresa la calificacion de parciales:");
double parciales = entrada.nextDouble();
System.out.println("Ingresa la calificacion del proyecto:");
double proyecto = entrada.nextDouble();
System.out.println("Ingresa la calificacion del examen final:");
double examen = entrada.nextDouble();
if (parciales >= 0 && parciales <= 100 &&
    proyecto >= 0 && proyecto <= 100 &&
    examen >= 0 && examen <= 100) {

double calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examen * 0.30);
System.out.println("La califiaccion final es: " + calificacionFinal);
} else {
    System.out.println("Error: las calificaciones deben estar entre 0 y 100.");
}
}
}