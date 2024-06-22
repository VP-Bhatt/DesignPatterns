package design.pattern;

import design.pattern.observable.IphoneObservableImpl;
import design.pattern.observable.StockObservable;
import design.pattern.observer.EmailNotificationAlertObserver;
import design.pattern.observer.NotificationAlertObserver;

import javax.management.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("123@mail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("XYZ@Mail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(5);
        iphoneStockObservable.setStockCount(12);
        iphoneStockObservable.setStockCount(15);
    }
}