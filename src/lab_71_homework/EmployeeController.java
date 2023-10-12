package lab_71_homework;

import java.util.List;

public class EmployeeController {
    public static int totalSalary(List<Employee71> employeeList){
        int totalSalary = 0;
        for (Employee71 employee : employeeList) {
            totalSalary += (employee.getQuantityEmployee() * employee.getSalary());
        }
        return totalSalary;
    }
}
