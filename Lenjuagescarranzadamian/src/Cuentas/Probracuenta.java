/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuentas;

/**
 *
 * @author T107
 */
public class Probracuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuentadebito c1=new Cuentadebito();
        c1.setId(1);
        c1.setNombre("alejandro");
        c1.setSaldo(6000.5f);
        c1.CrearcuentaDebito();
        
        Cuentadebito c2=new Cuentadebito();
        c2.setId(1);
        c2.setNombre("alejandro");
        c2.setSaldo(6000.5f);
        c2.CrearcuentaDebito();
        
        CuentaNomina c3=new CuentaNomina();
        c3.setId(1);
        c3.setNombre("alejandro");
        c3.setSaldo(6000.5f);
        c3.Crearcuentanomina();
        
        CuentaNomina c4=new CuentaNomina();
        c4.setId(1);
        c4.setNombre("alejandro");
        c4.setSaldo(6000.5f);
        c4.Crearcuentanomina();
        
        
       CuentaAhorro c5=new CuentaAhorro();
        c5.setId(1);
        c5.setNombre("alejandro");
        c5.setSaldo(6000.5f);
        c5.Crearcuentaahorro();
        
        CuentaAhorro c6=new CuentaAhorro();
        c6.setId(1);
        c6.setNombre("alejandro");
        c6.setSaldo(6000.5f);
        c6.Crearcuentaahorro();
        
        
    }
    
}
