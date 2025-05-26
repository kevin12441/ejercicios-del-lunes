import java.util.Scanner;

public class almacenar2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        // Solicitar 12 números enteros
        System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Calcular y mostrar el promedio
        double promedio = (double) suma / numeros.length;
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}
