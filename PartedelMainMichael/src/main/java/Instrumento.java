/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public abstract class Instrumento {
    protected String nombre;
    protected Estado estado;

    public Instrumento(String nombre,Estado estado) {
        this.nombre=nombre;
        this.estado=estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public abstract String interpretacion(String pieza);
    public abstract String tocarPartitura(String partitura);

    @Override
    public String toString() {
        return "nombre=" + nombre + ", estado=" + estado;
    }
    
}
