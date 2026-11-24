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
public class problema5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[12];
        int numIngresado;

        // Llenar el arreglo sumando el índice
        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Ingrese un número positivo para la posición " + i + ": ");
                numIngresado = scan.nextInt();

                if (numIngresado <= 0) {
                    System.out.println("Error: El número debe ser positivo.");
                }
            } while (numIngresado <= 0);

            numeros[i] = numIngresado + i;
        }

        // Mostrar todo el arreglo
        System.out.println("\nValores almacenados en el arreglo:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        
    }
}
