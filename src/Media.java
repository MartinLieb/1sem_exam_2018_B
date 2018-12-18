import javax.print.attribute.standard.MediaName;
import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {

    // her deklareres variablerne assetId, name, created og fileName
    // variablerne sættes til private og kræver derfor getters og setters for kunne blive kaldt i andre klasser
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;


    // her oprettes en constructor til "Media" som med det samme tilføjer et ID og dato for oprettelse
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    // her ses getters og setters til alle klassens variabler
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // her oprettes en metode som samler alle variablerne fra klassen i en string
    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public void logToConsol(){
        System.out.println(this.name + " " + "media");
    }

}