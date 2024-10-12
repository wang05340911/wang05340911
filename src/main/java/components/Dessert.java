/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package components;

/**
 * The {@code Dessert} interface represents a dessert item in a restaurant menu.
 * This interface is used to define the dessert component of a restaurant menu.
 * Classes implementing this interface must override the {@code toString()} method
 * to provide a meaningful representation of the dessert item.
 * 
 * @author gouraya
 */
public interface Dessert {

    /**
     * Returns a string representation of the dessert item. The string should
     * describe the dessert in a readable format, suitable for displaying
     * in a menu.
     * 
     * @return a string description of the dessert item
     */
    @Override
    public String toString();
}