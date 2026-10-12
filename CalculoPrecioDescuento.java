import java.util.Scanner;
public class CalculoPrecioDescuento {
    public static void main(String[]args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Ingresa el precio original del producto:");
double precio = entrada.nextDouble();
double descuento;
if (precio <= 100) {descuento = 0;
} else if (precio <= 200) {descuento = 0.10;
 } else if (precio <= 500) {descuento = 0.20;
    } else { descuento = 0.25;
    }
if (precio >= 0) { double precioFinal = precio - (precio * descuento);
    System.out.println("Precio original: $" + precio);
    System.out.println("Descuento aplicado:" +(descuento * 100) + "%");
    System.out.println("Precio final: $" + precioFinal);
} else {
    System.out.println("Error: el preciono puede ser negativo.");
}
 }
    }



    

