import java.util.Scanner;
public class ejercicio7 {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        // Ingreso de los 12 valores
        System.out.println("Ingrese 12 valores numéricos para la matriz 3x4:");

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        boolean existePuntoDeSilla = false;

        // Mostrar la matriz original
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        // Buscar puntos de silla
        for (int i = 0; i < 3; i++) {
            // Buscar el menor valor en la fila i y su columna
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }

            // Verificar si es el mayor en su columna
            boolean esMayorEnColumna = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][colMin] > minFila) {
                    esMayorEnColumna = false;
                    break;
                }
            }

            if (esMayorEnColumna) {
                System.out.println("\nPunto de silla encontrado:");
                System.out.println("Valor: " + minFila + " en posición [" + i + "][" + colMin + "]");
                existePuntoDeSilla = true;
            }
        }

        if (!existePuntoDeSilla) {
            System.out.println("\nNo se encontró ningún punto de silla.");
        }
        scanner.close();
    }
}
