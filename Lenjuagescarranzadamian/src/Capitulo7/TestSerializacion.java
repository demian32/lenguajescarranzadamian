/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo7;

public class TestSerializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Usuario un =new Usuario("damian",20,"hola");
        GuardarUsuario.guardar(un); 
    }
    
}
