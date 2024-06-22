package design.pattern.observable;

import design.pattern.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifyObservers();

    public void setStockCount(int newStockCount);

    public void getStockCount();


}
