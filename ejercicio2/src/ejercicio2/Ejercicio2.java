/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;


 
public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a, b,c;
         
        System.out.print("Ingrese un numero entero: ");
        a = entrada.nextInt();
        System.out.print("Ingrese un numero entero: ");
        b = entrada.nextInt();
        
        c = a + b;
        System.out.println("la suma es: "+c);
        c = a * b;
        System.out.println("El producto es: "+c);
        c = a - b;
        System.out.println("la diferencia es: "+c);
    }
    
}
