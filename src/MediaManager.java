import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {

    // Her kommer din kode

    // Metode som laver et array der indeholder alle filnavne fra mappen "media"
    // derefter printer metoden alle filnavnene ved brug af en for løkke
    public static void readMediaFolder(String folderNavn){
        File folder = new File("C:\\Users\\Pessi\\Documents\\GitHub\\1sem_exam_2018_B\\media");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}

