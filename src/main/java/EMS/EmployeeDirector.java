/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMS;

/**
 * Director class that uses the EmployeeBuilder to construct an Employee object.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructor to initialize the EmployeeDirector with a specific builder.
     *
     * @param builder the EmployeeBuilder instance
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs an Employee using the builder.
     *
     * @param name the employee name
     * @param department the employee department
     * @param role the employee role
     * @param hours the working hours per week
     * @param salary the employee salary
     * @return the constructed Employee object
     */
    public Employee construct(String name, String department, String role, int hours, double salary) {
        return builder
                .setName(name)
                .setDepartment(department)
                .setRole(role)
                .setHours(hours)
                .setSalary(salary)
                .build();
    }
}
