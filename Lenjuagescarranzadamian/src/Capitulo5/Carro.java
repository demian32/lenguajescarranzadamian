/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo5;
 import java.util.Random;

public class Carro {

    public static void main(String[] args) {
        
        
        Thread t=new  Thread (new Runnable(){
            public int x;
            public int y;
            public void run(){
                while(true){
                try {
                    Thread.sleep(5000);
                    //creamos un objeto de una clase que se llama calendar
                    Random rnd = new Random();
                    
                    x=(rnd.nextInt(1+1+1)+-1);
                    y=(rnd.nextInt(1+1+1)+-1);
                    
                    System.out.println(x+" "+y);
                    
                } catch (InterruptedException ex){
                }}
            }
        });
        t.start();
         
    }                                                                                                              
    
}
