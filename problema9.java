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
public class problema9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        int mayor;
        int menor;

        // Llenar la matriz
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scan.nextInt();
            }
        }

        // Inicializar mayor y menor con el primer elemento de la matriz
        mayor = matriz[0][0];
        menor = matriz[0][0];

        // Buscar el mayor y menor valor
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                if (matriz[fila][col] > mayor) {
                    mayor = matriz[fila][col];
                }

                if (matriz[fila][col] < menor) {
                    menor = matriz[fila][col];
                }
            }
        }

        System.out.println("\nMayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);

        scan.close();
    }
}
