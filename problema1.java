/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;
import java.util.Scanner;
/**
 *
 * @author Aarón Marceloi Jaramillo Minchalo
 */
public class problema1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[10];

        // Llenar el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scan.nextInt();
        }

        // Mostrar los valores almacenados
        System.out.println("\nValores almacenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

    }
}
