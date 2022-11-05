package ExerciseTasks.LeetCode;

import javax.management.StringValueExp;
import java.util.Arrays;

public class integerToIntArray {
    public static void main(String[] args) {
        int num=985412548;
        int numR=num;
        int count=0;
        while (numR!=0){
            numR/=10;
            count++;
        }

        int[] arr=new int[count];
        for (int i = count-1; i >=0 ; i--) {
            arr[i]=num%10;
            num/=10;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
