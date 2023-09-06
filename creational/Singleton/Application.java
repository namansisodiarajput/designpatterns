package creational.Singleton;

public class Application {

    public static void main(String[] args) {

        Database d1 = Database.getInstance();
        System.out.println(d1.toString());

        Database d2 = Database.getInstance();
        System.out.println(d2.toString());

        Database d3 = Database.getInstance();
        System.out.println(d3.toString());

        Database d4 = Database.getInstance();
        System.out.println(d4.toString());
    }

}
