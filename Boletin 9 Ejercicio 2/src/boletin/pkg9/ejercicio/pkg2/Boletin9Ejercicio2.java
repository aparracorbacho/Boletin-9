/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vamos a calcular la suma y multiplicacion de numeros de un rango");
        System.out.println("Indica donde comienza el rango de numeros");
        Scanner num1Teclado = new Scanner(System.in);
        int num1 = num1Teclado.nextInt();
        System.out.println("indica donde acaba el rango de numeros");
        Scanner num2Teclado = new Scanner(System.in);
        int num2 = num2Teclado.nextInt();
        Calcular obx = new Calcular(num1,num2);
        obx.getsuma();     
        obx.getmulti();
        
    }
    
}
