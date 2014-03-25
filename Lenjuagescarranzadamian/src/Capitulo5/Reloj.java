/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo5;

/**
 *
 * @author T107
 */
public class Reloj{
    public static void main(String[] args) {
        
        Thread t1=new  Thread(new Runnable(){
            public void run(){
             System.out.println("Animooooooooo1");   
            }
        });
        Thread t2=new  Thread(new Runnable(){
            public void run(){
             System.out.println("Animooooooooo2");   
            }
        });
        
        t1.start();
        t2.start();
        
    }
}
    

