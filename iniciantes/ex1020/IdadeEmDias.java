
package com.uri.iniciantes.ex1020;
import java.util.Scanner;

public class IdadeEmDias {
    public static int contar (int valor, int atual){
        int aux = 0;
        while (atual <= valor){
            valor -= atual;
            aux++;
        }
        return aux; 
    }
    public static int retira (int valor, int atual){
        while (atual <= valor){
        valor -= atual;
        }
        
        return valor;
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int valor, dia, mes, ano;
        valor = input.nextInt();
        if (valor >= 360 && valor <= 364){
            System.out.println( "1 ano(s)"); 
            System.out.println( "0 mes(es)"); 
            System.out.println( "0 dia(s)"); 
        }
        else{
            System.out.println(contar(valor, 365) + " ano(s)"); 
            valor = retira(valor, 365);
            System.out.println(contar(valor, 30) + " mes(es)");
            valor = retira(valor, 30);
            System.out.println(valor + " dia(s)");
        }
    }
    
}
