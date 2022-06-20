/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;
   
     public Reporte(String n){
        codigo = n;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String n) {
        codigo = n;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s",getCodigo());
        return cadena; //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
