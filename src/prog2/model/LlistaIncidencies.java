/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import prog2.vista.ExcepcioEstacio;
import prog2.model.Incidencia.TipusIncidencia; 
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Javier Rivera Romeu
 */

public class LlistaIncidencies implements InLlistaIncidencies {
    private ArrayList<Incidencia> incidencies;

    public LlistaIncidencies() {
        this.incidencies = new ArrayList<>();
    }

    @Override
    public void afegirIncidencia(int num, String tipus, Via via, String data) throws ExcepcioEstacio {
        // Comprobar si la vía ya tiene una incidencia
        Iterator<Incidencia> iterator = incidencies.iterator();
        while (iterator.hasNext()) {
            Incidencia inc = iterator.next();
            if (inc.getVia_().equals(via)) {
                throw new ExcepcioEstacio("La via ja té una incidència.");
            }
        }

        // Crear la incidencia y añadirla a la lista (hay que importar TipusIncidencia) 
        Incidencia incidencia = new Incidencia(num, TipusIncidencia.valueOf(tipus), via, data);
        incidencies.add(incidencia);

        // Cerrar la vía correspondiente
        via.tancarVia(incidencia);
    }

    @Override
    public void eliminarIncidencia(Incidencia in) throws ExcepcioEstacio {
        // Eliminar la incidencia de la lista
        Iterator<Incidencia> iterator = incidencies.iterator();
        while (iterator.hasNext()) {
            Incidencia inc = iterator.next();
            if (inc.equals(in)) {
                iterator.remove();
                break;
            }
        }

        // Abrir la vía correspondiente
        in.getVia_().obrirVia();
    }

    @Override
    public String llistarIncidencies() throws ExcepcioEstacio {
        if (incidencies.isEmpty()) {
            throw new ExcepcioEstacio("No hi ha cap incidència.");
        }

        String result = ""; 
        Iterator<Incidencia> iterator = incidencies.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().toString() + "\n";
        }
        return result; 
    }

    @Override
    public Incidencia getIncidencia(int num) throws ExcepcioEstacio {
        Iterator<Incidencia> iterator = incidencies.iterator();
        while (iterator.hasNext()) {
            Incidencia inc = iterator.next();
            if (inc.getNum_() == num) {
                return inc;
            }
        }
        throw new ExcepcioEstacio("No s'ha trobat cap incidència amb el número proporcionat.");
    }
}
