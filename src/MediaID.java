import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    // her deklareres variablen latestId til 100
    private static int latestId = 100;


    // her oprettes en metode som opretter en ny text fil og returnerer en int
    public static int generate() {

        // her oprettes en ny "File" og så kaldes text dokumentet media_id.txt
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        // her laves en try catch block som fanger exceptions i koden kører programmet selvom fejl opstår
        try {


            // dette stykke kode stopper filer fra at blive oprettet med samme navn
            // og bruger en scanner til at modtage en ny int som ID
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            // her incrementes latestId
            latestId++;

            // her oprettes et nyt FileWriter objekt og ID'et laves til en string
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

            // her defineres det hvilke exceptions skal fanges (alle i dette tilfælde)
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        // her returneres ID'et
        return latestId;
    }

}