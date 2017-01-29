
package com.uri.iniciantes.ex1043;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class Triangulo {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
         if (( (a + b) > c) && ( (b + c) > a) && ( (a + c)  > b)){
             System.out.println("Perimetro = " + dec.format(a + b + c));
        }
         else{
             System.out.println("Area = " + dec.format(((a+b) * c)/2.0)); 
         }
    }
}
