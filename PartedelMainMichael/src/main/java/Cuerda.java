/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Cuerda extends Instrumento implements Mantenimiento{
    
    private int cantidadCuerda;
    
    public Cuerda(String nombre,Estado estado,int cantidadCuerda){
        super(nombre,estado);
        this.cantidadCuerda=cantidadCuerda;
    
    }

    public int getCantidadCuerda() {
        return cantidadCuerda;
    }

    public void setCantidadCuerda(int cantidadCuerda) {
        this.cantidadCuerda = cantidadCuerda;
    }
    
    

    @Override
    public String interpretacion(String pieza) {
       return "Instrumento de cuerda "+super.nombre+" interpreta: "+pieza;
    }

    @Override
    public String tocarPartitura(String partitura) {
        return "El instrumento de cuerda "+super.nombre+" toca partitura "+partitura;
    }

    @Override
    public String afinar() {
       return "El instrumento de cuerda "+super.nombre+" se afino";
    }

    @Override
    public String toString() {
        return "Cuerda{" +super.toString()+ "cantidadCuerda=" + cantidadCuerda + '}';
    }
    
    
    
}
