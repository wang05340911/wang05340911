/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SummerDrink} class represents the drink items available
 * on the Summer restaurant menu. It implements the {@code Drink} interface
 * and provides a specific list of drink options for the Summer season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Summer drinks.
 * 
 * @author gouraya
 */
public class SummerDrink implements Drink {

    /**
     * Returns a string representation of the Summer drink items.
     * 
     * @return a string description of the drinks on the Summer menu, which include
     * "Lemonade", "Sangria", and "Rum Punch".
     */
    @Override
    public String toString() {
        return "Lemonade\nSangria\nRum Punch";
    }
 
}