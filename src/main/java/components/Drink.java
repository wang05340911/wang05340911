/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code Drink} interface represents a drink item in a restaurant menu.
 * Classes that implement this interface should define the characteristics
 * of specific drink items. The {@code toString()} method is used to provide
 * a string representation of the drink.
 * 
 * @author gouraya
 */
public interface Drink {

    /**
     * Returns a string representation of the drink item. This string should
     * describe the drink in a human-readable format, suitable for inclusion
     * in a menu.
     * 
     * @return a string description of the drink item
     */
    @Override
    public String toString();
}