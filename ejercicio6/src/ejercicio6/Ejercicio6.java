/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float peso, altura;
        double bmi;
        
        System.out.print("Ingrese el peso: ");
        peso = entrada.nextFloat();
        
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextFloat();
        
        bmi = peso / (altura*altura);
        System.out.print("El BMI es: "+bmi);
    }
    
}
