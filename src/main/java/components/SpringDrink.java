/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SpringDrink} class represents the drink items available
 * on the Spring restaurant menu. It implements the {@code Drink} interface
 * and provides a specific list of drink options for the Spring season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Spring drinks.
 * 
 * @author gouraya
 */
public class SpringDrink implements Drink {

    /**
     * Returns a string representation of the Spring drink items.
     * 
     * @return a string description of the drinks on the Spring menu, which include
     * "Cucumber Smash", "Lime Juice", and "Candy Apple Cider".
     */
    @Override
    public String toString() {
        return "Cucumber Smash\nLime Juice\nCandy Apple Cider";
    }

}