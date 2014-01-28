/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase2;

/**
 *
 * @author T107
 */
public class Usuario {
   String nombre; 
    private int edad;

    public int getEdad() {
        //System.out.println(" no es mayor de edad");
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0 && edad<18){
            System.out.println(" no es mayor de edad");
        }
        
        this.edad = edad;
    }

    
}
