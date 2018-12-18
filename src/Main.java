import java.sql.SQLOutput;

public class Main {

    // her oprettes en string for software versisionen og sættes som final (kan ikke ændres senere)
    // den sættes også som public så vi kan kalde den fra andre klasser uden getters og setters
    public static final String SOFTWARE_VERSION = "0.1.0";
    // her oprettes en string for Media mappen og sættes som final (kan ikke ændres senere)
    public static final String MEDIA_MAPPE = "media/";

    // her er main metoden som starter programmet
    public static void main(String[] args) {

        // her kaldes klassen test og kører metoden "test" fra denne klasse
        Test.test();

    }
}

