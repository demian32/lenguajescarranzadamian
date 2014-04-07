/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Biblioteca;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 *
 * @author Deyanira
 */
public class Guardarbi {
    
    
    public static void Guardar(ArrayList<Libro> li) throws Exception{    
    li.add(new Libro(1,"hola","otro",15));
                        File file=new File("archivito.xxx");
			FileOutputStream fos = new FileOutputStream(file);
        try (ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(li);
        }
		System.out.println("Biblioteca serializada");
	}
    
    public static void Leer() throws Exception{ 
        ArrayList<Libro> li=new ArrayList();
                        File file=new File("archivito.xxx");
			FileInputStream fis = new FileInputStream(file);
        try (ObjectInputStream entrada = new ObjectInputStream(fis)) {
            li =(ArrayList) entrada.readObject();
        }
		System.out.println("Leyendo biblioteca");

	}

  

    
    
    
    
    
    
    
    
    
    
    }
    

