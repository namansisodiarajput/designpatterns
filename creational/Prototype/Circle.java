package creational.Prototype;

public class Circle implements Shape {

    int R;

    @Override
    public String shapeName() {
        return "CIRCLE";
    }

    /**
     * Shallow copy
     * @return
     */
    @Override
    public Circle clone() {

        return this;
    }
}
