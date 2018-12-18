import java.io.File;

public class Artikel extends Media {

    private String author;
    private String articleText;
    private File picture;

    @Override
    public void logToConsol(){
        System.out.println(this.getName());
    }
}
