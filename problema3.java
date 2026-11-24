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
public class problema3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[15];
        int mayor;
        int menor;
        int posMayor = 0;
        int posMenor = 0;

        // Llenar el arreglo
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scan.nextInt();
        }

        // Inicializar mayor y menor con el primer elemento
        mayor = numeros[0];
        menor = numeros[0];

        // Buscar mayor, menor y sus posiciones
        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nNúmero mayor: " + mayor + " (Posición: " + posMayor + ")");
        System.out.println("Número menor: " + menor + " (Posición: " + posMenor + ")");

    }
}
