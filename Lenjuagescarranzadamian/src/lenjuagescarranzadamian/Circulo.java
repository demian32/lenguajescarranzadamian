/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Bien!!!  ya tienes primer tarea ahora trata de impedir que el radio no sea negativo
 */

package lenjuagescarranzadamian;

/**
 *

 */
public class Circulo {
    float radio;
    public Circulo(){
        radio=-10;       
    }
    public void validar(){
    if (radio<0)
            System.out.println("no negativos");
        else            
        System.out.println(radio);
    
    }
}
