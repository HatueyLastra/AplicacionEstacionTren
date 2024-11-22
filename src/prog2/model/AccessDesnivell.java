/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public abstract class AccessDesnivell extends Acces {
    private float desnivell;

    public AccessDesnivell(String nom, boolean accessibilitat, float desnivell) {
        super(nom, accessibilitat);
        this.desnivell = desnivell;
    }

    public float getDesnivell() {
        return desnivell;
    }

    public void setDesnivell(float desnivell) {
        this.desnivell = desnivell;
    }
    
}
