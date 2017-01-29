/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1071;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class SomaDeImparesConsecutivosI {
    
    public static int soma ( int maior, int menor){
        int soma = 0;
        for (int i = (menor+1); i < maior ; i++){
               if (i % 2 != 0){
                   soma += i;
               }
        }
        return soma;
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y){
            System.out.println(soma(x,y));
        }
        else {
            System.out.println(soma(y,x));
        }
    }  
}
