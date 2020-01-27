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
public class ManejoDeCadenas {

    public String borrarCorreos(String texto) {
        while (texto.indexOf("@") != -1) {
            int p1 = texto.indexOf("@"); //27
            int p2 = texto.indexOf(" ", p1);//39
            int p3 = texto.lastIndexOf(" ", p1);//22
            String correo = texto.substring(p3 + 1, p2);
            texto = texto.replace(correo, "****");
        }
        return texto;
    }
    
    public String generarCURP(String nombre, String paterno,
                                String materno,
                                String fechaNacimiento,
                                String estado, String sexo){
        return "";
    }
}
