/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SummerDessert} class represents the dessert items available
 * on the Summer restaurant menu. It implements the {@code Dessert} interface
 * and provides a specific list of dessert options for the Summer season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Summer desserts.
 * 
 * @author gouraya
 */
public class SummerDessert implements Dessert {

    /**
     * Returns a string representation of the Summer dessert items.
     * 
     * @return a string description of the desserts on the Summer menu, which include
     * "Lime Pie", "Ultimate Cookie", and "Churro Ice Cream Sandwich".
     */
    @Override
    public String toString(){
        return "Lime Pie\nUltimate Cookie\nChurro Ice Cream Sandwich";
    }
    
}