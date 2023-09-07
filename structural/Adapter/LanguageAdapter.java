package structural.Adapter;

public class LanguageAdapter {

    Language convert(Language from, String to) {

        if(to.equals("HINDI")) {

            Hindi hindi = new Hindi();
            hindi.setText("mera naam naman sisaudiya hai");
            return hindi;
        } else if(to.equals("JAPANESE")) {

            Hindi japanese = new Hindi();
            japanese.setText("Watashinonamaeha naman shisodiadesu");
            return japanese;
        }

        return from;
    }
}
