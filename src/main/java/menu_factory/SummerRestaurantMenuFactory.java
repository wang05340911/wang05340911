/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SummerDessert;
import components.SummerDrink;
import components.SummerEntree;
import components.SummerMainCourse;

/**
 * The {@code SummerRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory}
 * interface and is responsible for creating the specific Summer menu items.
 * This class creates Summer-themed entrees, main courses, desserts, and drinks for the restaurant menu.
 * 
 * @author gouraya
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates and returns a {@code SummerDrink} object, representing the Summer drink options.
     * 
     * @return a new {@code SummerDrink} object
     */
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }

    /**
     * Creates and returns a {@code SummerMainCourse} object, representing the Summer main course options.
     * 
     * @return a new {@code SummerMainCourse} object
     */
    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse();
    }

    /**
     * Creates and returns a {@code SummerEntree} object, representing the Summer entree options.
     * 
     * @return a new {@code SummerEntree} object
     */
    @Override    
    public Entree createEntree() {
        return new SummerEntree();
    }

    /**
     * Creates and returns a {@code SummerDessert} object, representing the Summer dessert options.
     * 
     * @return a new {@code SummerDessert} object
     */
    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
    
}