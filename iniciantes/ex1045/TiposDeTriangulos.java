/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1045;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class TiposDeTriangulos {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double[] vet = new double [3];
        double a, b, c, aux;
        vet[0] = input.nextDouble();
        vet[1] = input.nextDouble();
        vet[2] = input.nextDouble();
        for (int i = 0; i < vet.length-1; i++) { // Metodo de ordenação BubbleSort
            for (int j = 0; j <= 1; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        a = vet[0];
        b = vet[1]; 
        c = vet[2];
        if (a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if ((a * a) == (b * b) + (c * c)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > ((b * b) + (c * c))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < ((b * b) + (c * c))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if ((a == b) && (b == c) && (c == a)){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b) || (b == c) || (c == a)){
                if ((a != b) || (b != c) || (c != a)) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
