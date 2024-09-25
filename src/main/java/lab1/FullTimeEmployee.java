/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 * Represents a full-time employee.
 * 
 * @author han
 */
public class FullTimeEmployee extends Employee  {
    
    /**
     * Constructor to initialize a full-time employee.
     * 
     * @param id the employee ID
     * @param name the employee name
     * @param department the employee department
     * @param role the employee role
     * @param hours the working hours per week
     * @param salary the employee salary
     */
    public FullTimeEmployee(int id, String name, String department, String role, int hours, double salary) {
        super(id, name, department, role, hours, salary);
    }

    @Override
    public void clockIn() {
        System.out.println("Full-time employee " + getName() + " has clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Full-time employee " + getName() + " has clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking work hours for full-time employee " + getName() + ".");
    }
    
}
