/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;
import java.util.Scanner;
/**
 *
 * @author Aaron Marcelo Jaramillo Minchalo
 */
public class problema10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        int numIngresado;

        // Llenar la matriz aplicando la fórmula
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                numIngresado = scan.nextInt();

                matriz[fila][col] = numIngresado + (fila * col);
            }
        }

        // Imprimir la matriz resultante
        System.out.println("\nMatriz resultante:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

     
    }
}
