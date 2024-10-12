/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 * The {@code WinterMainCourse} class represents the main course items available
 * on the Winter restaurant menu. It implements the {@code MainCourse} interface
 * and provides a specific list of main course options for the Winter season.
 * 
 * This class overrides the {@code toString()} method to return a description
 * of the available Winter main courses.
 * 
 * @author gouraya
 */
public class WinterMainCourse implements MainCourse {

    /**
     * Returns a string representation of the Winter main course items.
     * 
     * @return a string description of the main courses on the Winter menu, which include
     * "Sirloin", "Salmon Croquettes", and "Steak and Fries".
     */
    @Override
    public String toString(){
        return "Sirloin\nSalmon Croquettes\nSteak and Fries";
    }
 
}