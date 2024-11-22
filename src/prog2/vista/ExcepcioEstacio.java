/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.vista;

/**
 *
 * @author Javier Rivera Romeu
 */

public class ExcepcioEstacio extends Exception{
    
    public ExcepcioEstacio(){
        super(); 
    }
    
    public ExcepcioEstacio(String mensatje){
        super(mensatje); 
    }
}
