/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.WinterDessert;
import components.WinterDrink;
import components.WinterEntree;
import components.WinterMainCourse;

/**
 * The {@code WinterRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory}
 * interface and is responsible for creating the specific Winter menu items.
 * This class creates Winter-themed entrees, main courses, desserts, and drinks for the restaurant menu.
 * 
 * @author gouraya
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates and returns a {@code WinterDrink} object, representing the Winter drink options.
     * 
     * @return a new {@code WinterDrink} object
     */
    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }

    /**
     * Creates and returns a {@code WinterMainCourse} object, representing the Winter main course options.
     * 
     * @return a new {@code WinterMainCourse} object
     */
    @Override
    public MainCourse createMainCourse() {
        return new WinterMainCourse();
    }

    /**
     * Creates and returns a {@code WinterEntree} object, representing the Winter entree options.
     * 
     * @return a new {@code WinterEntree} object
     */
    @Override    
    public Entree createEntree() {
        return new WinterEntree();
    }

    /**
     * Creates and returns a {@code WinterDessert} object, representing the Winter dessert options.
     * 
     * @return a new {@code WinterDessert} object
     */
    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }   
    
}