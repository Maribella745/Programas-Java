import java.util.Scanner;
public class EvaluacionCalificaciones {
    public static void main(String[]args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Ingresa tu calificacion numerica:");
int calificacion = entrada.nextInt();
if (calificacion >= 90 && calificacion <= 100) {
    System.out.println("Tu calificacion es A.");
} else if (calificacion >= 80 && calificacion <= 89) {
   System.out.println("Tu calificacion es B.");
} else if (calificacion >= 70 && calificacion <= 79) { 
    System.out.println("Tu calificacion es C.");
} else if (calificacion >= 60 && calificacion <= 69) {
    System.out.println("Tu calificacion es D.");
} else if (calificacion >= 0 && calificacion <= 60) {
    System.out.println("Tu calificacion es F.");
} else {
    System.out.println("Error: la calificacion debe estar entre 0 y 100");
}

    }
    
}
