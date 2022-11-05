package Day44.MentoringSruCozumu;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    static int[] randomNumber(int lenght){
        int[] randArr=new int[lenght];
        Random rand = new Random();
        for (int i = 0; i < lenght; i++) {
            randArr[i]=rand.nextInt(0,21);
        }
        return randArr;
    }

    public static int[] reverseArray(int[] arr){
        int[] reversedArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i]=arr[arr.length-1-i];
        }
        return reversedArr;
    }

    public static int[] sortArrayDescending1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        return arr;
    }
    public static  int[] sortArrayDescending2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static  int[] sortArrayAscending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] array= randomNumber(10);
        System.out.println(Arrays.toString(array)+"====>Array");
        System.out.println(Arrays.toString(reverseArray(array))+"=======>reversed");
        System.out.println(Arrays.toString(sortArrayDescending1(array))+"==========>Sorted");
        System.out.println(Arrays.toString(sortArrayDescending2(array))+"==========>Sorted2");
        System.out.println(Arrays.toString(sortArrayAscending(array))+"==========>Sorted3");
    }
}
