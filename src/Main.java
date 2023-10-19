import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura los datos de dos perros desde la consola
        System.out.println("Ingrese los datos del primer perro:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        System.out.print("Peso: ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el búfer de entrada

        System.out.println("Ingrese los datos del segundo perro:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        System.out.print("Peso: ");
        double peso2 = scanner.nextDouble();

        // Crear dos objetos de la clase Perro
        Perro perro1 = new Perro(nombre1);
        Perro perro2 = new Perro(nombre2);

        // Invocar los métodos de los perros
        perro1.comer("croquetas", 200);
        System.out.println(perro1.nombre() + " dice: " + perro1.ladrar());

        perro2.comer("huesos", 300);
        System.out.println(perro2.nombre() + " dice: " + perro2.ladrar());
    }
}
