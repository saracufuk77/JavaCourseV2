package Day43.Testler;


import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    @Test
    public void getTotalValidate(){
        int num=5;
        int exp=(num*(num+1))/2;
        int total= JavaMath.getTotal(num);
        Assert.assertEquals(total,exp);
    }

    @Test
    public void getTotalFalse(){
        int num=5;
        int exp=10;
        int total= JavaMath.getTotal(5);
       Assert.assertNotEquals(total,exp);
    }

    @Test
    public void getTotalTrue(){
        int num=5;
        int exp=(num*(num+1))/2;
        int total= JavaMath.getTotal(num);
        Assert.assertTrue(total==exp);
    }

    @Test
    public void firstLetterPositive(){
        String letter="O";
        ArrayList<String> kelimeler = new ArrayList<>(Arrays.asList("Mehmet","Ufuk","Oruc","Omer"));
        String act = JavaMath.firstLetter(kelimeler,letter);
        Assert.assertNotNull(act);

    }
}
