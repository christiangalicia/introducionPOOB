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
public class Porcentaje {
    private int noHombres;
    private int noMujeres;
    
    public Porcentaje(int noHombres,int noMujeres){
        this.noHombres=noHombres;
        this.noMujeres=noMujeres;
    }
    public double porcentajeHombres(){
        return (double)noHombres*100/(noHombres+noMujeres);
    }
    public double porcentajeMujeres(){
        return (double)noMujeres*100/(noHombres+noMujeres);
    }
    public void setNoHombres(int noHombres){
        this.noHombres=noHombres;
    }
    public int getNoHombres(){
        return noHombres;
    }
    
}
