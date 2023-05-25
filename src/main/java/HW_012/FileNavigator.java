package HW_012;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileNavigator {
    private FileData filesData; // Object file

    private List<FileData> fileDataList = new ArrayList<>(); // List of Objects Files

    //--------------------------------------------------------------------
    private String path1 = "D:\\JAVA\\HW_013\\Files\\Folder_01";
    private String path2 = "D:\\JAVA\\HW_013\\Files\\Folder_02";
    private String path3 = "D:\\JAVA\\HW_013\\Files\\Folder_03";


    public String getPath1() {
        return path1;
    }

    public String getPath2() {
        return path2;
    }

    public String getPath3() {
        return path3;
    }

    //--------------------------------------------------------------------
    public List<FileData> add(String path) throws IOException {
        if (path.contains(path1) || path.contains(path2) || path.contains(path3)) {
            System.out.println("Path consist " + path);
        } else {
            System.out.println("Path doesn`t consist " + path);
        }
        File file = new File(path);
        file.createNewFile();  // Make file
        filesData = new FileData(file.getName(), file.length(), file.getParent()); // fill files attribute
        fileDataList.add(filesData);
        return fileDataList;
    }

    public List<FileData> find(String path) {
        List<FileData> filesOnCertanPath = new ArrayList<>();
        for (FileData file : fileDataList) {
            if (file.getPathToFile().equals(path)) {
                System.out.println("Path has found -> " + file.getNameFile());
                filesOnCertanPath.add(file);
            }
        }
        return filesOnCertanPath;
    }

    public List<FileData> filterBySize(double size) {
        List<FileData> filesWithSomeSize = new ArrayList<>();
        for (FileData file : fileDataList) {
            if (file.getSizeFile() < size) {
                System.out.println(file.getNameFile() + " With size - " + file.getSizeFile());
                filesWithSomeSize.add(file);
            }
        }
        return filesWithSomeSize;
    }

    public void remove(String path) {
        List<Integer> listToRemove = new ArrayList<>();
        for (FileData file : fileDataList) {
            if (file.getPathToFile().equals(path)) {
                listToRemove.add(fileDataList.indexOf(file));
                System.out.println("Remove " + file.getNameFile());
            }
        }

        for (int index : listToRemove) {
            File fileToRemove = new File(fileDataList.get(index).getPathToFile() + "\\" + fileDataList.get(index).getNameFile());
            fileToRemove.delete();
            fileDataList.remove(index);
        }
    }

    public void sortBySize() {
        fileDataList.sort(new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                if (o1.getSizeFile() == o2.getSizeFile()) return 0;
                else if (o1.getSizeFile() > o2.getSizeFile()) return 1;
                else return -1;
            }
        });
        for (FileData fileData : fileDataList) {
            System.out.println("File size " + fileData.getSizeFile());
        }
    }
}
