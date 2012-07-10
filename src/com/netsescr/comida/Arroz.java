/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class Arroz extends Elemento{
    
    public Arroz(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Arroz";
    }

    @Override
    public double precio() {
        return 500;
    }
    
}
