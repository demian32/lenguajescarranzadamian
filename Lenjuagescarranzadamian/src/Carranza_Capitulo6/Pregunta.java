/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carranza_Capitulo6;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Pregunta {
    private Integer id;
    private String titulo;
    private ArrayList<Opcion> opciones;

    public Pregunta(Integer id, String titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titulo = titulo;
        this.opciones = opciones;
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
