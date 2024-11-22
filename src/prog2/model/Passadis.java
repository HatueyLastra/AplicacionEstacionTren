/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class Passadis extends AccessNivell {

    public Passadis(float longitud, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, longitud);
    }
    
    @Override
    public String toString() {
        return "Passadis{" +
                "nom='" + getNom() + '\'' +
                ", accessibilitat=" + isAccessibilitat() +
                ", longitud=" + getNivell() +
                '}';
    }
}

