/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Javier Rivera Romeu
 */

public class EscalaMecanica extends AccessDesnivell {
    private String marca;

    public EscalaMecanica(String marca, float desnivell, String nom, boolean accessibilitat) {
        super(nom, accessibilitat, desnivell);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " - EscalaMecanica{" +
                "marca='" + marca + '\'' +
                '}';
    }
}