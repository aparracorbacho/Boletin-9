/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Tabla {
    public void gettabla(){
        int repetir = 1;
        do { System.out.println("Introduce un numero para hacer la tabla e introduce 0 si quieres salir del programa");
        Scanner numTeclado = new Scanner(System.in);
        int num = numTeclado.nextInt();
        if (num!=0) {
        for (int i=1;i<11;i++) {
            System.out.println(num +" por "+i +" = "+(num*i));
        } 
            System.out.println("-----------------------------");
        } else {
            System.out.println("Gracias por usar el programa");
            repetir = 0;
        }
    } while (repetir==1);
    }
}
