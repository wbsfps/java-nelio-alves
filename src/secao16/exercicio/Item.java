package secao16.exercicio;

public class Item {
    private String product;
    private Double price;
    private Integer quantity;

    public Item(){}

    public Item(String product, Double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double total() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %d", product, price, quantity);
    }
}
