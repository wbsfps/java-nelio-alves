package secao18.genericsDelimitados.solucaoProblema1.model.entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", getName(), getPrice());
    }

    @Override
    public int compareTo(Product value) {
        return getPrice().compareTo(value.getPrice());
    }
}
