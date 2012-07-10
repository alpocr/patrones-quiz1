/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class ArrozIntegral extends Elemento{
    
    public ArrozIntegral(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Arroz integral";
    }

    @Override
    public double precio() {
        return 887;
    }
    
}
