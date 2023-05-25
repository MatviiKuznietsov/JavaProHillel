package HW_012;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        try {
            fileNavigator.add(fileNavigator.getPath1() + "\\readme1.txt");
            fileNavigator.add(fileNavigator.getPath2() + "\\readme2.txt");
            fileNavigator.add(fileNavigator.getPath2() + "\\readme2_2.txt");
            fileNavigator.add(fileNavigator.getPath3() + "\\readme3.txt");
            fileNavigator.add("D:\\JAVA\\HW_013\\Files\\Folder_05\\readme4.txt");
        } catch (IOException io) {
            System.out.println("File not found");
        }

        fileNavigator.find(fileNavigator.getPath2());
        fileNavigator.filterBySize(10);
        fileNavigator.remove(fileNavigator.getPath2());
        fileNavigator.sortBySize();

    }
}
