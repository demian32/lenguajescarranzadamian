/*
 EN LA CARPETA  CAPITULO1 VAS A ENCONTRAR LA CLASE IMAGEN, EN ELLA
 VAS A AGREGAR LOS ARTIBUTOS ALTO, DE TIPO INT , ANCHO DE TIPO INT. PRACTICALE EL ENCAPSULAMIENTO  E IMPON LA REGLA DE
 QUE LOS ATRIBUTOS NO SEAN NEGATIVOS (TRASNFORMALOS A POSITIVOS). CREAR UNA CLASE TESTIMAGEN CON METODO MAIN Y EN ELLA CREA UN OBJETO 
 DE TIPO IMAGEN, ASIGNALE UN VALORES NEGATIVOS A ALTO Y ANCHO Y VERIFICA QUE SE CAMBIEN A POSITIVOS.

 */

package tareaimagen;

public class Imagen {
    private int alto;
    private int ancho;
    
    
    public void setAlto(int alto){
        if(alto<0)alto=-alto;
        this.alto=alto;
        System.out.println("el ancho es "+alto+" ");
    }
    public int getAlto(){
     return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho<0)ancho=-ancho;
        this.ancho = ancho;
        System.out.println("el ancho es "+ancho+" ");
    }
    
}
