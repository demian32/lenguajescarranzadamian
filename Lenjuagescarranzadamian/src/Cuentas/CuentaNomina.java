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
public class CuentaNomina extends Cuenta {

    public CuentaNomina(String nombre, float saldo)throws Sinsueldo  {
        super(nombre, saldo);
    }
    
    public void Crearcuentanomina (){
   System.out.println("cuenta creada Nomina");
    }
    
}
