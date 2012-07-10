/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netsescr.comida;

/**
 *
 * @author alpocr
 */
public class EnsaladaDeRepollo extends Ensalada{
    
    public EnsaladaDeRepollo(){
        getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return "Ensalada de repollo";
    }

    @Override
    public double precio() {
        return 765;
    }
    
}
