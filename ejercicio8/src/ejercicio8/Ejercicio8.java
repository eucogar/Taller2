/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int dato;
        
        System.out.print("numero entre 1-5");
        dato = entrada.nextInt();
        
        switch(dato){
            
            case 1:
                System.out.println("Consultar saldo");
                break;
                
            case 2:
                System.out.println("Depositar");
                break;
             
            case 3:
                System.out.println("Girar");
                break;
                
            case 4: 
                System.out.println("Retirar");
                break;
                
            case 5:
                System.out.println("Salir");
                break;
                
        }
        
        
    }
    
}
