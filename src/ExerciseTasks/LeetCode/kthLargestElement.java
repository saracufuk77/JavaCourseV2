package ExerciseTasks.LeetCode;

import java.util.Arrays;

public class kthLargestElement {
    public static void main(String[] args) {
        int[] arr={1,3,8,10,15,31,7,1,8,9};
//        Arrays.sort(arr);
//        System.out.println("arr = " + Arrays.toString(arr));
//        System.out.println(arr[arr.length-3]);
        kthLargest(arr,4);

    }

    public static int kthLargest(int[] arr, int k){
        int temp;
        int kLargets=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
         kLargets=arr[arr.length-k];
        }
        System.out.println(kLargets);
        return kLargets;
    }
}
