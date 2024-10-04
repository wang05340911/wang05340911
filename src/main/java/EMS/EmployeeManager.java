/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMS;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that manages Employee objects within the system.
 * 
 * @author han
 */
public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;
    
    /**
     * Private constructor to prevent direct instantiation.
     * Initializes the employee list.
     */
    private EmployeeManager(){
        employees = new ArrayList<>();
    }
    
    /**
     * Retrieves the single instance of EmployeeManager (Singleton pattern).
     * 
     * @return the EmployeeManager instance
     */
    public static EmployeeManager getInstance(){
        if (instance == null){
            instance = new EmployeeManager();
        }
        return instance;
    }
    /**
     * Adds an employee to the management system.
     * 
     * @param employee the Employee object to add
     */
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    /**
     * Removes an employee from the management system.
     * 
     * @param employee employee the Employee object to remove
     */
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    
    /**
     * Retrieves an employee by their ID.
     * 
     * @param id the employee ID
     * @return the Employee object, or null if not found
     */
    public Employee getEmployeeById(int id){
        for (Employee employee : employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    
}
