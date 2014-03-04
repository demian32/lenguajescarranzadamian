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
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String nombre, float saldo) throws Sinsueldo {
        super(nombre, saldo);
    }

   
    
    public void Crearcuentaahorro (){
   System.out.println("cuenta creada Ahorro");
    }
    
}
