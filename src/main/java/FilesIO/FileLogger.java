package FilesIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FileLogger extends Logger {

    public FileLoggerConfiguration getFileConf() {
        return fileConf;
    }

    public void setFileConf(FileLoggerConfiguration fileConf) {
        this.fileConf = fileConf;
    }

    private FileLoggerConfiguration fileConf;

    public FileLogger(FileLoggerConfiguration fileConf) {
        setFileConf(fileConf);
    }

    public void debug(String notification) {
        writeLog(notification);

    }

    public void info(String notification) {
        System.out.println(fileConf.getLogLevel());
        if (fileConf.getLogLevel().equals("DEBUG")) {
            System.out.println("Level denied for logging");
        } else {
            writeLog(notification);
        }
    }

    public void writeLog(String notification) {
        String dateTime = DateTimeFormatter.ofPattern("dd_mm_yyyy-hh_").format(LocalDateTime.now());
        int newFileCounter = 1;
        for (int i = 0; i < newFileCounter; i++) {
            try (FileWriter fileWriter = new FileWriter("Log_" + dateTime + newFileCounter + fileConf.getFileName(), true);) { //input text to file
                checkSizeFile(newFileCounter);
                fileWriter.write(String.format(fileConf.getFormat(), String.valueOf(LocalDateTime.now()), fileConf.getLogLevel(), notification)); //
                fileWriter.flush();
            } catch (FileMaxSizeReachedException e) {
                newFileCounter++;
                System.out.println("File is overloaded. Need one more");
            } catch (IOException e) {
                System.out.println("Couldn`t fined file" + e);
            }
        }
    }

    public int checkSizeFile(int newFileCounter) throws FileMaxSizeReachedException {
        String dateTime = DateTimeFormatter.ofPattern("dd_mm_yyyy-hh_").format(LocalDateTime.now());
        File logFile = new File(fileConf.getPathTo(), "Log_" + dateTime + newFileCounter + fileConf.getFileName()); //file`s lenght
        if (logFile.length() > fileConf.getMaxSizeFile()) {
            System.out.println("Max-size: " + fileConf.getMaxSizeFile() + "\nCurrent size file: " + logFile.length() + "\nPath to file: " + fileConf.getPathTo());
            throw new FileMaxSizeReachedException();
        }
        return newFileCounter;
    }
}
