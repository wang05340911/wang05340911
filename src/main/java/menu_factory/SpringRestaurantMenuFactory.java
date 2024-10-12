/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SpringDessert;
import components.SpringDrink;
import components.SpringEntree;
import components.SpringMainCourse;

/**
 * The {@code SpringRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory}
 * interface and is responsible for creating the specific Spring menu items.
 * This class creates Spring-themed entrees, main courses, desserts, and drinks for the restaurant menu.
 * 
 * @author gouraya
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates and returns a {@code SpringDrink} object, representing the Spring drink options.
     * 
     * @return a new {@code SpringDrink} object
     */
    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }

    /**
     * Creates and returns a {@code SpringMainCourse} object, representing the Spring main course options.
     * 
     * @return a new {@code SpringMainCourse} object
     */
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    /**
     * Creates and returns a {@code SpringEntree} object, representing the Spring entree options.
     * 
     * @return a new {@code SpringEntree} object
     */
    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    /**
     * Creates and returns a {@code SpringDessert} object, representing the Spring dessert options.
     * 
     * @return a new {@code SpringDessert} object
     */
    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    } 
}