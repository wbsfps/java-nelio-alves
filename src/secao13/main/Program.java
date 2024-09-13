package secao13.main;

import secao13.entities.Order;
import secao13.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus order1 = OrderStatus.DELIVERED;
        OrderStatus order2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(order1);
        System.out.println(order2);
    }
}
