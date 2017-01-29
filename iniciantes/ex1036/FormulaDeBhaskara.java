/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1036;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
/**
 *
 * @author Matheus
 */
public class FormulaDeBhaskara {
    
    public static double raizpos (double a, double b, double c, double delta){
        double raiz = (-b+Math.sqrt(delta))/(2*a); 
        return raiz;
    }
    public static double raizneg (double a, double b, double c, double delta){
        double raiz = (-b-Math.sqrt(delta))/(2*a); 
        return raiz;
    }
    public static void main(String[] args ){
        
        Locale.setDefault(Locale.US);
        DecimalFormat dec = new DecimalFormat("#.#####");
        Scanner input = new Scanner(System.in);
        double a, b, c, delta;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        delta = (b*b)-(4*a*c);
        if (2*a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else{
            System.out.println("R1 = " + dec.format(raizpos(a, b, c, delta)));
            System.out.println("R2 = " + dec.format(raizneg(a, b, c, delta)));
        }
    }
    
}
