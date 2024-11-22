/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class Ascensor extends AccessDesnivell {
    private float pesMaximCarga;

    public Ascensor(float pesMaximCarga, float desnivell, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, desnivell);
        this.pesMaximCarga = pesMaximCarga;
    }

    public float getPesMaximCarga() {
        return pesMaximCarga;
    }

    public void setPesMaximCarga(float pesMaximCarga) {
        this.pesMaximCarga = pesMaximCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " - Ascensor{" +
                "pesMaximCarga=" + pesMaximCarga +
                '}';
    }
}