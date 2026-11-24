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
public class problema8 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        // Llenar la matriz
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scan.nextInt();
            }
        }

        // Mostrar los elementos y calcular la suma de la diagonal principal
        System.out.print("\nElementos de la diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);

       
    }
}