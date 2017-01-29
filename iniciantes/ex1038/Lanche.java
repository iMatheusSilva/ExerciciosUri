/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1038;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


/**
 *
 * @author Matheus
 */
public class Lanche {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        DecimalFormat dec = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
        double[] valores = {1.00, 4.00, 4.50, 5.00, 2.00, 1.50};
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Total: R$ " + dec.format((valores[x] * y)));
    }
    
}
