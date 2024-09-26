package secao14.exercicios.primeiro.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePeHour;
    private static List<Employee> employees = new ArrayList<>();

    public Employee(){}

    public Employee(String name, Integer hours, Double valuePeHour) {
        this.name = name;
        this.hours = hours;
        this.valuePeHour = valuePeHour;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Double payment() {
        return valuePeHour * hours;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePeHour() {
        return valuePeHour;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }


    public static String detalis() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payments: \n");
        for (Employee employee : employees) {
            sb.append(employee.getName() + " - $" + String.format("%.2f", employee.payment()) + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", valuePeHour=" + valuePeHour +
                ", employees=" + employees +
                '}';
    }
}
