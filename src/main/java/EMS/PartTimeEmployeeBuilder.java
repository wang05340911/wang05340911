package EMS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Concrete builder for creating a PartTimeEmployee object.
 * 
 * @author han
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder{
    private Employee employee;
    
    /**
     * Constructor to initialize a PartTimeEmployeeBuilder with default values.
     */
    public PartTimeEmployeeBuilder(){
        this.employee = new PartTimeEmployee(2, "Alex", "HR", "HR Specialist", 20, 25000);
    }

    @Override
    public EmployeeBuilder setId(int id) {
        return this; 
    }

    @Override
    public EmployeeBuilder setName(String name) {
        return this; 
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        return this; 
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        return this; 
    }

    @Override
    public EmployeeBuilder setHours(int hours) {
        return this; 
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        return this; 
    }

    @Override
    public Employee build() {
        return this.employee; 
    }
    
}
