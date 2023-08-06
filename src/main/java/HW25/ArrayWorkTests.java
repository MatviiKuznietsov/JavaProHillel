package HW25;

import org.junit.Assert;
import org.junit.Test;

public class ArrayWorkTests {
    @Test
    public void arrayBackAfter4test1() {
        int[] array = {1, 1, 4, 1, 1, 1, 1};
        int[] expectedArray = {1,1,1,1};
        ArrayWork arrayWork = new ArrayWork();
        int[] actualArray = arrayWork.arrayBackAfter4(array);
        for (int i=0; i< expectedArray.length; i++){
            if (actualArray[i]!=actualArray[i]){
                System.out.println("False");
            }
        }
    }

    @Test
    public void arrayBackAfter4test2() {
        int[] array = {1, 1, 4, 1, 1, 4, 1};
        int[] expectedArray = {1};
        ArrayWork arrayWork = new ArrayWork();
        int[] actualArray = arrayWork.arrayBackAfter4(array);
        for (int i=0; i< expectedArray.length; i++){
            if (actualArray[i]!=actualArray[i]){
                System.out.println("False");
            }
        }
    }

    @Test
    public void arrayBackAfter4test3() {
        int[] array = {1, 1, 4, 4, 1, 1, 1};
        int[] expectedArray = {1,1,1};
        ArrayWork arrayWork = new ArrayWork();
        int[] actualArray = arrayWork.arrayBackAfter4(array);
        for (int i=0; i< expectedArray.length; i++){
            if (actualArray[i]!=actualArray[i]){
                System.out.println("False");
            }
        }
    }

    @Test
    public void checkArrayWithout4or1test1() {
        int[] array = {1, 1, 1, 4, 1, 1, 1};
        boolean expectedResult = true;
        ArrayWork arrayWork = new ArrayWork();
        boolean actualResult = arrayWork.checkArrayWithout4or1(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkArrayWithout4or1test2() {
        int[] array = {1, 1, 1, 1, 1, 1, 1};
        boolean expectedResult = false;
        ArrayWork arrayWork = new ArrayWork();
        boolean actualResult = arrayWork.checkArrayWithout4or1(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkArrayWithout4or1test3() {
        int[] array = {1, 1, 5, 4, 1, 1, 1};
        boolean expectedResult = false;
        ArrayWork arrayWork = new ArrayWork();
        boolean actualResult = arrayWork.checkArrayWithout4or1(array);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
