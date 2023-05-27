package HW_012;

import java.io.File;
import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> filesListMap = new HashMap<>();
    private List<FileData> fileDataList;
    private FileData fileData;

    private String pathKey = "path\\to\\file";

    public void add(String path) {
        if (path.contains(pathKey)) {
            System.out.println("Path ok");
            fileDataList = new ArrayList<>();
            File file = new File(path).getAbsoluteFile();
            File[] listFiles = file.listFiles();
            for (File data : listFiles) {  //Check if it directory
                if (data.isDirectory()) {
                } else {
                    fileData = new FileData(data.getName(), data.getPath(), data.length());
                    fileDataList.add(fileData);
                }
            }
            filesListMap.put(path, fileDataList);
        } else {
            System.out.println("Path denied");
        }
    }

    public void find(String path) {
        List<FileData> listFileInFolder = new ArrayList<>();
        File file = new File(path).getAbsoluteFile();
        File[] listFiles = file.listFiles();
        for (File data : listFiles) {
            if (data.isDirectory()) {
                System.out.println("This is folder - " + data.getName());
            } else {
                System.out.println("This is file - " + data.getName());
                listFileInFolder.add(new FileData(data.getName(), data.getPath(), data.length()));
            }
        }
        for (FileData fileData1 : listFileInFolder) {
            System.out.println(fileData1.getPath() + " -> [" + fileData1.getName() + "}");
        }
    }

    public void fileNavigator(long size) {
        for (FileData fileData1 : fileDataList) {
            if (fileData1.getSize() < size) {
                System.out.println("File " + fileData1.getName() + " < " + size + "b " + fileData1.getSize());
            }
        }
    }

    public void remove(String path) {
        filesListMap.remove(path);
    }

    public void sortBySize() {
        fileDataList.sort(new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                if (o1.getSize() == o2.getSize()) return 0;
                else if (o1.getSize() > o2.getSize()) return 1;
                else return -1;
            }
        });
        for (FileData fileData : fileDataList) {
            System.out.println("File size " + fileData.getSize());
        }
    }

    public void viewfilesListMap() {
        for (Map.Entry entry : filesListMap.entrySet()) {
            System.out.println(entry.getKey() + " - > " + entry.getValue());
        }
    }
}
