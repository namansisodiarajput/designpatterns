package structural.Adapter;

public class Hindi implements Language {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
}
