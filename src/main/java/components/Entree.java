/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code Entree} interface represents an entree item in a restaurant menu.
 * Classes that implement this interface should define the characteristics of 
 * specific entree items. The {@code toString()} method is used to provide a 
 * string representation of the entree item.
 * 
 * Implementing classes are expected to override the {@code toString()} method
 * to return a human-readable description of the entree.
 * 
 * @author gouraya
 */
public interface Entree {

    /**
     * Returns a string representation of the entree item. This string should
     * describe the entree in a human-readable format, suitable for inclusion
     * in a menu.
     * 
     * @return a string description of the entree item
     */
    @Override
    public String toString();
    
}