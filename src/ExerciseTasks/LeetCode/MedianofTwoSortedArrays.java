package ExerciseTasks.LeetCode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2={2};
        findMedianSortedArrays(arr1,arr2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merged=new int[(nums1.length+nums2.length)];
        double median=0.0;
        for (int i = 0; i < nums1.length; i++) {
            merged[i]=nums1[i];
        }
        for (int i = nums1.length; i < merged.length; i++) {
            merged[i]=nums2[i-nums1.length];
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        if(merged.length%2!=0){
            median=merged[merged.length/2];
        }else{median=(double) (merged[merged.length/2-1]+merged[(merged.length/2)])/2;}

        System.out.println("median = " + median);
        return median;
    }
}
