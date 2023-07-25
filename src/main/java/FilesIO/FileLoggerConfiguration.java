package FilesIO;

public class FileLoggerConfiguration {

    private String fileName;
    private String pathTo = "D:\\JAVA\\HW9";
    private String logLevel;
    private int maxSizeFile;
    private String format = "[%s][%s]-%s";

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPathTo() {
        return pathTo;
    }

    public void setPathTo(String pathTo) {
        this.pathTo = pathTo;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public int getMaxSizeFile() {
        return maxSizeFile;
    }

    public void setMaxSizeFile(int maxSizeFile) {
        this.maxSizeFile = maxSizeFile;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


}
