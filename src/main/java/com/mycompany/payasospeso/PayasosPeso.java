/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payasospeso;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PayasosPeso {
    public static void main (String args[]){
        
        Scanner sc = new Scanner (System.in);
        
        int payasosP = 112;
        int munecasP = 75;
        
        System.out.println("Cuantos payasos vas a enviar");
        int payaso = sc.nextInt();
        
        System.out.println("Cuantos muñecas vas a enviar");
        int munecas = sc.nextInt();
        
        int Ptotal;
        
        Ptotal = (int) (payasosP * payaso + munecasP * munecas);
        System.out.println("El peso total es: "+Ptotal);
        
        
        
     
    }
    
}
