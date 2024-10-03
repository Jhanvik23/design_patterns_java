package Behavioral_Pattern.Observer_Pattern;

public class Trader1 implements StockObserver {
    @Override
    public void update(String stock, double price) {
        System.out.println("Trader1: " + stock + " price changed to $" + price);
    }
}
