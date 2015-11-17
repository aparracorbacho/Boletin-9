/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Series {
    public void numSeries(){
        System.out.println("Introduce la cantidad de numeros de las series");
        Scanner numTeclado = new Scanner(System.in);
        int num = numTeclado.nextInt();
        impSeries(num);
             
    }
    public void impSeries(int num){
        System.out.println("Primera cadena");
        int pnum = 2;
        for (int i=0;i<num;i++){
            if (i<(num-1)) {
            System.out.print(pnum +" + "); 
            pnum = pnum + 2; 
            } else {
            System.out.print(pnum +"\n"); 
            pnum = pnum + 2;        
            }                       
        }
        System.out.println("Segunda cadena");
        int snum = 0;
        for (int i=-1;i<(num-1);i++){
            if(i%2==0) {
             System.out.print("+"+(snum+(i+2)) +" ");           
            } else {
             System.out.print(snum-(i+2) +" ");                      
            }
            }
        System.out.println("\nTercera cadena");
        int numf = 0;
        int numf1 = 1;
        for (int i=0;i<num;i++){
            if (i%2==0) {
                System.out.print(numf +" ");
                numf = numf + numf1;
            } else {
                System.out.print(numf1 +" ");
                numf1 = numf1 + numf;
            }
    
        }
}
}
