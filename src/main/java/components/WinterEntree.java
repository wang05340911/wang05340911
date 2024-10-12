/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code WinterEntree} class represents the entree items available
 * on the Winter restaurant menu. It implements the {@code Entree} interface
 * and provides a specific list of entree options for the Winter season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Winter entrees.
 * 
 * @author gouraya
 */
public class WinterEntree implements Entree {

    /**
     * Returns a string representation of the Winter entree items.
     * 
     * @return a string description of the entrees on the Winter menu, which include
     * "Sesame Soy Tartare", "Boston Clam Chowder", and "Thai Soup".
     */
    @Override
    public String toString() {
        return "Sesame Soy Tartare\nBoston Clam Chowder\nThai Soup";
    }
    
}