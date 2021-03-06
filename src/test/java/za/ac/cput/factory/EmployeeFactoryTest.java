package za.ac.cput.factory;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Name;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/*Breyton Ernstzen (217203027)
  ADP3 - June Assessment 2022
  Date: 9 June 2022
  School Management
 */
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class EmployeeFactoryTest {

    ArrayList<Employee> employee = new ArrayList<Employee>();
    private static final Employee employee1 = EmployeeFactory.builder("101A","dix@gmail.com",null);
    private static final Employee employee2 = EmployeeFactory.builder("123B","jinx@gmail.com",null);
    private static final Employee employee3 = EmployeeFactory.builder("131C","217203027@mycput.ac.za",null);
    private static final Employee employee4 = employee3;

    @Test
    void a_builder() {
        employee.add(employee1);
        System.out.println("Added: " + employee.get(0));
        employee.add(employee2);
        System.out.println("Added: " + employee.get(1));
        assertNotNull(employee);
        assertNull(employee1.getName());
        assertNull(employee2.getName());
        assertNull(employee3.getName());
        assertNull(employee4.getName());
    }

    @Test
    void b_objectEquality(){

        //add another equality test here for three parameter inputs
        assertNotEquals(employee1.getStaffId(),employee2.getStaffId());
        assertNotEquals(employee1.getEmail(),employee2.getEmail());
        assertNotEquals(employee1,employee2);
        assertEquals(employee3,employee4);

        assertNotNull(employee1);
        assertNotNull(employee2);
        assertNotNull(employee3);
        assertNotNull(employee4);
        System.out.println("Equality test passed successfully");
    }

    @Test
    void c_objectIdentity(){

        assertNotSame(employee1.getStaffId(),employee2.getStaffId());
        assertNotSame(employee1.getEmail(),employee2.getEmail());
        assertSame(employee3,employee4);

        assertNotNull(employee1);
        assertNotNull(employee2);
        assertNotNull(employee3);
        assertNotNull(employee4);
        System.out.println("Identity test pass successfully");
    }
}