/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMS;

/**
 * Factory class for creating Employee objects.
 */
public class EmployeeFactory {

    /**
     * Creates an Employee object based on the type.
     *
     * @param type the type of employee ("FullTime" or "PartTime")
     * @return the created Employee object
     */
    public Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("FullTime")) {
            return new FullTimeEmployee(1, "Wu", "IT", "Software Engineer", 30, 20000);
        } else if (type.equalsIgnoreCase("PartTime")) {
            return new PartTimeEmployee(2, "Alex", "HR", "HR Specialist", 20, 25000);
        }
        return null;
    }
}
