/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;

import menus.*;

/**
 * The {@code MenuBuilding} class is an abstract class responsible for defining
 * the process of building restaurant menus for different seasons. Subclasses
 * must implement the {@code makeMenuBuilding} method to create menus based
 * on the specified season.
 * 
 * This class provides a method to build and populate a menu by calling the 
 * factory method {@code makeMenuBuilding()} and the {@code populateMenu()} method.
 * 
 * @author gouraya
 */
public abstract class MenuBuilding {

    /**
     * Abstract method that must be implemented by subclasses to create a 
     * {@code RestaurantMenu} based on the specified season.
     * 
     * @param season the name of the season for which the menu is being created (e.g., "Fall", "Winter")
     * @return the created {@code RestaurantMenu} for the specified season
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Builds and returns a fully populated {@code RestaurantMenu} for the specified season.
     * This method uses the {@code makeMenuBuilding} method to create the menu and 
     * then calls {@code populateMenu()} to add the specific items.
     * 
     * @param season the name of the season for which the menu is being built (e.g., "Fall", "Winter")
     * @return the fully populated {@code RestaurantMenu}
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
    
}