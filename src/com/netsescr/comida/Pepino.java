/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class Pepino extends Ensalada{
    
    public Pepino(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Pepino";
    }

    @Override
    public double precio() {
        return 434;
    }
    
}
