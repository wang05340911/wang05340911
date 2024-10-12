/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SummerEntree} class represents the entree items available
 * on the Summer restaurant menu. It implements the {@code Entree} interface
 * and provides a specific list of entree options for the Summer season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Summer entrees.
 * 
 * @author gouraya
 */
public class SummerEntree implements Entree {

    /**
     * Returns a string representation of the Summer entree items.
     * 
     * @return a string description of the entrees on the Summer menu, which include
     * "Avocado scramble", "Little Gem Salad", and "Miso Cauliflower Soup".
     */
    @Override
    public String toString(){
        return "Avocado scramble\nLittle Gem Salad\nMiso Cauliflower Soup";
    }
    
}
