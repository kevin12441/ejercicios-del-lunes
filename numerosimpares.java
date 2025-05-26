import java.util.Scanner;

public class numerosimpares {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        // Solicitar 12 números enteros
        System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificar si es par o impar
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }
}


