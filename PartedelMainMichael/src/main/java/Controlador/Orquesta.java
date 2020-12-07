
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
 
//import Controlador;

public class Orquesta {
    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<Instrumento>();

    public void agregarInstrumentoCuerda(String nombre, Estado estado, int cantidadCuerdas){
    
    }
    public void interpretarPieza(String interpretacion) throws Exception{
        for (int i = 0; i < listaInstrumentos.size(); i++) {
            Instrumento temp = listaInstrumentos.get(i);
            if(temp.getEstado() != Estado.malo || temp.getEstado() != Estado.medio_malo){
            System.out.println(temp.interpretacion(interpretacion));
            }
            else if(temp.getEstado() == Estado.medio_malo){
                System.out.println("El instrumento " + temp.getNombre() + " se tuvo que arreglar." );
                temp.setEstado(Estado.bueno);
            }
            else{
                throw new Exception("El instrumento "+temp.getNombre()+" tuvo un daño irreparable.");
            }
        }
    }
    public void ejecutarPartitura(String partitura) throws Exception{
        for (int i = 0; i < listaInstrumentos.size(); i++) {
            Instrumento temp = listaInstrumentos.get(i);
            
            if(temp.getEstado() != Estado.malo || temp.getEstado() != Estado.medio_malo){
                System.out.println(temp.tocarPartitura(partitura));
            }
            else if(temp.getEstado() == Estado.medio_malo){
                System.out.println("El instrumento " + temp.getNombre() + " se tuvo que arreglar." );
                temp.setEstado(Estado.bueno);
            }
            else{
                throw new Exception("El instrumento "+temp.getNombre()+" tuvo un daño irreparable.");
            }
        }
    }
    public void afinarInstrumentos() throws Exception{
        Percusion evitar = new Percusion("Evitar", Estado.bueno);
        Cuerda cuerda = new Cuerda("cuerda", Estado.bueno, 1);
        Viento_madera madera = new Viento_madera("madera",Estado.bueno, "V");
        Viento_metal metal = new Viento_metal("metal",Estado.bueno, "V");
        for (int i = 0; i < listaInstrumentos.size(); i++) {
            Instrumento temp = listaInstrumentos.get(i);
            if(temp.getClass() != evitar.getClass()){
                if(temp.getEstado() != Estado.medio_malo || temp.getEstado() != Estado.malo){
                    if(temp.getClass() == cuerda.getClass()){
                        cuerda = (Cuerda) temp;
                        System.out.println(cuerda.afinar());
                    }
                    else if(temp.getClass() == madera.getClass()){
                        madera = (Viento_madera) temp;
                        System.out.println(madera.afinar());
                    }
                    else if(temp.getClass() == metal.getClass()){
                        metal = (Viento_metal) temp;
                        System.out.println(metal.afinar());
                    }
                }
                else if(temp.getEstado() == Estado.medio_malo){
                System.out.println("El instrumento " + temp.getNombre() + " se tuvo que arreglar." );
                temp.setEstado(Estado.bueno);
                }
                else{
                    throw new Exception("El instrumento "+temp.getNombre()+" tuvo un daño irreparable.");
                }
            }
        }
    }
    
}

