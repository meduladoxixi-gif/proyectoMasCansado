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
public class problema4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                cantPares++;
                sumaPares += numero;
            } else {
                cantImpares++;
                sumaImpares += numero;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números pares: " + cantPares);
        System.out.println("Cantidad de números impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);

       
    }
}
