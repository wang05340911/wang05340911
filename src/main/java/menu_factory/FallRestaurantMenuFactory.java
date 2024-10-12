/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.FallDessert;
import components.FallDrink;
import components.FallEntree;
import components.FallMainCourse;

/**
 * The {@code FallRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory}
 * interface and is responsible for creating the specific Fall menu items.
 * This class creates Fall-themed entrees, main courses, desserts, and drinks for the restaurant menu.
 * 
 * @author gouraya
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates and returns a {@code FallDrink} object, representing the Fall drink options.
     * 
     * @return a new {@code FallDrink} object
     */
    @Override
    public Drink createDrink() {
        return new FallDrink();
    }

    /**
     * Creates and returns a {@code FallMainCourse} object, representing the Fall main course options.
     * 
     * @return a new {@code FallMainCourse} object
     */
    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    /**
     * Creates and returns a {@code FallEntree} object, representing the Fall entree options.
     * 
     * @return a new {@code FallEntree} object
     */
    @Override    
    public Entree createEntree() {
        return new FallEntree();
    }

    /**
     * Creates and returns a {@code FallDessert} object, representing the Fall dessert options.
     * 
     * @return a new {@code FallDessert} object
     */
    @Override    
    public Dessert createDessert() {
        return new FallDessert();
    }    
}