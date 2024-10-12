/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code FallMainCourse} class represents the main course items available
 * on the Fall restaurant menu. It implements the {@code MainCourse} interface
 * and provides a specific list of main course options for the Fall season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Fall main courses.
 * 
 * @author gouraya
 */
public class FallMainCourse implements MainCourse {

    /**
     * Returns a string representation of the Fall main course items.
     * 
     * @return a string description of the main courses on the Fall menu, which include
     * "Salmon Avocado Toast", "Pesto Chicken Penne Asiago", and 
     * "Portobell Mushroom Chicken".
     */
    @Override
    public String toString(){
        return "Salmon Avocado Toast\nPesto Chicken Penne Asiago\nPortobell Mushroom Chicken";
    }
   
}