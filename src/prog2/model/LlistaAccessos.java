/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import java.util.ArrayList;
import java.util.Iterator;
import prog2.vista.ExcepcioEstacio; 

/**
 *
 * @author Javier Rivera Romeu
 */

public abstract class LlistaAccessos implements InLlistaAccessos {
    private ArrayList<Acces> accessos;

    public LlistaAccessos() {
        this.accessos = new ArrayList<>();
    }

    @Override
    public void afegirAcces(Acces acc) throws ExcepcioEstacio {
        if (!accessos.contains(acc)) {
            accessos.add(acc);
        } else {
            throw new ExcepcioEstacio("L'acces ja existeix!");
        }
    }

    @Override
    public void buidar() {
        accessos.clear();
    }

    @Override
    public String llistarAccessos(boolean estat) throws ExcepcioEstacio {
        String result = ""; 
        boolean accessosPresentes = false;

        Iterator<Acces> iterator = accessos.iterator(); 
        while(iterator.hasNext()) {
            Acces acces = iterator.next(); 
            if (acces.isEstat() == estat) {
                accessosPresentes = true;
                result += acces.toString() + "\n";
            }
        }

        if (!accessosPresentes) {
            throw new ExcepcioEstacio("No hi ha accessos en l'estat indicat.");
        }

        return result;
    }

    @Override
    public void actualitzaEstatAccessos() throws ExcepcioEstacio {
        Iterator<Acces> accesIterator = accessos.iterator();
        while (accesIterator.hasNext()) {
            Acces acc = accesIterator.next();
            ArrayList<Via> viasList = acc.getVias();
            Iterator<Via> viaIterator = viasList.iterator();
            boolean algunaViaOberta = false; // Bandera para verificar si hay alguna vía abierta
            while (viaIterator.hasNext()) {
                Via via = viaIterator.next();
                if (via.isEstaOberta()) { // Si hay alguna vía abierta, marcamos la bandera y salimos del bucle
                    algunaViaOberta = true;
                    break;
                }
            }
            // Establecer el estado del acceso según si hay alguna vía abierta
            acc.setEstat(algunaViaOberta);
    }
}

    @Override
    public int calculaAccessosAccessibles() throws ExcepcioEstacio {
        int count = 0;
        Iterator<Acces> iterator = accessos.iterator();
        while (iterator.hasNext()) {
            Acces acc = iterator.next();
            if (acc.isAccessibilitat()) {
                count++;
            }
        }
        
        return count;
    }

    @Override
    public float calculaLongitudAccessosNivell() throws ExcepcioEstacio {
        float longitudTotal = 0.0f;
        Iterator<Acces> iterator = accessos.iterator();
        while (iterator.hasNext()) {
            Acces acc = iterator.next();
            if (acc instanceof AccessNivell) {
                longitudTotal += ((AccessNivell) acc).getNivell();
            }
        }
        return longitudTotal;
}
    // Metodo "extra" para poderlo utilizar en EstacioTren. 
    public Iterator<Acces> getAccesIterator() {
        return accessos.iterator();
    }
}
