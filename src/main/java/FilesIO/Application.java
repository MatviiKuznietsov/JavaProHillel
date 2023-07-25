package FilesIO;


import MathOper.MathOperations;

public class Application {
    public static void main(String[] args)  {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration fileConf; // make object for config data
        fileConf = loader.load(); // send data to conf object
        FileLogger fileLogger = new FileLogger(fileConf);
        fileLogger.debug("it`s DEBUG MSG\n");
        fileLogger.info("it`s INFO MSG\n");
        System.out.println("cos = " + MathOperations.cos(0));
        System.out.println("max = " + MathOperations.max(150,200));
    }


}
