package secao13.exercicios.terceiro.entities;

import secao13.exercicios.terceiro.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addOrderItems(OrderItem item) {
        orderItems.add(item);
    }

    public void removeOrderItems(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : orderItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order Status: " + getStatus() + "\n");
        sb.append("Order Client: " + getClient().getName() + " - " + getClient().getEmail() + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem item : orderItems) {
            sb.append(item.getProduct().getName() + ", $" + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + item.subTotal() + "\n");
        }
        return sb.toString();
    }
}
