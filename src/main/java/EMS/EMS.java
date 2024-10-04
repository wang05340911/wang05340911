/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EMS;

/**
 * This class represents the Employee Management System.
 * It serves as the entry point to the application.
 * 
 * @author han
 */
public class EMS{

    /**
     * The main method to run the EMS application.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();
        
        // Using Factory to create employees
        EmployeeFactory factory = new EmployeeFactory();
        Employee fullTimeEmployee = factory.createEmployee("FullTime");
        Employee partTimeEmployee = factory.createEmployee("PartTime");
        
        // Using Builder to construct an employee
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee constructedEmployee = director.construct("Han", "Doctor", "Manager", 40, 1000.5);
        
        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);
        manager.addEmployee(constructedEmployee);
    }
    
}
