/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Sueldo {
    public void calcularSueldo(){
        int trmenos = 0;
        int trmas = 0;
        int repetir = 0;
        do {
        System.out.println("Introduce el sueldo de un trabajador");
        Scanner sueldoTeclado = new Scanner(System.in);
        int sueldo = sueldoTeclado.nextInt();
        if ((sueldo>=1000) && (sueldo<=1750)) {
            trmas = trmas + 1;
            repetir = 1;
        } else if ((sueldo<1000) && (sueldo>0)) {
            trmenos = trmenos + 1;
            repetir = 1;
        } else if (sueldo>1750) {
            System.out.println("Nadie cobra más de 1750€ en esta empresa");
            repetir = 1;
        } else if (sueldo<0) {
            System.out.println("Nadie va a pagar por trabajar para ti");
            repetir = 1;
        } else if (sueldo==0) {
            int total = trmenos+trmas;
            System.out.println("El numero de trabajadores que cobra menos de 1000€ es "+trmenos +"\nEl numero de trabajadores que cobra mas de 1000€ es "+trmas);
            System.out.println("El porcentaje de gente que cobra menos de 1000€ es "+(trmenos*100/total) +"%\nEl porcentaje de trabajadores que cobran mas de 1000€ es "+(trmas*100/total)+"%");
            System.out.println("Gracias por usar el programa");
            repetir = 0;
        }
        } while (repetir==1);
}
}
