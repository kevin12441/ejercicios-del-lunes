import java.util.Scanner;
// Ejercicio 6: Ingresar nombres de artículos en una matriz y mostrarla con las filas invertidas
public class ejercicio6 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        // Ingresar los nombres de los artículos
        System.out.println("Ingrese los nombres de 9 artículos:");

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Artículo [" + fila + "][" + col + "]: ");
                articulos[fila][col] = scanner.nextLine();
            }
        }

        // Mostrar la matriz con el orden de las filas invertido
        System.out.println("\nMatriz con filas invertidas:");

        for (int fila = 2; fila >= 0; fila--) {
            for (int col = 0; col < 3; col++) {
                System.out.print(articulos[fila][col] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}