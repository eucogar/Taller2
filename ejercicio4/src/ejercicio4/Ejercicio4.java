/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;


 
public class Ejercicio4 {

   
     
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        double r,a,l;
        
        System.out.println("Dijite el radio: ");
        r = entrada.nextDouble();
        
        a = 3.14 * (r)*2;
        System.out.println("El valor de area es: "+a);
        
        l = r*2;
        System.out.println("El diametro es: "+l);
    }
    
}
