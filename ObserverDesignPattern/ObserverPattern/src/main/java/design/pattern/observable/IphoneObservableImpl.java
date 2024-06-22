package design.pattern.observable;

import design.pattern.observer.NotificationAlertObserver;

import java.lang.*;
import java.util.*;
public class IphoneObservableImpl implements StockObservable{

    int stockCount = 0;

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    @Override
    public void getStockCount() {
        System.out.print("Get current stock count" + stockCount);
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifyObservers();
        }
        stockCount += newStockCount;
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void add(NotificationAlertObserver observer){
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(NotificationAlertObserver observer : notificationAlertObserverList){

            observer.update();
        }
    }
}
