import java.util.Scanner;
public class VocalesConsonantes {
  public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    char letra = ' ';
    System.out.println("Ingresa una letra o un espacio para terminar:");
    while (true) {
        System.out.print("Letra: ");
        String texto = entrada.nextLine();
        if (texto.equals(" ")) { break;
        }
        if(texto.length() == 1) { 
            letra = 
            Character.toLowerCase(texto.charAt(0));
            if 
            ("aeiou".indexOf(letra) != -1) {
                System.out.println("Es una vocal.");
            } else if 
              (Character.isLetter(letra)) {  
                System.out.println("Es una consonante.");
              } else {
                System.out.println("No es una letra.");
              }
            } else {
                System.out.println("Ingresa solamente una letra.");
            }
            }
              System.out.println("Programa terminado.");
              entrada.close();
            }
            
            }
        
    

  

