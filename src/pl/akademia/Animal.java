package pl.akademia;

public class Animal implements Imageable {
    private String fileName;

    public  Animal(String fileName) {
        this.fileName=fileName;
    }
    @Override
    public String getFileName(){
        return fileName;
    }
}
