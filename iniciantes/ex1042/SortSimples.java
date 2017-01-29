/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1042;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class SortSimples {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int[] vet = new int[3];
        int[] vetAux = new int[3];
        int aux;
        vet[0] = input.nextInt();
        vet[1] = input.nextInt();
        vet[2] = input.nextInt();
        for (int i = 0; i < vetAux.length; i++) {
            vetAux[i] = vet[i];
        }
        for (int i = 0; i < vet.length-1; i++) { // Metodo de ordenação BubbleSort
            for (int j = 0; j <= 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("");
        for (int i = 0; i < vetAux.length; i++) {
            System.out.println(vetAux[i]);   
        }
        
    }
    
}
