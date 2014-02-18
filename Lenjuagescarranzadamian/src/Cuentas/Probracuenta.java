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
        c1.Crearcuenta();
        
        CuentaNomina c2=new CuentaNomina();
        c2.setId(1);
        c2.setNombre("alejandro");
        c2.setSaldo(6000.5f);
        c2.Crearcuenta();
        
        
    }
    
}
