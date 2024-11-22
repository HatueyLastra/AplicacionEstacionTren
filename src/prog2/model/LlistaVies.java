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

public class LlistaVies implements InLlistaVies {
    private ArrayList<Via> vies;

    public LlistaVies() {
        this.vies = new ArrayList<>();
    }

    @Override
    public void afegirVia(Via via) throws ExcepcioEstacio {
        if (!contains(via)) {
            vies.add(via);
        } else {
            throw new ExcepcioEstacio("La via ja existeix!");
        }
    }

    @Override
    public void buidar() {
        vies.clear();
    }

    @Override
    public String llistarVies(String estat) throws ExcepcioEstacio {
        // Convertir el estado de String a boolean
        boolean estatOberta = estat.equalsIgnoreCase("Oberta");

        String result = "";
        boolean viesPresentes = false;

        Iterator<Via> iterator = vies.iterator();
        while (iterator.hasNext()) {
            Via via = iterator.next();
            if (via.isEstaOberta() == estatOberta) {
                viesPresentes = true;
                result += via.toString() + "\n";
            }
        }

        if (!viesPresentes) {
            throw new ExcepcioEstacio("No hi ha vies en l'estat indicat.");
        }

        return result;
    }
    
    public String llistarVies() throws ExcepcioEstacio {
        String result = "";
        boolean viesPresentes = false;

        Iterator<Via> iterator = vies.iterator();
        while (iterator.hasNext()) {
            Via via = iterator.next();
            viesPresentes = true;
            result += via.toString() + "\n";
        }

        if (!viesPresentes) {
            throw new ExcepcioEstacio("No hi ha vies presents a la estació.");
        }

        return result;
    }

    @Override
    public boolean containsViesObertes() {
        Iterator<Via> iterator = vies.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isEstaOberta()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Via via) {
        return vies.contains(via);
    }

    @Override
    public Via getVia(String nom) throws ExcepcioEstacio {
        Iterator<Via> iterator = vies.iterator(); 
        while (iterator.hasNext()) {
            Via via = iterator.next(); 
            if (via.getNom().equals(nom)) {
                return via;
            }
        }
        throw new ExcepcioEstacio("No s'ha trobat cap via amb aquest nom.");
    }
}

