package EMS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Abstract class representing an Employee in the EMS.
 * It contains common attributes and abstract methods for different types of employees.
 */
public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private String role;
    private int hours; // working hours per week
    private double salary;

    /**
     * Constructor to initialize an employee object.
     *
     * @param id the employee ID
     * @param name the employee name
     * @param department the department the employee works in
     * @param role the employee's role
     * @param hours the working hours per week
     * @param salary the employee's salary
     */
    public Employee(int id, String name, String department, String role, int hours, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.hours = hours;
        this.salary = salary;
    }

    // Getters and Setters with Javadoc comments
    /**
     * Gets the employee ID.
     *
     * @return the employee ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the employee name.
     *
     * @return the employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the department the employee works in.
     *
     * @return the employee department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Gets the employee's role.
     *
     * @return the employee role
     */
    public String getRole() {
        return role;
    }

    /**
     * Gets the employee's working hours per week.
     *
     * @return the employee working hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Gets the employee's salary.
     *
     * @return the employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee ID.
     *
     * @param id the new employee ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the employee name.
     *
     * @param name the new employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the department the employee works in.
     *
     * @param department the new employee department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Sets the employee's role.
     *
     * @param role the new employee role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Sets the employee's working hours per week.
     *
     * @param hours the new employee working hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Sets the employee's salary.
     *
     * @param salary the new employee salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Abstract method to clock in the employee. Each type of employee must implement this method.
     */
    public abstract void clockIn();
    
    /**
     * Abstract method to clock out the employee. Each type of employee must implement this method.
     */
    public abstract void clockOut();
    
    /**
     * Abstract method to track work hours for the employee. Each type of employee must implement this method.
     */
    public abstract void trackWorkHours();
}