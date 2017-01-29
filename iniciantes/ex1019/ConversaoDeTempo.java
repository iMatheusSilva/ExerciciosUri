
package com.uri.iniciantes.ex1019;

import java.util.Scanner;

public class ConversaoDeTempo {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int valor, hora, min, seg;
        valor = input.nextInt();
        seg = (valor % 60);
        min = (valor/60);
        hora = (min/60);
        min %= 60;
        System.out.println(hora + ":" + min + ":" + seg);
    }
    
}
