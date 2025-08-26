
import java.util.Scanner;

public class LlenarMatrizTeclado{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el numero de filas: ");
    int filas = scanner.nextInt();
    System.out.print("Ingrese el numero de columnas: ");
    int columnas = scanner.nextInt();

    //2
    int[][] matriz = new int[filas][columnas];
    //3
    System.out.println("\n Ingrese los valores para la matriz: ");

    //blucles
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Matriz["+ i + "]["+j+"]: ");
            matriz[i][j] = scanner.nextInt();
            
        }
    }
    //4.
    System.out.println("\n ---Matriz Resultante---");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[i][j]+"\t");
            
        }
        System.out.println();
    }

    scanner.close();
}
}