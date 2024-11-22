/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public abstract class AccessNivell extends Acces {
    private float nivell;

    public AccessNivell(String nom, boolean accessibilitat, float nivell) {
        super(nom, accessibilitat);
        this.nivell = nivell;
    }

    public float getNivell() {
        return nivell;
    }

    public void setNivell(float nivell) {
        this.nivell = nivell;
    }
}