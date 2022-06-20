/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String n) {
        super(n);

    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void establecerPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas
                    + lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas/lista.size();
    }

    public ArrayList<Estudiante> obtenerListaEstudiantes() {
        return lista;
    }

    public void establecerListaEstudiantes(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String cadenaEstudiantes = String.format("%s\n", "Lista Estudiante");
        for (int i = 0; i < lista.size(); i++) {
            cadenaEstudiantes = String.format("%s%s\n",
                    cadenaEstudiantes,
                    lista.get(i));

        }

        String cadena = String.format("\nCodigo: %s \n"
                + "%s"
                + "El promedio de matriculas es: %.2f\n",
                codigo,
                cadenaEstudiantes,
                obtenerPromedioMatriculas());
        return cadena;

    }

}
