package design.pattern.observer;

import design.pattern.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{

    String EmailId;
    StockObservable observable;

    public EmailNotificationAlertObserver(String EmailId, StockObservable observable){
        this.observable = observable;
        this.EmailId = EmailId;
    }
    @Override
    public void update() {
        sendMail(EmailId,"Hurry upp iphones are in stock");
    }

    public void sendMail(String emailId, String msg){
        System.out.println("email sent to " + emailId);
    }
}
