/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SummerMainCourse} class represents the main course items available
 * on the Summer restaurant menu. It implements the {@code MainCourse} interface
 * and provides a specific list of main course options for the Summer season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Summer main courses.
 * 
 * @author gouraya
 */
public class SummerMainCourse implements MainCourse {

    /**
     * Returns a string representation of the Summer main course items.
     * 
     * @return a string description of the main courses on the Summer menu, which include
     * "Beef Tartare", "Spiced Cauliflower", and "Chinook Salmon".
     */
    @Override
    public String toString(){
        return "Beef Tartare\nSpiced Cauliflower\nChinook Salmon";
    }
   
}