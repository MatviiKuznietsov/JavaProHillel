package FilesIO;

import java.io.*;
import java.util.Properties;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load() {
        FileInputStream fis;
        Properties proper = new Properties();
        FileLoggerConfiguration fileLogConf = new FileLoggerConfiguration();

        try {
            fis = new FileInputStream("D:\\JAVA\\HW9\\ConfigFile.txt");
            proper.load(fis);
            String file =  proper.getProperty("FILE");
            String level =  proper.getProperty("LEVEL");
            String format =  proper.getProperty("FORMAT");
            String maxSize =  proper.getProperty("MAX-SIZE");

            fileLogConf.setFileName(file);
            fileLogConf.setLogLevel(level);
            fileLogConf.setMaxSizeFile(Integer.parseInt(maxSize));
            fileLogConf.setFormat(format);

            System.out.println("FILE: " + file
                    + ", LEVEL: " + level
                    + ", FORMAT: " + format
                    + ", MAX-SIZE" + maxSize);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");

        }
        return fileLogConf;
    }
}


