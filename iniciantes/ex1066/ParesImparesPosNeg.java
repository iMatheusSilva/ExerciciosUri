package com.uri.iniciantes.ex1066;

import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class ParesImparesPosNeg {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); 
        int[] num = new int [5];
        int par = 0, impar = 0, pos = 0, neg = 0;
        num[0] = input.nextInt();
        num[1]= input.nextInt();
        num[2] = input.nextInt();
        num[3] = input.nextInt();
        num[4] = input.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0 && num[i] > 0){
                pos+=1;
            }else if (num[i] != 0 && num[i] < 0){
                neg+=1;
            }
            if (num[i] % 2 == 0){
                par+=1;
            }else{
                impar+=1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");  
    }

}
