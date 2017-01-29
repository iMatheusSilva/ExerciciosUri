/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1021;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

/**
 *
 * @author Matheus
 */
public class NotasEMoedas {
    
    public static int contar (double valor, double atual) {
         int cedulas = 0;
         while(valor >= atual){
              valor -= atual;
              cedulas++;
         }
         return cedulas;
     }
     public static double cvalor (double valor, double atual) {
         while(valor >= atual){
              valor -= atual;
         }
         return valor;
     }
    public static void main(String[] args){
       
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.00");
        double valor;
        valor = input.nextDouble();
        valor += 0.00000001;
        dec.format(valor);
        if (valor >= 0 && valor <= 1000000.00){
            System.out.println("NOTAS:");
            System.out.println(contar(valor, 100) + " nota(s) de R$ 100.00");
            valor = cvalor(valor, 100);
            System.out.println(contar(valor, 50) + " nota(s) de R$ 50.00");
            valor = cvalor(valor, 50);
            System.out.println(contar(valor, 20) + " nota(s) de R$ 20.00");
            valor = cvalor(valor, 20);
            System.out.println(contar(valor, 10)+ " nota(s) de R$ 10.00");
            valor = cvalor(valor, 10);
            System.out.println(contar(valor, 5) + " nota(s) de R$ 5.00");
            valor = cvalor(valor, 5);
            System.out.println(contar(valor, 2) + " nota(s) de R$ 2.00");
            valor = cvalor(valor, 2);
            System.out.println("MOEDAS:");
            System.out.println(contar(valor, 1) + " moeda(s) de R$ 1.00");
            valor = cvalor(valor, 1);
            System.out.println(contar(valor, 0.50) + " moeda(s) de R$ 0.50");
            valor = cvalor(valor, 0.50);
            System.out.println(contar(valor, 0.25) + " moeda(s) de R$ 0.25");
            valor = cvalor(valor, 0.25);
            System.out.println(contar(valor, 0.10) + " moeda(s) de R$ 0.10");
            valor = cvalor(valor, 0.10);
            System.out.println(contar(valor, 0.05) + " moeda(s) de R$ 0.05");
            valor = cvalor(valor, 0.05);
            System.out.println(contar(valor, 0.01) + " moeda(s) de R$ 0.01");
        }
    }
    
}
