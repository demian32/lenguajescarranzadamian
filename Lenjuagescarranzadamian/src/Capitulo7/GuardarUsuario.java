/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo7;
import java.util.*;
import java.io.*;
public class GuardarUsuario {

    public ArrayList<Usuario> u=new ArrayList<Usuario>();
    public void agregarPersona(Usuario us){
        this.u.add(us);
    }
    public static void Guardar()throws Exception{
        File file=new File("archivito.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(oos);
    }
        
    
    
    
    
    /*public void guardar(ArrayList<Usuario> u)throws Exception{
    //public static void guardar(Usuario u)throws Exception{
        File file=new File("Arhivo.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);*/

    public static Usuario leer()throws Exception{
        
        File file=new File("Arhivo.xxx");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario us=(Usuario) ois.readObject();
        return us;
    }
}
