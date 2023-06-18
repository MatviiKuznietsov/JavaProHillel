package HW_019;

public class CalcTests {

    @BeforeSuite
    public void beforeTest() {
        System.out.println("Before test");
    }
    @BeforeSuite
    public void beforeTest2() {
        System.out.println("Before test2");
    }

    @Test(priority = 1)
    public void summTest() {
        System.out.println("Test1");
    }

    @Test(priority = 2)
    public void divTest() {
        System.out.println("Test2");
    }

    @AfterSuite
    public void afterTest() {
        System.out.println("After test");
    }
    @AfterSuite
    public void afterTest2() {
        System.out.println("After test");
    }

}
