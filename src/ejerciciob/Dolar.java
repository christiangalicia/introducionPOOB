/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciob;

/**
 *
 * @author Christian
 */
public class Dolar {
    private float pesos;
    private float euros;
    private float yuans;
    
    public Dolar(float pesos, float euros, float yuans){
        this.pesos=pesos;
        this.yuans=yuans;
        this.euros= euros;
    }
    public float aPesos(float cantidadDolares){
        return pesos*cantidadDolares;
    }
    public float aEuros(float cantidadDolares){
        return euros*cantidadDolares;
    }
    public float aYuans(float cantidadDolares){
        return yuans* cantidadDolares;
    }
}
