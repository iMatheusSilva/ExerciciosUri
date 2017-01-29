/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uri.iniciantes.ex1017;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Matheus
 */
public class GastoDeCombustivel {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        DecimalFormat dec = new DecimalFormat("###,###,##0.000");
        Scanner input = new Scanner(System.in);
        int tempoGasto, veloMedia;
        double qtdLitros;
        tempoGasto = input.nextInt();
        veloMedia = input.nextInt();
        qtdLitros = ((double)(tempoGasto * veloMedia))/12;
        System.out.println(dec.format(qtdLitros));
    }
    
}
