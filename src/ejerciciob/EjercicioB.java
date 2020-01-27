/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciob;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class EjercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a= "hola mi correo es  juan@hotmail.com gracias "+
               "hola mi correo es  jdavid@hotmail.com gracias "+
               "hola mi correo es  luisn@hotmail.com, gracias "+
                "el de trabajo juan@uttehuacan.edu.mx ";
       
       ManejoDeCadenas mc = new ManejoDeCadenas();
       System.out.println(mc.borrarCorreos(a));
       
       String otro =" otro correo@corre.com y otro@otro.com ";
        System.out.println(mc.borrarCorreos(otro));
       
        /*
        Alumno david = new Alumno("David", 20, "activo");
        System.out.println(david.consultarAlumno());
        david.modificarCalificaciones(8, 9);
        System.out.println(david.consultarCalificacionFinal());
        
        Alumno maria = new Alumno("Maria", 22, "activo");
         System.out.println(maria.consultarAlumno());
        maria.modificarCalificaciones(10, 9);
        System.out.println(maria.consultarCalificacionFinal());
         */
 /*
       MaquinaDeBoletos caja1 = new MaquinaDeBoletos(500,50,10);
        System.out.println(caja1.obtenerPrecio());
        System.out.println(caja1.obtenerSaldo());
        caja1.ingresarDinero(200);
        System.out.println(caja1.obtenerSaldo());
        caja1.imprimirBoleto(6);
        System.out.println(caja1.obtenerSaldo());
        caja1.imprimirBoleto(6);
        System.out.println(caja1.obtenerSaldo());
         */
 /*
       Circulo c= new Circulo(15.2);
        System.out.println(c.perimetro());
        System.out.println(c.area());
        System.out.println(c.getRadio());
        c.setRadio(5);
        System.out.println(c.perimetro());
        System.out.println(c.area());
         */
 /*
        Scanner leer = new Scanner(System.in);
        Porcentaje p1=null;
       while(true){
           System.out.println("1- inciar o reiniciar programa");
           System.out.println("2.-mostrar porcentajes de H y M");
           int opcion = leer.nextInt();
           if(opcion == 1){
               System.out.println("Ingresa numero de hombres y mujeres");
               int h = leer.nextInt();
               int m= leer.nextInt();
               p1 = new Porcentaje(h, m);
           }else if(opcion==2){
               System.out.println("hombre: "+p1.porcentajeHombres());
               System.out.println("mujeres: "+p1.porcentajeMujeres());
           }
       }
         */
 /*  Dolar dolar = new Dolar(18.79f, .9f, 6.88f);
    System.out.println(dolar.aPesos(10));
    System.out.println(dolar.aEuros(10));*/
/*
        CuentaBancaria cb = new CuentaBancaria("juan", 300,3123);
        cb.retirar(1000);
        cb.retirar(100);
        cb.depositar(200);
        System.out.println(cb.consultarSaldo());
*/

    }

}
