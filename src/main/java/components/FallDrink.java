/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code FallDrink} class represents the drink items available
 * on the Fall restaurant menu. It implements the {@code Drink} interface
 * and provides a specific list of drink options for the Fall season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Fall drinks.
 * 
 * @author gouraya
 */
public class FallDrink implements Drink {

    /**
     * Returns a string representation of the Fall drink items.
     * 
     * @return a string description of the drinks on the Fall menu, which include
     * "Margarita", "Dark Rum", and "Orange Juice".
     */
    @Override
    public String toString() {
        return "Margarita\nDark Rum\nOrange Juice";
    }
    
}