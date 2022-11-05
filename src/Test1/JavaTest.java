package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaTest {

    @Test
    public void testTotalTrue(){
        int num=5;
        int expected = (num*(num+1)/2);
        int actual=JavaMath.getTotal(num);
        Assert.assertEquals(actual,expected,"Totals do not match");
    }

    @Test
    public void testTotalFalse(){
        int num=5;
        int expected = 5;
        int actual=JavaMath.getTotal(num);
        Assert.assertNotEquals(actual,expected,"Totals do not match");
    }

    @Test
    public void testTotalAssertTrue(){
        int num=5;
        int expected = (num*(num+1)/2);
        int actual=JavaMath.getTotal(num);
        Assert.assertTrue (actual==expected);
    }

    @Test
    public void getStringNotNull(){
        String firstLetter = "M";
        ArrayList<String> strings  = new ArrayList<>(Arrays.asList("Manitoba","Ontario","Quebec"));
        String result=JavaMath.findFirstLetterWord(strings,firstLetter);
        Assert.assertNotNull(result,"result is null");
    }
}
