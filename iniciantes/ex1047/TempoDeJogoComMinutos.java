/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1047;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class TempoDeJogoComMinutos {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int minIn = 0, horaIn = 0, minFin = 0, horaFin = 0, minTotal = 0, horaTotal = 0;
        horaIn = input.nextInt();
        minIn = input.nextInt();
        horaFin = input.nextInt();
        minFin = input.nextInt();
        
        
            if (horaIn > horaFin){
                horaTotal = 24 -(horaIn - horaFin) - 1;
            }
            else{
                horaTotal = horaFin - horaIn;
            }
            if (minIn > minFin){
                if ((horaFin - horaIn) == 1){
                    horaTotal = 0;
                }
                minTotal = 60 - (minIn - minFin);
            }
            else{
               minTotal = minFin - minIn;
            }
            if ((horaIn == horaFin) && (minIn == minFin)){
                minTotal = 0;
                horaTotal = 24;
            }
            
        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minTotal + " MINUTO(S)");
    }
}
