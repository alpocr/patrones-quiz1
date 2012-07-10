/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class EnsaladaDePapa extends Ensalada{
    
    public EnsaladaDePapa(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Ensalada de papa";
    }

    @Override
    public double precio() {
        return 875;
    }
    
}
