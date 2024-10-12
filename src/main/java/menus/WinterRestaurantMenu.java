/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import components.Dessert;
import components.Drink;
import components.Entree;
import components.MainCourse;
import menu_factory.RestaurantMenuFactory;

/**
 *
 * @author gouraya
 */
public class WinterRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
        
        System.out.println("\nAdding items to " + getName());
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
    }
    
}
