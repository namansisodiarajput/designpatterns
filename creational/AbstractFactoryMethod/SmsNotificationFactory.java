package creational.AbstractFactoryMethod;

public class SmsNotificationFactory implements NotificationFactory {

    @Override
    public SmsNotification create() {

        return new SmsNotification();
    }
}
