/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code SpringMainCourse} class represents the main course items available
 * on the Spring restaurant menu. It implements the {@code MainCourse} interface
 * and provides a specific list of main course options for the Spring season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Spring main courses.
 * 
 * @author gouraya
 */
public class SpringMainCourse implements MainCourse {

    /**
     * Returns a string representation of the Spring main course items.
     * 
     * @return a string description of the main courses on the Spring menu, which include
     * "Lobster Veracruzana", "Organic Ocean Halibut", and "Mushroom Soup".
     */
    @Override
    public String toString() {
        return "Lobster Veracruzana\nOrganic Ocean Halibut\nMushroom Soup";
    }
    
}
