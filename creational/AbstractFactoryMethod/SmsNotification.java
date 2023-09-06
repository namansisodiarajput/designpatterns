package creational.AbstractFactoryMethod;

public class SmsNotification implements Notification {

    @Override
    public String template() {
        return """
                This is SMS Notification template
                """;
    }

    @Override
    public String type() {
        return "SMS_NOTIFICATION";
    }
}
