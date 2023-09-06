package creational.AbstractFactoryMethod;

public class SlackNotificationFactory implements NotificationFactory {

    @Override
    public SlackNotification create() {

        return new SlackNotification();
    }
}
