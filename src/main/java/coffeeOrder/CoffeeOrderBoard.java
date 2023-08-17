package coffeeOrder;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orderList = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void addOrder(Order order) {
        order.setOrderNumber(nextOrderNumber);
        orderList.add(order);
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orderList.isEmpty()) {
            Order nextOrder = orderList.remove(0);
            System.out.println("Delivering order: " + nextOrder);
        } else {
            System.out.println("No orders to deliver. ");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNumber() == orderNumber) {
                Order deliveredOrder = orderList.remove(i);
                System.out.println("Delivering order: " + deliveredOrder);
                return;
            }
        }
        System.out.println("Order with number " + orderNumber + " not found");
    }

    public void draw() {
        System.out.println("=================");
        System.out.println("Num | Name");
        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("=================");
    }
}
