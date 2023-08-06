package HW25;

public class App {
    public static void main(String[] args) {
        ProjectTestRunner projectTestRunner = new ProjectTestRunner();

        projectTestRunner.runTestByNameClass("SimpleMathLibraryTest"); //+
        projectTestRunner.runTestByTypeClass(SimpleMathLibraryTest.class); //+
        projectTestRunner.runTestByNamesClasses("SimpleMathLibraryTest", "ArrayWorkTests");
        projectTestRunner.runTestByTypesClasses(SimpleMathLibraryTest.class);
        projectTestRunner.runTestByPackage("HW25"); //+
    }

}
