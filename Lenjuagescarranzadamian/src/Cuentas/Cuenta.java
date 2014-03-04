/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuentas;

import usuario.Validacion;

/**
 *
 * @author T107
 */
public class Cuenta {
    private int id;
    private String nombre;
    private float saldo;

    public Cuenta(String nombre, float saldo)throws Sinsueldo {
        Validar.validarsaldo(saldo);
        this.nombre = nombre;
        this.saldo = saldo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws Sinsueldo {
      Validar.validarsaldo(saldo);
        this.saldo = saldo;
    }
    public void Crearcuenta (){
   System.out.println("cuenta creada felicidades  y ......Animoooooooooooo");
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    }
    
    

