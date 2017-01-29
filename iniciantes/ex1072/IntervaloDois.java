/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1072;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class IntervaloDois {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int in = 0, out =0;
        int n = input.nextInt();
        int[] x = new int [n];
        for (int i = 0; i <= (n-1); i++) {
            x[i] = input.nextInt();            
        }
        for (int i = 0; i <= (n-1); i++) {
            if (x[i] >= 10 && x[i] <= 20){
                in+=1;
            }
            else{
                out+=1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
