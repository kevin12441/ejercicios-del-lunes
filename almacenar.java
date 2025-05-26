import java.util.Scanner;

public class almacenar {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];

        // Solicitar al usuario que ingrese 10 frutas
        System.out.println("Ingrese 10 nombres de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta #" + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostrar las frutas en orden inverso
        System.out.println("\nFrutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}

