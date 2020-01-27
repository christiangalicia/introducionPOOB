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
public class CuentaBancaria {
    private String nombre;
    private float saldo;
    private int noCuenta;

    public CuentaBancaria(String nombre, float saldo, int noCuenta) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.noCuenta = noCuenta;
    }

    
    
    public void retirar(float monto){
        if(monto<=saldo){
            saldo=saldo-monto;
        }
    }
    public void depositar(float monto){
        if(monto>0){
            saldo+=monto;
        }
    }
    public String consultarSaldo(){
        return nombre+" Cuenta: "+noCuenta+" Saldo: "+saldo;
    }
    
    
}
