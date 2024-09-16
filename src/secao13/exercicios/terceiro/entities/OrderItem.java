package secao13.exercicios.terceiro.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }



    public Double subTotal() {
        return getPrice() * getQuantity();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", product=" + product +
                '}';
    }
}
