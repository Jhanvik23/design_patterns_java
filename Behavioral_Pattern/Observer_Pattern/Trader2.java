package Behavioral_Pattern.Observer_Pattern;

public class Trader2 implements StockObserver {
    @Override
    public void update(String stock, double price) {
        System.out.println("Trader2: " + stock + " price changed to $" + price);
    }
}
