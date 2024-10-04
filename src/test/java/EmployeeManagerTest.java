/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import EMS.Employee;
import EMS.EmployeeManager;
import EMS.FullTimeEmployee;
import EMS.PartTimeEmployee;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;
    private Employee employee1;
    private Employee employee2;

    @BeforeEach
    public void setUp() {
        employeeManager = EmployeeManager.getInstance();
        employee1 = new FullTimeEmployee(1, "Wu", "IT", "Software Engineer", 30, 20000);
        employee2 = new PartTimeEmployee(2, "Alex", "HR", "HR Specialist", 20, 25000);
    }

    @Test
    public void testAddEmployee() {
        employeeManager.addEmployee(employee1);
        Employee retrievedEmployee = employeeManager.getEmployeeById(1);
        assertNotNull(retrievedEmployee);
        assertEquals(employee1, retrievedEmployee);
    }

    @Test
    public void testRemoveEmployee() {
        employeeManager.addEmployee(employee2);
        employeeManager.removeEmployee(employee2);
        Employee retrievedEmployee = employeeManager.getEmployeeById(2);
        assertNull(retrievedEmployee);
    }

    @Test
    public void testGetEmployeeById() {
        employeeManager.addEmployee(employee1);
        Employee retrievedEmployee = employeeManager.getEmployeeById(1);
        assertEquals("Wu", retrievedEmployee.getName());
    }
}