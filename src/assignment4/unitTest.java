import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuzhi on 10/4/2016.
 */
public class unitTest {
    @Test
    public void testFindPowerOfThree() {
        Assignment3 assignment3 = new Assignment3();
        int n = 4;
        int[] expect = new int[]{1,3,9,27};
        int[] result = assignment3.findPowerOfThree(n);
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void testCountDigits() {
        Assignment3 assignment3 = new Assignment3();
        int n = 100;
        int exp = 1;
        Assert.assertEquals(exp, assignment3.countDigits(n));
    }

    @Test
    public void generatePascalsTriangle() {
        Assignment3 assignment3 = new Assignment3();
        int in = 3;
        List<List<Integer>> exp = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        exp.add(one);
        List<Integer> two = new ArrayList<>();
        two.add(1); two.add(1);
        exp.add(two);
        List<Integer> three = new ArrayList<>();
        three.add(1); three.add(2); three.add(1);
        exp.add(three);
        Assert.assertEquals(exp, assignment3.generatePascalsTriangle(3));
    }

    @Test
    public void testReverseVowels() {
        Assignment3 assignment3 = new Assignment3();
        String in = "hello";
        String exp = "holle";
        Assert.assertEquals(exp, assignment3.reverseVowels(in));
    }

    @Test
    public void testLengthOfLastWord() {
        Assignment3 assignment3 = new Assignment3();
        String in = "Hello world";
        int exp = 5;
        Assert.assertEquals(exp, assignment3.lengthOfLastWord(in));
    }

    @Test
    public void testReverseString2() {
        Assignment3 assignment3 = new Assignment3();
        String in = "I like soccer";
        String exp = "soccer like I";
        Assert.assertEquals(exp, assignment3.reverseString2(in));
    }

    @Test
    public void testCheckMessage() {
        Assignment3 assignment3 = new Assignment3();
        String in = "SOSSUSSOP";
        int exp = 2;
        Assert.assertEquals(exp, assignment3.checkMessage(in));
    }
}
