/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SpringEntree} class represents the entree items available
 * on the Spring restaurant menu. It implements the {@code Entree} interface
 * and provides a specific list of entree options for the Spring season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Spring entrees.
 * 
 * @author gouraya
 */
public class SpringEntree implements Entree {

    /**
     * Returns a string representation of the Spring entree items.
     * 
     * @return a string description of the entrees on the Spring menu, which include
     * "Sunny Rise Burger", "California Spring Salad", and "Crispy Chicken Sandwich".
     */
    @Override
    public String toString(){
        return "Sunny Rise Burger\nCalifornia Spring Salad\nCrispy Chicken Sandwich";
    }
    
}
