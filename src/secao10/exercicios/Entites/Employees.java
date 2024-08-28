package secao10.exercicios.Entites;

public class Employees {
    private Integer id;
    private String name;
    private Double salary;

    public Employees(){}

    public Employees(Integer id) {
        this.id = id;
    }

    public Employees(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Id %d, %s, %.2f", id, name, salary);
    }
}
