/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1018;

import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class Cedulas {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int valor, cedulas;
        cedulas = 0;
        valor = input.nextInt();
        System.out.println(valor);
        while(valor >= 100){
              valor -= 100;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 100,00");
        cedulas = 0;
        while(valor >= 50){
              valor -= 50;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 50,00");
        cedulas = 0;
        while(valor >= 20){
              valor -= 20;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 20,00");
        cedulas = 0;
        while(valor >= 10){
              valor -= 10;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 10,00");
        cedulas = 0;
        while(valor >= 5){
              valor -= 5;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 5,00");
        cedulas = 0;
        while(valor >= 2){
              valor -= 2;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 2,00");
        cedulas = 0;
        while(valor >= 1){
              valor -= 1;
              cedulas += 1;
        }
        System.out.println(cedulas + " nota(s) de R$ 1,00");
    }
}

