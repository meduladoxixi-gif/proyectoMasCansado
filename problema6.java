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
public class problema6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];

        // Llenar la matriz
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scan.nextInt();
            }
        }

        // Imprimir la matriz en formato de tabla
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

       
    }
}
