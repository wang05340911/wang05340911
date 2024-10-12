/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SpringDessert} class represents the dessert items available
 * on the Spring restaurant menu. It implements the {@code Dessert} interface
 * and provides a specific list of dessert options for the Spring season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Spring desserts.
 * 
 * @author gouraya
 */
public class SpringDessert implements Dessert {

    /**
     * Returns a string representation of the Spring dessert items.
     * 
     * @return a string description of the desserts on the Spring menu, which include
     * "Vanilla Crème Brûlée", "White Chocolate Brownie", and "Passion Fruit Fig Tart".
     */
    @Override
    public String toString(){
        return "Vanilla Crème Brûlée\nWhite Chocolate Brownie\nPassion Fruit Fig Tart";
    }
    
}