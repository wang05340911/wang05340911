/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import lab1.Employee;
import lab1.EmployeeFactory;
import lab1.FullTimeEmployee;
import lab1.PartTimeEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author han
 */
public class EmployeeFactoryTest {
    
    private EmployeeFactory factory = new EmployeeFactory();

    @Test
    public void testCreateFullTimeEmployee() {
        Employee fullTimeEmployee = factory.createEmployee("FullTime");
        assertNotNull(fullTimeEmployee);
        assertTrue(fullTimeEmployee instanceof FullTimeEmployee);
        assertEquals("Wu", fullTimeEmployee.getName());
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee partTimeEmployee = factory.createEmployee("PartTime");
        assertNotNull(partTimeEmployee);
        assertTrue(partTimeEmployee instanceof PartTimeEmployee);
        assertEquals("Alex", partTimeEmployee.getName());
    }

    @Test
    public void testCreateUnknownEmployeeType() {
        Employee unknownEmployee = factory.createEmployee("Intern");
        assertNull(unknownEmployee);
    }
    
}
