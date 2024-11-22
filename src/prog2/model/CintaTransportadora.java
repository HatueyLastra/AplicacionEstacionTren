/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class CintaTransportadora extends AccessNivell {
    private float velocitat;
    private float metresLongitud;

    public CintaTransportadora(float velocitat, float metresLongitud, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, metresLongitud);
        this.velocitat = velocitat;
    }
    
    public float getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(float velocitat) {
        this.velocitat = velocitat;
    }

    @Override
    public String toString() {
        return super.toString() + " - CintaTransportadora{" +
                "velocitat=" + velocitat +
                ", metresLongitud=" + metresLongitud +
                '}';
    }
}
