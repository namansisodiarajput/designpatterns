package creational.AbstractFactoryMethod;

public class SlackNotification implements Notification {

    @Override
    public String template() {
        return """
                This is Slack Notification template
                """;
    }

    @Override
    public String type() {
        return "SLACK_NOTIFICATION";
    }
}
