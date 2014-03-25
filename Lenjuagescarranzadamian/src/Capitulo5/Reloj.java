/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo5;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author T107
 */
public class Reloj{
    public static void main(String[] args) {
        
        Thread t1=new  Thread(new Runnable(){
            public void run(){
                while(true){
                try {
                    Thread.sleep(1000);
                    //creamos un objeto de una clase que se llama calendar
                    Calendar cal=Calendar.getInstance();
                    int hora=cal.get(Calendar.HOUR);
                    int min=cal.get(Calendar.MINUTE);
                    int se=cal.get(Calendar.SECOND);
                    String time=hora+":"+min+":"+se;
                    System.out.println(time);
                    
                } catch (InterruptedException ex){
                }}
            }
        });
        t1.start();
        
    }
}
    

