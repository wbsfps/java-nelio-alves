package secao13.exercicios.terceiro.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
