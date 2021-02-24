
package ejercicio1;

import java.util.Scanner;
 
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
      
       int num1, num2;
       double x = 0;
       
      System.out.print("Ingrese un numero entero: ");
      num1 = entrada.nextInt();
      System.out.print("Ingrese un numero entero: ");
      num2 = entrada.nextInt();
      System.out.printf("x = %d \n ",num1,num2,x );
      x = num1 + num2;
      System.out.printf("El valor de %d + %d es %.2f \n ",num1,num2,x );
      System.out.printf(" x=%.2f\n",x );
      x = num1 - num2;
      System.out.printf("%d - %d = %.2f\n",num1, num2, x );

    }
    
}
