/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class PolloALaPlancha extends Guarnicion{

    @Override
    public String getDescripcion() {
        return "Pollo a la plancha";
    }

    @Override
    public double precio() {
        return 1200;
    }
    
}
