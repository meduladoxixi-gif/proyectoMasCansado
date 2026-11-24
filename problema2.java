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
public class problema2 {
           public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scan.nextDouble();
            suma += numeros[i];
        }

        promedio = suma / 10;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        scan.close();
    }
}
