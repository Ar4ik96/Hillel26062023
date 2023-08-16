package coffeeOrder;

public class Order {
    private int orderNumber;
    private String customerName;


    public Order(String customerName) {
        this.customerName=customerName;
    }
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return orderNumber + " | " + customerName;
    }
}
