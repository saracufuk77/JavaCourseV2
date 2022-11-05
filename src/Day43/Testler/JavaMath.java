package Day43.Testler;

import java.util.ArrayList;

public class JavaMath {


    public static int getTotal(int num){
        int total=0;
        for (int i = 0; i <= num; i++) {
            total+=i;
        }
        return total;
    }


    public static String firstLetter(ArrayList<String> str, String letter){
        for (String s : str) {
            if(s.startsWith(letter)){
                return s;
            }
        }
        return null;
    }
}
