/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * The {@code SummerRestaurantMenu} class is a concrete implementation of the {@code RestaurantMenu} class.
 * It is responsible for creating and populating the Summer menu by using the {@code RestaurantMenuFactory}
 * to create the specific items such as entree, main course, dessert, and drink for the Summer season.
 * 
 * This class overrides the {@code populateMenu} method to generate the menu items for the Summer menu.
 * 
 * @author gouraya
 */
public class SummerRestaurantMenu extends RestaurantMenu {

    /**
     * A factory that produces the specific items for the Summer menu.
     */
    RestaurantMenuFactory theFactory;

    /**
     * Constructor that accepts a {@code RestaurantMenuFactory} to initialize the factory.
     * 
     * @param factory the factory that will be used to create the Summer menu items
     */
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    /**
     * Populates the Summer menu by creating and assigning the entree, main course, dessert, and drink
     * using the provided {@code RestaurantMenuFactory}.
     */
    @Override
    public void populateMenu() {
        System.out.println("\nAdding items to " + getName());
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
    }
}