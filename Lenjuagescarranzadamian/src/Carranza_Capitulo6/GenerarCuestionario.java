/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carranza_Capitulo6;

import java.util.*;


public class GenerarCuestionario {
    public static ArrayList<Pregunta> obtenerCuestionario(){
        ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
        Opcion op11=new Opcion(1,"el salvador",false);
        Opcion op12=new Opcion(2,"Peru",false);
        Opcion op13=new Opcion(3,"Mexico",false);
        Opcion op14=new Opcion(4,"Finlandia",true);
         opciones1.add(op11);
         opciones1.add(op12);
         opciones1.add(op13);
         opciones1.add(op14);
         Pregunta p1=new Pregunta(1,"blablabla",opciones1);
        ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
        cuestionario.add(p1);
    return cuestionario;
    }
    
    
    
}
