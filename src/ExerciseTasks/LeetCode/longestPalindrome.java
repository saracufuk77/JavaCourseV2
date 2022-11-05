package ExerciseTasks.LeetCode;

import Day8.Java.StringReplaceAllMethod;
import org.jetbrains.annotations.NotNull;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println("================================");
        longestPalindrome("cbbd");

    }

    public static void longestPalindrome(String str){
        int maxlen=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1; j>=0 ; j--) {
                String sbstr= str.substring(i,j);
                StringBuilder sb=new StringBuilder(sbstr);
                String rev= String.valueOf(sb.reverse());
                if(rev.equals(sbstr) && sbstr.length()>maxlen){
                    maxlen=sbstr.length();
                    System.out.println(sbstr);
                    break;
                }
            }
        }
    }
}
