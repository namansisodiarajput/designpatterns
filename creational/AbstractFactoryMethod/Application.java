package creational.AbstractFactoryMethod;

public class Application {

    public static void main(String[] args) {

        // create SMS notification
        NotificationFactory factory = new SmsNotificationFactory();
        Notification template = factory.create();
        System.out.print(template.template());
        System.out.println(template.type());

        // create Slack notification
        factory = new SlackNotificationFactory();
        template = factory.create();
        System.out.print(template.template());
        System.out.println(template.type());

    }

}
