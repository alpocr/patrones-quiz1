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

    public String descripcion = "nada";

    public abstract double precio();
}
