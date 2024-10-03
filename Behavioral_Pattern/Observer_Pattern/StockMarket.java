package Behavioral_Pattern.Observer_Pattern;

public class StockMarket {
    public static void main(String[] args) {
        StockTicker stockTicker = new StockTicker();

        // Create Traders (Observers)
        StockObserver traderA = new Trader1();
        StockObserver traderB = new Trader2();

        // Register Traders to the StockTicker
        stockTicker.registerObserver(traderA);
        stockTicker.registerObserver(traderB);

        // Simulate stock price updates
        stockTicker.setAppleStockPrice(150.00);
        stockTicker.setTeslaStockPrice(720.00);

        // Later price update
        stockTicker.setAppleStockPrice(155.50);
        stockTicker.setTeslaStockPrice(715.00);
    }
}
