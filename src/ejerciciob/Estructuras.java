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
public class Estructuras {
    
    public void si(){
        int a=5;
        
        if(a>=5){
            System.out.println("mayor igual a 5");
        }
        
        if(a<5){
            System.out.println("es menor a 5");
        }else{
            System.out.println("es mayor o igual 5");
        }
        
        if(a<5){
           System.out.println("es menor a 5");  
        }else if(a==5){
            System.out.println("es igual 5");  
        }else if(a>=6){
            System.out.println("es igual o mayor a 6");  
        }else{
            System.out.println("es otra cosa"); 
        }                   
        
    }
    
    public void ciclos(){
        //mientras
        int a = 5;
        while(a<=10){
            System.out.println(a);
            //a=a+1;
            a++;
        }
        
        //para
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        
        //do while
        int b=5;
        do{
            System.out.println("hola");
        }while(b>5 );
    }
    public void expreciones(){
        //aritmeticas
        int a=1;
        a=a*a/a;
        a= a+a-a;
        //relacion
        boolean c;
        c= 5>4; //true
        c= 3<2; //false
        c= 3>=3; //true
        c= 3<=3; //true
        c= 3!=3; //false
        //logicas
        
        c = 5>=5 && 3>=3; // and y  = true
        c= 5>5 || 3>=3; // or o = true
        c = !c; // not  no
    }
    public void envolvente(){
        //primitivos
        int a=5;
        double b= 5.5;
        float c= 5.5f;
        boolean d= true;
        long f= 4;
        char g= 'a';
        //tipo objeto o envolvente
        Integer a1=5;
        Double b1=5.5;
        Float c1=5.5f;
        Boolean d1= true;
        Long f1= 4l;
        Character g1= 'a';
        String h1= "hola";       
       
    }
    
}
