

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear una matriz cuadrada de 3x3 llena de ceros
        int[][] matriz = new int[3][3];

        // Asignar manualmente valores distintos de cero en posiciones aleatorias
        matriz[0][1] = 0;
        matriz[1][2] = 9;
        matriz[2][0] = 2;

        // Recorrer la matriz para identificar los elementos que no son cero
        System.out.println("Elementos distintos de cero en la matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] != 0) {
                    // Imprimir la posición y el valor del elemento distinto de cero
                    System.out.println("[" + fila + ", " + columna + "] = " + matriz[fila][columna]);
                }
            }
        }
    }
}
