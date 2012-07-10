/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 * Esta clase representa el Plato. Lo hacemos abstracto
 * para evitar que se puedan hacer instancias directas. Esta es la base
 * de cada plato.
 * @author alpocr
 */
public abstract class Plato {

    private String descripcion = "nada";

    /**
     * 
     * @return el precio correspondiente de cada plato
     */
    public abstract double precio();

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
