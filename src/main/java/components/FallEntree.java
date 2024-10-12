/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code FallEntree} class represents the entree items available
 * on the Fall restaurant menu. It implements the {@code Entree} interface
 * and provides a specific list of entree options for the Fall season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Fall entrees.
 * 
 * @author gouraya
 */
public class FallEntree implements Entree {

    /**
     * Returns a string representation of the Fall entree items.
     * 
     * @return a string description of the entrees on the Fall menu, which include
     * "Spinach and Artichoke Dip", "Sesame Soy Tuna Tartare", and "Tuscan Bruschetta".
     */
    @Override
    public String toString() {
        return "Spinach and Artichoke Dip\nSesame Soy Tuna Tartare\nTuscan Bruschetta";
    }
    
}