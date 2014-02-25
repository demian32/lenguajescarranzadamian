/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

/**
 *
 * @author T107
 */
public class CrearUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Usuario alumno=new Usuario();
        alumno.setNombre("alejandro");
        alumno.setEdad(15);
        alumno.getNombre();
        alumno.getEdad();
        
        
    }
    
}
