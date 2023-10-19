package homeworks.lab_71;

import java.util.Arrays;

public class TestLab71 {
    public static void main(String[] args) {
        /* LAB 7.1
        Create a class Employee with a method salary to return employee’s salar
        There are 2 types of employee: Full time employee and contract employee
        Full time employee has salary is 50000 and contract employee has salary 40000
        Write a method to accept a list of Employee and calculate total salary
        For example, company has 3 FTE and 2 contractor
        */
        Employee71 fte = new FTE();
        Employee71 contractor = new Contractor();
        int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte, contractor));
        System.out.printf("Total salary of 3 FTE and 2 contractor = %d", totalSalary);
    }
}
