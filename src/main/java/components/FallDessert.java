/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code FallDessert} class represents the dessert items available
 * on the Fall restaurant menu. It implements the {@code Dessert} interface
 * and provides a specific list of dessert options for the Fall season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Fall desserts.
 * 
 * @author gouraya
 */
public class FallDessert implements Dessert {

    /**
     * Returns a string representation of the Fall dessert items.
     * 
     * @return a string description of the desserts on the Fall menu, which include
     * "Carrot Cake", "White Chocolate Cheesecake", and "Apple Pie".
     */
    @Override
    public String toString(){
        return "Carrot Cake\nWhite Chocolate Cheesecake\nApple Pie";
    }
    
}