/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1035;
import java.util.Scanner;


public class TesteDeSelecao {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        if ((B > C) && (D > A) && ((C + D) > ( A + B)) && (C > 0 && D > 0) && (A % 2 == 0)){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        } 
    }
    
}
