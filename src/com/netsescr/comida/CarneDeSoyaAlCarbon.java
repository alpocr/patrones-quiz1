/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class CarneDeSoyaAlCarbon extends Guarnicion{
    
    public CarneDeSoyaAlCarbon(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Carne de Soya al Carbón";
    }

    @Override
    public double precio() {
        return 800;
    }
    
}
