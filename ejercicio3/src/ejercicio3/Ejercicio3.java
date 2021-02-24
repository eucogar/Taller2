/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        float a, b,c,d;
         
        System.out.print("Ingrese un numero decimal: ");
        a = entrada.nextFloat();
        System.out.print("Ingrese un numero decimal: ");
        b = entrada.nextFloat();
        System.out.print("Ingrese un numero decimal");
        c = entrada.nextFloat();
        
        d = a + b + c;
        System.out.println("La suma es: "+d);
        d = a * b * c;
        System.out.println("El producto es: "+d);
        d = a / b /c ;
        System.out.println("El cociente es: "+d);
    }
    
}
