/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg1;

/**
 *
 * @author aparracorbacho
 */
public class Numeros {
    private int positivo=0;
    private int negativo=0;
    private int ceros=0;
    public void calcular(int num){
        if (num>0) {
            positivo++;
        } else if (num==0) {
            ceros++;
        } else { 
            negativo++;
        }
        }
    public void mostrar(){
        System.out.println("Hay "+positivo +" numeros positivos, "+negativo +" numeros negativos y " +ceros + " ceros");
    }
}
