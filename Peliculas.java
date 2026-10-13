import java.util.Scanner;
public class Peliculas {
    public static void main(String[]args) {
Scanner entrada = new 
Scanner(System.in);
String pelicula;
System.out.println("---INFORMACION PELICULAS---");
System.out.print("Escribe el nombre de una pelicula: ");
pelicula = entrada.nextLine();
switch (pelicula.toLowerCase())
{
    case "shrek":
        System.out.println("Pelicula: Shrek");
        System.out.println("Año: 2001");
        System.out.println("Genero: Animacion y comedia");
        System.out.println("Descripcion: Un ogro emprende una aventura para rescatar a una princesa junto con un burro.");
        break;
        case "titanic":
             System.out.println("Pelicula: Titanic");
        System.out.println("Año: 1997");
        System.out.println("Genero: Drama y romance");
        System.out.println("Descripcion: Narra una historia de amor durante el viaje del Tiatanic.");
        break;
        case "coco":
         System.out.println("Peliculas: Coco");
        System.out.println("Año: 2017");
        System.out.println("Genero: Animacion y aventura");
        System.out.println("Descripcion: Miguel descubre el mundo de sus antepasados a travez de la musica.");
        break;
        case "la bella y la bestia":
         System.out.println("Pelicula: La bella y la bestia");
        System.out.println("Año: 1991");
        System.out.println("Genero: Animacion y musica");
        System.out.println("Descripcion: Bella conoce a una bestia que guarda un secreto de magia");
        break;
        case "mulan":
    
        System.out.println("Pelicula: Mulan");
        System.out.println("Año: 1998");
        System.out.println("Genero: Animacion y aventura");
        System.out.println("Descripcion: Una joven ocupa el lugar de su padre para proteger a su familia.");
        break;

        default:
            System.out.println("No tenemos informacion de esa pelicula.");
            break;
}
   entrada.close();
}
    
}
