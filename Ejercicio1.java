
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pida al usuario que ingrese la cantidad de alumnos (n).
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        // 2. Cree un arreglo unidimensional de tamaño n para almacenar las notas finales.
        int[] notas = new int[n];

        // 3. Use un bucle for para pedir al usuario que ingrese la nota de cada alumno (0 a 100).
        for (int i = 0; i < n; i++) {
            int nota;
            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (0 a 100): ");
                nota = scanner.nextInt();
                if (nota < 0 || nota > 100) {
                    System.out.println("Error: La nota debe estar entre 0 y 100. Intente de nuevo.");
                }
            } while (nota < 0 || nota > 100); // se repite hasta que esté en el rango
            notas[i] = nota;
        }

        // 4. Calcule y muestre el promedio de la clase.
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        double promedio = (double) suma / n;
        System.out.println("\nPromedio de la clase: " + promedio);

        // 5. Cuente y muestre la cantidad de alumnos que aprobaron y reprobaron.
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);

        // 6. Mensaje personalizado según el promedio.
        if (promedio >= 90) {
            System.out.println("¡Excelente clase!");
        } else if (promedio >= 70) {
            System.out.println("Buen rendimiento.");
        } else {
            System.out.println("Necesitamos mejorar.");
        }

        scanner.close();
    }
}
