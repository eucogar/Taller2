/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico9;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class Ejercico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = 0 ;
        double km,kmc=0,gasolina,gc,pkm,pkmc = 0,peaje,peajec,v;
        
        System.out.print("Ingrese el numro de dias que duro su viaje: ");
        dia = entrada.nextInt();
        
         for(int i=0; i<dia; i++){
             
    
             System.out.print("Ungrese el numo de kilometros recorrido en el dia "+i+1);
             km = entrada.nextDouble();
             kmc = kmc + km;
             
             System.out.print("Ingrese el costo de un litro de gasolina");
             gasolina = entrada.nextDouble();
             
             
             System.out.print("kilometros recorrido por litro de gasolina");
             pkm = entrada.nextDouble();
             pkmc = pkmc + pkm;
             
             System.out.print("valor pago en peajes");
             peaje = entrada.nextDouble();
             
             v = ((kmc * pkmc)*gasolina)+peaje;
             System.out.print(v);
    }
    
   
}
}