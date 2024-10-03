package Behavioral_Pattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class StockTicker {
    private List<StockObserver> observers = new ArrayList<>();
    private double appleStockPrice;
    private double teslaStockPrice;

    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void unregisterObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setAppleStockPrice(double price) {
        this.appleStockPrice = price;
        notifyObservers("Apple", price);
    }

    public void setTeslaStockPrice(double price) {
        this.teslaStockPrice = price;
        notifyObservers("Tesla", price);
    }

    public double getAppleStockPrice() {
        return appleStockPrice;
    }

    public double getTeslaStockPrice() {
        return teslaStockPrice;
    }

    private void notifyObservers(String stock, double price) {
        for (StockObserver observer : observers) {
            observer.update(stock, price);
        }
    }
}
