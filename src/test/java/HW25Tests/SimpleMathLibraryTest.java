package HW25Tests;

import HW25.SimpleMathLibrary;
import org.junit.Assert;
import org.junit.Test;

public class SimpleMathLibraryTest {
    @Test
    public void SimpleMathLibraryAdd() {
        SimpleMathLibrary mathOper = new SimpleMathLibrary();
        double a = 2;
        double b = 3;
        double expected = 5;
        double actual =  mathOper.add(a, b);
       if (actual == expected){
           System.out.println("OK");
       }else{
           System.out.println("FAIL");
       }

    }

    @Test
    public void SimpleMathLibraryMinus() {
        SimpleMathLibrary mathOper = new SimpleMathLibrary();
        double a = 5;
        double b = 4;
        double expected = 1;
        double actual = mathOper.minus(a, b);
        if (actual == expected){
            System.out.println("OK");
        }else{
            System.out.println("FAIL");
        }
    }
}
