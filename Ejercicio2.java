
import java.util.Scanner;

public class Ejercicio2 {
     public static void main(String[] args) {
        // Inicialización de la matriz de 3x3 con valores predefinidos
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número para buscar en la matriz
        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        // Bandera para indicar si el número fue encontrado
        boolean encontrado = false;

        // Recorrer la matriz usando dos bucles for anidados
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                // Comparar cada elemento de la matriz con el número buscado
                if (matriz[fila][columna] == numeroBuscado) {
                    // Si encuentra el número, imprimir la posición
                    System.out.println("Número encontrado en [" + fila + "][" + columna + "]");
                    encontrado = true;
                    break; // Salir del bucle interno si se encuentra el número
                }
            }
            if (encontrado) {
                break; // Salir del bucle externo si se encuentra el número
            }
        }

        // Si el número no fue encontrado, mostrar un mensaje
        if (!encontrado) {
            System.out.println("Número no encontrado");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
