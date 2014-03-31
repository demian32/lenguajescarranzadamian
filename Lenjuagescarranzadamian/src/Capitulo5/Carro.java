/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo5;
import java.awt.Point;
 import java.util.Random;

public class Carro { 

    public static void main(String[] args) {
        
        Thread[] t1=new Thread[5];
        for(int i=0;i<5;i++)
        {
        
         t1[i]=new  Thread (new Runnable(){
            public int x;
            public int y;
            public int x0,y0=0;
            public void run(){
                while(true){
                try {
                    Thread.sleep(5000);
                    
                    Random rnd = new Random();
                    x=(rnd.nextInt(1+1+1)+-1);
                    y=(rnd.nextInt(1+1+1)+-1);
                    Point posicion=new Point(x0,y0);
                    x0=x0+x;
                    y0=y0+y;
                    System.out.println(posicion);
                        
                } catch (InterruptedException ex){
                }}
            }
        });
        
        t1[i].start();
        
         
    }   }                                                                                                           
    
}
