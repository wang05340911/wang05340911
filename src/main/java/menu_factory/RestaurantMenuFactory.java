

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * The {@code RestaurantMenuFactory} interface defines the methods required for 
 * creating the components of a restaurant menu: drink, main course, entree, and dessert.
 * 
 * Implementations of this interface are responsible for creating the specific 
 * menu items for a given season or theme.
 * 
 * @author gouraya
 */
public interface RestaurantMenuFactory {

    /**
     * Creates and returns a {@code Drink} object representing the drink options for the menu.
     * 
     * @return a {@code Drink} object for the menu
     */
    public Drink createDrink();

    /**
     * Creates and returns a {@code MainCourse} object representing the main course options for the menu.
     * 
     * @return a {@code MainCourse} object for the menu
     */
    public MainCourse createMainCourse();

    /**
     * Creates and returns an {@code Entree} object representing the entree options for the menu.
     * 
     * @return an {@code Entree} object for the menu
     */
    public Entree createEntree();

    /**
     * Creates and returns a {@code Dessert} object representing the dessert options for the menu.
     * 
     * @return a {@code Dessert} object for the menu
     */
    public Dessert createDessert();
    
}