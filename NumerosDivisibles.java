
public class NumerosDivisibles {
 public static void main(String[]args){
    System.out.println("Numeros divisibles ente 3 y 5 del 1 al 100:");
    for (int numero = 1; numero <=100; numero++) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero);
        }
    }
 }   
}
