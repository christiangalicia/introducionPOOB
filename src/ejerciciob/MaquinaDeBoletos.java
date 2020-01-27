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
public class MaquinaDeBoletos {
    private int saldo;
    private int precioBoleto;
    private int numeroDeBoletos;
    
    public MaquinaDeBoletos(int saldo,int precioBoleto, int numeroDeBoletos){
        this.saldo= saldo;
        this.precioBoleto= precioBoleto;
        this.numeroDeBoletos=numeroDeBoletos;
    }
    public int obtenerSaldo(){
        return saldo;
    }
    public int obtenerPrecio(){
        return precioBoleto;
    }
    public void ingresarDinero(int montoAgregar){
        if(montoAgregar>0){
         saldo= saldo+montoAgregar;
        }
    }
    public void imprimirBoleto(int numeroBoletos){
        if( numeroBoletos<=this.numeroDeBoletos){
        System.out.println(numeroBoletos +" Boletos comprados");
        saldo= saldo+(precioBoleto*numeroBoletos);
        this.numeroDeBoletos=this.numeroDeBoletos-numeroBoletos;
        }
    }
}