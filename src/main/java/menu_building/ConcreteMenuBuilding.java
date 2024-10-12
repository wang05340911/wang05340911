/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;

import menu_factory.*;
import menus.*;

/**
 * The {@code ConcreteMenuBuilding} class is a concrete implementation of the {@code MenuBuilding}
 * abstract class. It is responsible for creating different seasonal menus (Fall, Winter, Spring, Summer)
 * using the appropriate {@code RestaurantMenuFactory} for each season.
 * 
 * This class overrides the {@code makeMenuBuilding} method to generate the appropriate menu
 * for the specified season, based on the provided input.
 * 
 * @author gouraya
 */
public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * Creates and returns the appropriate {@code RestaurantMenu} based on the specified season.
     * The menu is created using the corresponding {@code RestaurantMenuFactory} for each season.
     * 
     * @param season the name of the season for which the menu is being created (e.g., "Fall", "Winter")
     * @return the created {@code RestaurantMenu} for the specified season
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        
        if ("Fall".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        }
        else if ("Winter".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu"); 
            theMenu.setPeriod("December 1 to February 28.");
        }
        else if ("Spring".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 30.");
        }
        else if ("Summer".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        
        return theMenu;
    }

}