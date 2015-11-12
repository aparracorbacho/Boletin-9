/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vamos a ver cuantos numeros negativos, positivos y ceros hay en el grupo");
        System.out.println("Cuantos numeros vas a introducir?");
        Scanner numerosTeclado = new Scanner(System.in);
        int numeros = numerosTeclado.nextInt();
        Numeros obx = new Numeros();
        int contador=1;
        do {
            System.out.println("Introduce el numero "+contador);
            Scanner numTeclado = new Scanner(System.in);
            int num = numTeclado.nextInt();
            obx.calcular(num);
            contador++;
        } while (contador<(numeros+1));
        obx.mostrar();
        
    }
    
}
