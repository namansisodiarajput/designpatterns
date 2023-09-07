package structural.Adapter;

public class Application {

    public static void main(String[] args) {

        Language english = new English();
        english.setText("My name is naman sisodia");

        LanguageAdapter adapter = new LanguageAdapter();

        System.out.println(adapter.convert(english, "HINDI").getText());
        System.out.println(adapter.convert(english, "JAPANESE").getText());
    }

}
