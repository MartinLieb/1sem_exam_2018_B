public class Billede extends Media {

    private String fileType;
    private int width;
    private int height;
    private String photographer;

    @Override
    public void logToConsol(){
        System.out.println(this.getName() + "." + this.fileType);

    }
}
