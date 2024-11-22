/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class Via implements InVia {
    private String nom;
    private String amplada;
    private int tunels;
    private boolean estaOberta; // Oberta o Tancada, estaOberta == true entonces esta oberta.
    private String iluminacio; // 100, 50 o 0

    // Constructor de via
    public Via(String nom, String amplada, int tunels, boolean estaOberta, String iluminacio) {
        this.nom = nom;
        this.amplada = amplada;
        this.tunels = tunels;
        this.estaOberta = estaOberta; 
        this.iluminacio = iluminacio; 
    }

    // Métodos setters y getters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAmpladaVia(String amplada) {
        this.amplada = amplada;
    }

    public void setTunels(int tunels) {
        this.tunels = tunels;
    }

    public void setEstaOberta(boolean estaOberta) {
        this.estaOberta = estaOberta;
    }

    public void setIluminacio(String iluminacio) {
        this.iluminacio = iluminacio;
    }

    public String getNom() {
        return nom;
    }

    public String getAmplada() {
        return amplada;
    }

    public int getTunels() {
        return tunels;
    }

    public boolean isEstaOberta() {
        return estaOberta;
    }

    public String getIluminacio() {
        return iluminacio;
    }

    @Override
    public String toString() {
        return "Via{" +
                "nom='" + nom + '\'' +
                ", amplada='" + amplada + '\'' +
                ", tunels=" + tunels +
                ", estaOberta=" + estaOberta +
                ", iluminacio=" + iluminacio +
                '}';
    }

    @Override
    public void tancarVia(Incidencia incidencia) {
        this.estaOberta = false;
        this.iluminacio = incidencia.getIluminacioVia();
    }

    @Override
    public void obrirVia() {
        estaOberta = true;
        iluminacio = "100%"; 
    }
}

