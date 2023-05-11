package FilesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileLoggerConfigurationLoader {


    public FileLoggerConfiguration load() {
        File ConfigFile = new File("D:\\JAVA\\HW9", "ConfigFile.txt"); // define file
        String[] dataForConf = new String[4]; //array for configuration data
        try {
            FileReader fileReader = new FileReader(ConfigFile); //make fileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader); //put fileReader into buffer reader
//---------------------------------------------------------------------------------------------------------
            String s; // variable for data from file
            for (int i = 0; i < 4; i++) {
                s = bufferedReader.readLine();
                if (s != null) {
                    dataForConf[i] = s.substring(s.lastIndexOf(" ")).trim();
                } else {
                    break;
                }
            }
        } catch (
                Exception e) {
            throw new RuntimeException(e);
        }
        //--------------------------------------------------------------------
        FilesIO.FileLoggerConfiguration fileLogConf = new FilesIO.FileLoggerConfiguration();
        fileLogConf.setFileName(dataForConf[0]);
        fileLogConf.setLogLevel(dataForConf[1]);
        fileLogConf.setMaxSizeFile(Integer.parseInt(dataForConf[2]));
        fileLogConf.setFormat(dataForConf[3]);
        return fileLogConf;
    }
}
