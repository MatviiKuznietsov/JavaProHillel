package HW_019;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CalcTests calcTests = new CalcTests();
        Object calcTestsObject = calcTests;  //make object

        TestRunner.start(calcTestsObject.getClass()); //Test Runner start
    }
}
