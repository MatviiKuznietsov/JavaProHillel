package HW25;


import org.junit.platform.console.ConsoleLauncher;

import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ProjectTestRunner {

    public void runTestByNameClass(String name) {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
        PrintWriter printEEWriter = new PrintWriter(new OutputStreamWriter(System.err));
        ConsoleLauncher.run(printWriter, printEEWriter, String.format("-f %s", name));
    }

    public void runTestByTypeClass(Class<?> aClass) {
        String name = aClass.getName();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
        PrintWriter printEEWriter = new PrintWriter(new OutputStreamWriter(System.err));
        ConsoleLauncher.run(printWriter, printEEWriter, String.format("-c %s", name));
    }

    public void runTestByNamesClasses(String... names) {
        for (String name : names) {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
            PrintWriter printEEWriter = new PrintWriter(new OutputStreamWriter(System.err));
            ConsoleLauncher.run(printWriter, printEEWriter, String.format("-f %s", name));
        }
    }

    public void runTestByTypesClasses(Class<?>... aClasses) {
        for (Class<?> aClass : aClasses) {
            String name = aClass.getName();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
            PrintWriter printEEWriter = new PrintWriter(new OutputStreamWriter(System.err));
            ConsoleLauncher.run(printWriter, printEEWriter, String.format("-c %s", name));
        }
    }


    public void runTestByPackage(String packageName) {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
        PrintWriter printEEWriter = new PrintWriter(new OutputStreamWriter(System.err));
        ConsoleLauncher.run(printWriter, printEEWriter, String.format("-p %s", packageName));
    }


}

