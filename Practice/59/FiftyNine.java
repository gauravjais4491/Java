import java.util.Locale;
import java.util.ResourceBundle;

public class FiftyNine {
    public static void main(String[] args) {
        // Locale l=Locale.getDefault();
        Locale l = new Locale("fr", "FR");
        Locale l2=new Locale("ENGLISH", "US", "WIN");
        System.out.println("LName: "+l2);
        System.out.println(l2.getDisplayCountry());
        System.out.println(l2.getDisplayLanguage());
        System.out.println(l2.getDisplayName());
        System.out.println(l2.getISO3Country());
        // System.out.println(l2.getISO3Language());
        System.out.println(l2.getLanguage());
        System.out.println(l2.getCountry());
        System.out.println("HashCode for this Country: "+l2.hashCode());
        ResourceBundle r = ResourceBundle.getBundle("Welcome", l);
        System.out.println("Proposal to My Love: " + r.getString("greeting"));
    }

}
