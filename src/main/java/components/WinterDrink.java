/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code WinterDrink} class represents the drink items available
 * on the Winter restaurant menu. It implements the {@code Drink} interface
 * and provides a specific list of drink options for the Winter season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Winter drinks.
 * 
 * @author gouraya
 */
public class WinterDrink implements Drink {

    /**
     * Returns a string representation of the Winter drink items.
     * 
     * @return a string description of the drinks on the Winter menu, which include
     * "Mojito", "Alcohol Free Wine", and "Tequila".
     */
    @Override
    public String toString(){
        return "Mojito\nAlcohol Free Wine\nTequila";
    }
 
}