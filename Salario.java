import java.util.Scanner;
public class Salario {
public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el salario bruto mensual: ");
        double salarioBruto = entrada.nextDouble();
        System.out.print("Ingresa el porsentaje de impuestos: ");
        double porcentajeImpuestos = entrada.nextDouble();
        System.out.print("Ingresa las deducciones adicionales: ");
        double deducciones = entrada.nextDouble();
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuesto - deducciones;
        System.out.println("El salario neto es: " + salarioNeto);
}
}
