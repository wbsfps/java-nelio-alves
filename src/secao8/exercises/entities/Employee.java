package secao8.exercises.entities;


public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public void showDetails() {
        System.out.printf(" Name: %s \n Gross Salary: %.2f\n Tax: %.2f\n", name, grossSalary, tax);
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        System.out.printf("Update data: %s, $%.2f", name, (netSalary() + ((percentage / 100) * grossSalary)));
    }
}
