package HW_012;

public class App {
    public static void main(String[] args) {
        FileNavigator failNav = new FileNavigator();
        failNav.add("path\\to\\file");
        failNav.add("path\\to\\file\\smd");
        failNav.add("path\\to\\file\\dopdir");
        failNav.add("path\\file\\dsd");

        failNav.viewfilesListMap();

        failNav.find("path\\to\\file\\smd");
        failNav.fileNavigator(20);
        failNav.remove("path\\to\\file");
        failNav.sortBySize();


    }
}
