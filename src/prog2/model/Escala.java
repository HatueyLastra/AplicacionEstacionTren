/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class Escala extends AccessDesnivell {

    public Escala(float desnivell, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, desnivell); 
    }
    
    @Override
    public String toString() {
        return "Escala{" +
                "nom='" + getNom() + '\'' +
                ", accessibilitat=" + isAccessibilitat() +
                ", desnivell=" + getDesnivell() +
                '}';
    }
}

