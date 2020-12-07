import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 * Hola :
 */
public class main {
    public static void main(String[] args) {
        Orquesta orquesta = new Orquesta();
        Random rand = new Random();
        int cantidad = rand.nextInt(20) + 80;
        
        //---------------------- Probando la creación de la orquesta ----------------
        
        for(int i = 0; i < cantidad; i++){
            int numero = rand.nextInt(4);
            
            if(numero == 0){
                orquesta.agregarInstrumentoCuerda("Violin", Estado.bueno, 5);
            }
            
            else if(numero == 1){
                orquesta.agregarInstrumentoVientoMadera("Flauta", Estado.bueno, "Madera");
            }
            
            else if(numero == 2){
                orquesta.agregarInstrumentoVientoMetal("Saxofon", Estado.bueno, "Metal");
            }          
            
            else if(numero == 3){
                orquesta.agregarInstrumentoPercusion("Bateria", Estado.bueno, true);
            }
        }
        
        //-------------------- Mostrando la composición de la encuesta --------------
        
        for(int i = 0; i < orquesta.getListaInstrumentos().size(); i++){
            Instrumento instrumento = orquesta.getListaInstrumentos().get(i);
            
            System.out.print(instrumento.nombre + " - " + instrumento.estado + "\n");
        }
        
        //-------------------- Crear partituras especificas para los tipos de instrumentos --
        String partituraCuerda = "Partitura de instrumentos de cuerda";
        String partituraVientoMadera = "Partitura de instrumentos de viento madera";
        String partituraViendoMetal = "Partitura de instrumentos de viento metal";
        String partituraPercusion = "Partitura de instrumentos de percusion";

        //-------------------- Solicitar el afinamiento de los instrumentos ----------
        for(int i = 0; i < orquesta.getListaInstrumentos().size(); i++){
            Instrumento instrumento = orquesta.getListaInstrumentos().get(i);
            
         
        }
        
        //--------------------- Solicitar a la orquesta tocar una nota en especifico --------
        for(int i = 0; i < orquesta.getListaInstrumentos().size(); i++){
            Instrumento instrumento = orquesta.getListaInstrumentos().get(i);
            
            instrumento.interpretacion("SOL");
        }
        
        //--------------------- Solicitar a la orquesta tocar una nota en especifico --------
        for(int i = 0; i < orquesta.getListaInstrumentos().size(); i++){
            Instrumento instrumento = orquesta.getListaInstrumentos().get(i);
            
            instrumento.tocarPartitura(partituraCuerda);
        }
        
        int numeroMalo = rand.nextInt(orquesta.getListaInstrumentos().size());
        
        orquesta.getListaInstrumentos().get(numeroMalo).setEstado(Estado.medio_malo);
        
        orquesta.getListaInstrumentos().get(numeroMalo).setEstado(Estado.bueno);
        
        orquesta.getListaInstrumentos().get(numeroMalo).setEstado(Estado.malo);
        
    }
}
