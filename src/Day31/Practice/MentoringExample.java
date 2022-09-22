package Day31.Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MentoringExample {
    public static void main(String[] args) {
        int[] array={1,3,5,7,9};
        System.out.println(isduplicate(array));
    }

        static  boolean isduplicate(int[] arr){
            HashSet set1=new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                set1.add(arr[i]);
            }
            if (set1.size()== arr.length){
                return true;
        }
            return false;
}


}
