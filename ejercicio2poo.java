import java.util.Scanner;

public class ejercicio2poo {
    public class JuegoConNiveles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;

        System.out.println("¡Bienvenido al Juego de Preguntas!");
        System.out.println("Nivel 1 - Cada respuesta correcta vale 10 puntos, incorrecta -5\n");

        // Nivel 1
        puntaje += hacerPregunta(scanner, "¿Capital de Francia?\nA) Madrid\nB) París\nC) Roma", "B", 10, -5);
        puntaje += hacerPregunta(scanner, "¿Resultado de 5 * 3?\nA) 15\nB) 10\nC) 8", "A", 10, -5);
        puntaje += hacerPregunta(scanner, "¿Color del cielo en un día despejado?\nA) Azul\nB) Verde\nC) Rojo", "A", 10, -5);

        System.out.println("\nNivel 2 - Cada respuesta correcta vale 20 puntos, incorrecta -10\n");

        // Nivel 2
        puntaje += hacerPregunta(scanner, "¿Animal que vuela?\nA) Gato\nB) Águila\nC) Perro", "B", 20, -10);
        puntaje += hacerPregunta(scanner, "¿Planeta rojo?\nA) Venus\nB) Marte\nC) Saturno", "B", 20, -10);
        puntaje += hacerPregunta(scanner, "¿Número primo?\nA) 9\nB) 12\nC) 7", "C", 20, -10);
        puntaje += hacerPregunta(scanner, "¿Lenguaje de programación?\nA) Java\nB) Francia\nC) Roma", "A", 20, -10);

        // Resultado final
        System.out.println("\n¡Juego terminado!");
        System.out.println("Puntaje total acumulado: " + puntaje);
    }

    // Método para hacer preguntas
    public static int hacerPregunta(Scanner scanner, String pregunta, String respuestaCorrecta, int puntosCorrecto, int puntosIncorrecto) {
        System.out.println(pregunta);
        System.out.print("Tu respuesta: ");
        String respuesta = scanner.nextLine().trim().toUpperCase();

        if (respuesta.equals(respuestaCorrecta)) {
            System.out.println("¡Correcto! +" + puntosCorrecto + " puntos\n");
            return puntosCorrecto;
        } else {
            System.out.println("Incorrecto. -" + Math.abs(puntosIncorrecto) + " puntos\n");
            return puntosIncorrecto;
        }
    }
}

}
