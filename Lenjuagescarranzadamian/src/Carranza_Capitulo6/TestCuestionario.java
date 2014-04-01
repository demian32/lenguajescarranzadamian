/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carranza_Capitulo6;

/**
 *
 * @author T107
 */
public class TestCuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for(Pregunta preguntita:GenerarCuestionario.obtenerCuestionario())
     {System .out.println(preguntita.getTitulo());
       for(Opcion opcion: preguntita.getOpciones()){
         {System .out.println(opcion.getTitulo()+" "+opcion.isValor());  
       }        
     }
    }}}
    

