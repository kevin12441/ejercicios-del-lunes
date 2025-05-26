import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ingreso de los 10 números
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar el mayor y menor con el primer elemento
        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscar el mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}