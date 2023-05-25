package HW_012;

public class FileData {
    private String nameFile;
    private double sizeFile;

    private String pathToFile;
    public FileData(String nameFile, double sizeFile, String pathToFile){
        setNameFile(nameFile);
        setSizeFile(sizeFile);
        setPathToFile(pathToFile);
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public double getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(double sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }


}
