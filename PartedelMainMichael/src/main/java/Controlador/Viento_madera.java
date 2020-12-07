/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Viento_madera extends Instrumento implements Mantenimiento{
    private String clasificacion;
    
    public Viento_madera(String nombre,Estado estado,String clasificacion){
        super(nombre,estado);
        this.clasificacion=clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    

    @Override
    public String interpretacion(String pieza) {
        return "Instrumento viento madera "+super.nombre+" interpreta: "+pieza;
    }

    @Override
    public String tocarPartitura(String partitura) {
        return "El instrumento viento madera "+super.nombre+" toca partitura "+partitura;
    }
    
    @Override
    public String afinar() {
       return "El instrumento de viento madera "+super.nombre+" se afino";
    }

    @Override
    public String toString() {
        return "Viento_madera{" +super.toString()+ "clasificacion=" + clasificacion + '}';
    }
    
    
    
}
