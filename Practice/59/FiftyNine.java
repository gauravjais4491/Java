import java.util.Locale;
import java.util.ResourceBundle;

public class FiftyNine {
    public static void main(String[] args) {
        // Locale l=Locale.getDefault();
        Locale l = new Locale("fr", "FR");
        // Locale l2=new Locale("ENGLISH", "US", "WIN");
        // System.out.println("LName: "+l2);
        // System.out.println(l.getDisplayCountry());
        // System.out.println(l.getDisplayLanguage());
        // System.out.println(l.getDisplayName());
        // System.out.println(l.getISO3Country());
        // System.out.println(l.getISO3Language());
        // System.out.println(l.getLanguage());
        // System.out.println(l.getCountry());
        // System.out.println("HashCode for this Country: "+l.hashCode());
        ResourceBundle r = ResourceBundle.getBundle("Welcome", l);
        System.out.println("Proposal to My Love: " + r.getString("greeting"));
    }

}
