/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * The {@code RestaurantMenu} class is an abstract base class that represents
 * a seasonal restaurant menu. Each specific seasonal menu (e.g., Fall, Winter)
 * will extend this class and implement the {@code populateMenu()} method.
 * The menu consists of four components: entree, main course, dessert, and drink.
 * 
 * The class provides methods to set and retrieve the name of the menu and the
 * period during which the menu is active. It also provides a {@code toString()} 
 * method that returns a formatted string representation of the menu contents.
 * 
 * @author gouraya
 */
public abstract class RestaurantMenu {

    // The name of the menu (e.g., "Fall Menu")
    private String name;

    // The period during which the menu is available (e.g., "September 1 to November 30")
    private String period;

    // Menu components
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    /**
     * Gets the name of the menu.
     * 
     * @return the name of the menu
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the menu.
     * 
     * @param name the name to be assigned to the menu
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the active period of the menu.
     * 
     * @return the period during which the menu is available
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * Sets the period during which the menu is active.
     * 
     * @param period the period to be assigned to the menu
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Populates the menu with specific items for the entree, main course, 
     * dessert, and drink. This method must be implemented by each subclass
     * to provide the specific menu items.
     */
    public abstract void populateMenu();

    /**
     * Returns a string representation of the menu, including the name, period,
     * and the available items in the entree, main course, dessert, and drink categories.
     * If a category is not available, a default message is displayed.
     * 
     * @return a formatted string representing the contents of the menu
     */
    @Override
    public String toString() {
        return "\nThe " + name + "\nActive: " + period
                + "\n\nEntrees:\n" + (entree != null ? entree.toString() : "No Entree available") + "\n" +
                "\nMain Courses:\n" + (mainCourse != null ? mainCourse.toString() : "No Main Course available") + "\n" +
                "\nDesserts:\n" + (dessert != null ? dessert.toString() : "No Dessert available") + "\n" +
                "\nDrinks:\n" + (drink != null ? drink.toString() : "No Drink available");
    }
}