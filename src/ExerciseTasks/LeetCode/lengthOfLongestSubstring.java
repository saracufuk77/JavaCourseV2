package ExerciseTasks.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabc"));
        System.out.println(lengthOfLongestSubstring2("abcabc"));

    }

    public static int lengthOfLongestSubstring1(String s) {
        final int n = s.length();
        int len = 0;
        int [] repeat = new int[128];
        for (int c = 0, j = 0, i = 0; j < n; j++) {
            c = s.charAt(j);
            i = Math.max(repeat[c], i);
            len = Math.max(len, j - i +1);
            repeat[c] = j+1;
        }
        return len;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println("set = " + set);
        return max;
    }

    }

