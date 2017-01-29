/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1037;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Matheus
 */
public class Intervalo {
    
    public static void main(String[] args){
      
      Locale.setDefault(Locale.US); 
      Scanner input = new Scanner(System.in);
      double x = input.nextDouble();
      if (x >= 0 && x <= 25){
          System.out.println("Intervalo [0,25]");
      }
      else if (x > 25 && x <= 50){
           System.out.println("Intervalo (25,50]");
      }
      else if (x > 50 && x <= 75){
           System.out.println("Intervalo (50,75]");
      }
      else if (x > 75 && x <= 100){
           System.out.println("Intervalo (75,100]");
      }
      else{
          System.out.println("Fora do intervalo");
      }
    }  
}
