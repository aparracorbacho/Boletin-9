/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg2;

/**
 *
 * @author aparracorbacho
 */
public class Calcular {
    double num1;
    double num2;
    public Calcular (double num1, double num2) {
    this.num1=num1;
    this.num2=num2;
    }
    public void getsuma(){
        double resultadosum = 0;
        for (double i=0;((num1+i)<=num2);i++){ 
        resultadosum = resultadosum + num1 + i;
        }
        System.out.println("La suma del rango es: "+resultadosum);
    }
    public void getmulti(){
        double resultadomulti = 1;
        for (double i=0;((num1+i)<=num2);i++){ 
        resultadomulti = resultadomulti * (num1+i);
        }
        System.out.println("La multiplicacion rango es: "+resultadomulti);
    }
       
}

