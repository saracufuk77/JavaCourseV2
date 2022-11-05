package Test1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class JavaMath {
    public static void main(String[] args) {

        getTotal(5);
    }


    static int getTotal(int par) {
        int total = 0;
        for (int i = 1; i <= par; i++) {
            total += i;
        }
//        System.out.println("total = " + total);
        return total;
    }

    static String findFirstLetterWord(ArrayList<String> strings, String firstLetter) {
        String str;
        for (String string : strings) {
            if (string.startsWith(firstLetter)) {
                return string;
            }
        }
        return null;
    }
}
