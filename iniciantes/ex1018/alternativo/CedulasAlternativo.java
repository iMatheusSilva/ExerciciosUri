package com.uri.iniciantes.ex1018.alternativo;
import java.util.Scanner;


public class CedulasAlternativo {
     public static int contar (int valor, int atual) {
         int cedulas = 0;
         while(valor >= atual){
              valor -= atual;
              cedulas++;
         }
         return cedulas;
     }
     public static int cvalor (int valor, int atual) {
         while(valor >= atual){
              valor -= atual;
         }
         return valor;
     }
    public static void main(String[] args){
       
        
        Scanner input = new Scanner(System.in);
        int valor;
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1} ;
        valor = input.nextInt();
        System.out.println(valor);
        for(int i=0; i<cedulas.length; i++){
            System.out.println(contar(valor, cedulas[i]) + " nota(s) de R$ " + cedulas[i] + ",00");
            valor = cvalor(valor, cedulas[i]);
        }
    }
}
