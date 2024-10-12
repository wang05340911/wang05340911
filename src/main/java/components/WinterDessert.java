/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code WinterDessert} class represents the dessert items available
 * on the Winter restaurant menu. It implements the {@code Dessert} interface
 * and provides a specific list of dessert options for the Winter season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Winter desserts.
 * 
 * @author gouraya
 */
public class WinterDessert implements Dessert {

    /**
     * Returns a string representation of the Winter dessert items.
     * 
     * @return a string description of the desserts on the Winter menu, which include
     * "Chocolate Mousse", "Charamel Cheesecake", and "Chocolate Sponge Cake".
     */
    @Override
    public String toString() {
        return "Chocolate Mousse\nCharamel Cheesecake\nChocolate Sponge Cake";
    } 
 
}