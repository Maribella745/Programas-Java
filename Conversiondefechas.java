import java.time.LocalDate; 
import java.util.Scanner;
public class Conversiondefechas {
   public static void main(String[]args) {
    Scanner entrada = new 
    Scanner(System.in);
    System.out.print("Ingresa una fecha (YYYY-MM-DD): ");
    String fechaTexto = 
    entrada.nextLine();
    LocalDate fecha = 
    LocalDate.parse(fechaTexto);
    LocalDate semanaDespues = 
    fecha.plusWeeks(1);
    LocalDate mesAntes = 
    fecha.minusMonths(1);
    System.out.println("Fecha original: " + fecha);
    System.out.println("Una semanadespues: " + semanaDespues);
    System.out.println("Un mes antes: " + mesAntes);
    entrada.close();


   } 
}
