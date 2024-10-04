package EMS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Concrete builder for creating a FullTimeEmployee object.
 * 
 * @author han
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder{
    private Employee employee;
    
    /**
     * Constructor to initialize a FullTimeEmployeeBuilder with default values.
     */
    public FullTimeEmployeeBuilder(){
        this.employee = new FullTimeEmployee(1, "Shi", "IT", "Software Engineer", 30, 20000);
    }

    @Override
    public EmployeeBuilder setId(int id) {
        this.employee.setId(id);
        return this; 
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.employee.setName(name);
        return this; 
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.employee.setDepartment(department);
        return this; 
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.employee.setRole(role);
        return this; 
    }

    @Override
    public EmployeeBuilder setHours(int hours) {
        this.employee.setHours(hours);
        return this; 
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.employee.setSalary(salary);
        return this; 
    }

    @Override
    public Employee build() {
        return this.employee; 
    }
    
}