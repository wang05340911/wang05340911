/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import lab1.Employee;
import lab1.EmployeeBuilder;
import lab1.EmployeeDirector;
import lab1.FullTimeEmployeeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author han
 */
public class EmployeeDirectorTest {
    
    private EmployeeDirector director;
    private EmployeeBuilder builder;
    
    @BeforeEach
    public void setUp() {
        builder = new FullTimeEmployeeBuilder();
        director = new EmployeeDirector(builder);
    }

    @Test
    public void testConstructFullTimeEmployee() {
        Employee employee = director.construct("Wu", "IT", "Software Engineer", 40, 100000);
        assertNotNull(employee);
        assertEquals("Wu", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Software Engineer", employee.getRole());
        assertEquals(40, employee.getHours());
        assertEquals(100000, employee.getSalary(), 0.01);
    }
    
}
