package programs;

import java.util.Objects;

public class Employee {
    private int empId;
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(int empId, String name, String department, double salary, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(empId, employee.empId) && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, age, salary, department);
    }
}
