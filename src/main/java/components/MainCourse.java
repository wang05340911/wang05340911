/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code MainCourse} interface represents a main course item in a restaurant menu.
 * Classes that implement this interface should define the characteristics of 
 * specific main course items. The {@code toString()} method is used to provide 
 * a string representation of the main course item.
 * 
 * Implementing classes are expected to override the {@code toString()} method
 * to return a human-readable description of the main course.
 * 
 * @author gouraya
 */
public interface MainCourse {

    /**
     * Returns a string representation of the main course item. This string should
     * describe the main course in a human-readable format, suitable for inclusion
     * in a menu.
     * 
     * @return a string description of the main course item
     */
    @Override
    public String toString();  
}