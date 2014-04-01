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
public class Opcion {
    private Integer id; 
    private String titulo;
    private boolean valor;

    public Opcion(Integer id, String titulo, boolean valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
