/*
 EN LA CLASE TARJETA IMPLEMENTA DOS ATRIBUTOS, 
 NUMEROTARJETA DE TIPO INT Y NOMBRECLIENTE DE TIPO STRING. 
CREA LOS METODOS GET Y SET CORRESPONDIENTES A CADA ATRIBUTO.
        
¿QUE TENDRIAS QUE HACER PARA QUE  ApAREZCA SIEMPRE EL NOMBRE "JUAN"
CUANDO NO SE LE ASIGNE NOMBRE A UN OBJETO DE TIPO TARJETA?

*r=atravez del constructor que me permite inicializar el atributo con el nombre de juan 
    en caso de que el usuario no le asigne nombre
 */

package tareatarjeta;

public class Tarjeta {

    public Tarjeta() {
      nombrecliente="juan";  
    }
    
    private int numerotarjeta;
    private String nombrecliente;
    
    public void setnumerotarjeta(int numerotarjeta){
        this.numerotarjeta=numerotarjeta;
    }
    public int getnumerotarjeta(){
        return numerotarjeta;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    
    
}
