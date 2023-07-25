package FilesIO;

import MathOper.MathOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTests {
    @Test
    public void cos() {
        double a = 0;
        double expected = 1;
        double actual;
        actual = MathOperations.cos(a);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void max() {
        double a = 200;
        double b = 150;
        double expected = 200;
        double actual;
        actual = MathOperations.max(a, b);
        Assert.assertEquals(actual, expected);
    }
}
