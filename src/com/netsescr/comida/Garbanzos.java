/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class Garbanzos extends Elemento{
    
    public Garbanzos(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Garbanzos";
    }

    @Override
    public double precio() {
        return 750;
    }
    
}
