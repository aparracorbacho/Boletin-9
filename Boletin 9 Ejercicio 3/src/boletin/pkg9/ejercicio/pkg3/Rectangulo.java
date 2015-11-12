/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Rectangulo {
    int base;
    int altura;
   public void introduce(){
       int repetir = 1;
       do {
        System.out.println("Introduce la base");
        Scanner baseTeclado = new Scanner(System.in);
        int base = baseTeclado.nextInt();
        System.out.println("Introduce la altura");
        Scanner alturaTeclado = new Scanner(System.in);
        int altura = alturaTeclado.nextInt();
         if (base<=0 || altura<=00){
            System.out.println("Alguno de los valores es negativo o cero, vuelve a probar");
            repetir = 1;
        } else {
             this.base=base;
             this.altura=altura;
            repetir = 0;
         }
       } while (repetir==1);
   }
   public void area(){
       System.out.println("El area del rectangulo es: "+(base*altura));
   }
    
}

   