package Test1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class firstNonRepeatingChar {
    //find first nonrepeating char in a string and return its index else return -1

    public static int nonRepeatedChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="leetclode";
        System.out.println(nonRepeatedChar(str));
    }

}
