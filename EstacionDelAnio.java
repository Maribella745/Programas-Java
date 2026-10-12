import java.util.Scanner;
public class EstacionDelAnio {
 public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa un numero del mes del 1 al 12:");
    int mes = entrada.nextInt();
    switch (mes) {
        case 12:
            case 1:
            case 2:
             System.out.println("Estacion: invierno");
             break;
             case 3:
                case 4:
                    case 5:
                        System.out.println("Estacion: Primavera");
             break;
             case 6:
                case 7:
                    case 8:
                        System.out.println("Estacion: vaerano");
             break;
             case 9:
                case 10:
                    case 11:
                        System.out.println("Estacion: Otoño");
             break;
             default:
                System.out.println("Numero de mes no valido.");
    }
 }   
}
