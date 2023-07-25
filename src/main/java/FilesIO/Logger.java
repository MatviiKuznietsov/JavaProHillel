package FilesIO;

abstract class Logger {
    abstract void debug(String notification);
    abstract void info(String notification);
    abstract void writeLog(String notification);
}
