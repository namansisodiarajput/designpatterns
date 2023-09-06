package creational.Prototype;

public class Application {

    public static void main(String[] args) {

        /**
         * Deep copy
         */
        Square s1 = new Square();
        s1.len = 25;
        Square s2 = s1.clone();
        System.out.println("-------Cloning Square--------");
        System.out.println(s1.len + "-----" + s2.len);
        s2.len = 20;
        System.out.println(s1.len + "-----" + s2.len);

        /**
         * Shallow copy
         */
        Circle c1 = new Circle();
        c1.R = 25;
        Circle c2 = c1.clone();
        System.out.println("-------Cloning Circle--------");
        System.out.println(c1.R + "-----" + c2.R);
        c2.R = 20;
        System.out.println(c1.R + "-----" + c2.R);

    }

}
