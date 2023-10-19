package homeworks.lab_71;

public class Employee71 {
    // Class  level/ Class scope
    private String name;
    private int quantityEmployee;
    private int salary;

    public Employee71() {
    }

    public Employee71(String name, int quantityEmployee, int salary) {
        this.name = name;
        this.quantityEmployee = quantityEmployee;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(int quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
