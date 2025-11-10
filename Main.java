import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = {"Manzana", "Banana", "Naranja", "Mandarina", "Mango", "Pera"};

        System.out.println("Ingrese el término de búsqueda:");
        String busqueda = scanner.nextLine();

        // Implementa la lógica de búsqueda aquí

        scanner.close();
    }
}