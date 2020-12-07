/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Percusion extends Instrumento{
    private boolean baquetas;
    public Percusion(String nombre, Estado estado,boolean baquetas){
        super(nombre,estado);
        this.baquetas=baquetas;
    }

    public boolean isBaquetas() {
        return baquetas;
    }

    public void setBaquetas(boolean baquetas) {
        this.baquetas = baquetas;
    }
    
    

    @Override
    public String interpretacion(String pieza) {
        return "Instrumento de percusion "+super.nombre+" interpreta: "+pieza;
    }

    @Override
    public String tocarPartitura(String partitura) {
        return "El instrumento de percusion "+super.nombre+" toca partitura "+partitura;
    }

    @Override
    public String toString() {
        return "Percusion{" +super.toString()+ "baquetas=" + baquetas + '}';
    }
    
    
    
    
}
