package Test1.exceptinHandling;

import java.io.ObjectStreamException;
import java.sql.SQLOutput;

public class sil {
    public static void main(String[] args) {
        Object o = new Integer(3);
        String s = (String) o;
        System.out.println(s);
    }

}
