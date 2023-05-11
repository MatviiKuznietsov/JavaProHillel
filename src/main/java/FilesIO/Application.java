package FilesIO;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args)  {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        FilesIO.FileLoggerConfiguration fileConf; // make object for config data
        fileConf = loader.load(); // send data to conf object
        FileLogger fileLogger = new FileLogger(fileConf);
        fileLogger.debug("it`s DEBUG MSG\n");
        fileLogger.info("it`s INFO MSG\n");


    }


}
