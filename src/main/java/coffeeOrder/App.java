package coffeeOrder;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.addOrder(new Order("Sendy"));
        orderBoard.addOrder(new Order("Bob"));
        orderBoard.addOrder(new Order("Patrick"));

        orderBoard.draw();

        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(2);

        orderBoard.draw();
    }
}
