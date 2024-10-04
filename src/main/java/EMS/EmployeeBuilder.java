/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMS;

/**
 * Interface defining the methods for building an Employee object.
 * It follows the Builder design pattern.
 */
public interface EmployeeBuilder {
    
    /**
     * Sets the employee ID.
     *
     * @param id the employee ID
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setId(int id);

    /**
     * Sets the employee name.
     *
     * @param name the employee name
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setName(String name);

    /**
     * Sets the employee department.
     *
     * @param department the employee department
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setDepartment(String department);

    /**
     * Sets the employee role.
     *
     * @param role the employee role
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setRole(String role);

    /**
     * Sets the employee's working hours per week.
     *
     * @param hours the employee working hours
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setHours(int hours);

    /**
     * Sets the employee's salary.
     *
     * @param salary the employee salary
     * @return the EmployeeBuilder instance
     */
    EmployeeBuilder setSalary(double salary);

    /**
     * Builds the Employee object.
     *
     * @return the constructed Employee object
     */
    Employee build();
}