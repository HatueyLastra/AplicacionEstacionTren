/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

import java.util.ArrayList;

public abstract class Acces implements InAcces {
    protected String nom;
    protected boolean accessibilitat;
    protected boolean estat;
    protected ArrayList<Via> vias;

    public Acces(String nom, boolean accessibilitat) {
        this.nom = nom;
        this.accessibilitat = accessibilitat; 
        this.estat = true; // Por defecto, el acceso está abierto
        this.vias = new ArrayList<>();
    }

    @Override
    public void afegirVia(Via via) {
        vias.add(via);
    }

    @Override
    public void tancarAcces() {
        estat = false;
    }

    @Override
    public void obrirAcces() {
        estat = true;
    }

    @Override
    public boolean isAccessibilitat(){
        return accessibilitat; 
    }

    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public ArrayList<Via> getVias() {
        return vias;
    }

    public void setVias(ArrayList<Via> vias) {
        this.vias = vias;
    }

    @Override
    public String toString() {
        return "Acces{" +
                "nom='" + nom + '\'' +
                ", estat=" + estat +
                ", vias=" + vias +
                '}';
    }
}