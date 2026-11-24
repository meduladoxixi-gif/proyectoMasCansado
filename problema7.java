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
public class problema7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;

        // Llenar la matriz y sumar sus elementos
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scan.nextInt();
                sumaTotal += matriz[fila][col];
            }
        }

        System.out.println("\nSuma total de todos los elementos: " + sumaTotal);

        scan.close();
    }
}
