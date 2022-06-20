/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
     
    
    public ReportePolicia(String n) {
        super(n);

    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void establecerPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades
                    + lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades/lista.size();
    }

    public ArrayList<Policia> obtenerListaPolicias() {
        return lista;
    }

    public void establecerListaPolicias(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String cadenaPolicias = String.format("%s\n", "Lista Policias");
        for (int i = 0; i < lista.size(); i++) {
            cadenaPolicias = String.format("%s%s\n",
                    cadenaPolicias,
                    lista.get(i));

        }

        String cadena = String.format("\nCodigo: %s \n"
                + "%s"
                + "El promedio de edades es: %.2f\n",
                codigo,
                cadenaPolicias,
                obtenerPromedioEdades());
        return cadena;
    }
}
