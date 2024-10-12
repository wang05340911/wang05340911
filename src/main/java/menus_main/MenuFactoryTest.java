/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus_main;

import menu_building.*;
import menus.*;

/**
 * The {@code MenuFactoryTest} class contains the main method to test the functionality 
 * of the restaurant menu building system. It creates menus for each season (Fall, Winter, 
 * Spring, and Summer) by using the {@code MenuBuilding} system to build and display 
 * the specific menus for each season.
 * 
 * The {@code main} method creates an instance of {@code ConcreteMenuBuilding}, 
 * builds the seasonal menus using the {@code buildRestaurantMenu} method, and then 
 * prints the resulting menus to the console.
 * 
 * @author gouraya
 */
public class MenuFactoryTest {

    /**
     * The main method to test the creation and display of seasonal restaurant menus.
     * It uses {@code ConcreteMenuBuilding} to create Fall, Winter, Spring, and Summer menus
     * and prints each menu to the console.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Create a menu building system
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        // Build and display the Fall menu
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        // Build and display the Winter menu
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);
        
        // Build and display the Spring menu
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);
         
        // Build and display the Summer menu
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
    }    
}