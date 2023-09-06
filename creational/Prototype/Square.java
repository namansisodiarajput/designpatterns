package creational.Prototype;

public class Square implements Shape {

    int len;

    @Override
    public String shapeName() {
        return "SQUARE";
    }

    /**
     * Deep copy
     * @return
     */
    @Override
    public Square clone() {

        Square newSquare = new Square();
        newSquare.len = this.len;

        return newSquare;
    }
}
