/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class TortaDeCarne extends Guarnicion{
    
    public TortaDeCarne(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Torta de carne";
    }

    @Override
    public double precio() {
        return 1000;
    }
    
}
