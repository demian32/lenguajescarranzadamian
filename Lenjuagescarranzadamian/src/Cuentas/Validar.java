/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuentas;

/**
 *
 * @author Deyanira
 */
public class Validar {
    public static void validarsaldo(float saldo) throws Sinsueldo{
        if(saldo<0)throw new Sinsueldo();
    }
    
    
}
