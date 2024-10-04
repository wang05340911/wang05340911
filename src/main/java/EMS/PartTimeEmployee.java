/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMS;

/**
 * Represents a part-time employee.
 * 
 * @author han
 */
public class PartTimeEmployee extends Employee {
    
    /**
     * Constructor to initialize a part-time employee.
     * 
     * @param id the employee ID
     * @param name the employee name
     * @param department the employee department
     * @param role the employee role
     * @param hours the working hours per week
     * @param salary the employee salary
     */
    public PartTimeEmployee(int id, String name, String department, String role, int hours, double salary) {
        super(id, name, department, role, hours, salary);
    }

    @Override
    public void clockIn() {
        System.out.println("Part-time employee " + getName() + " has clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Part-time employee " + getName() + " has clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking work hours for part-time employee " + getName() + ".");
    }
    
    
}
