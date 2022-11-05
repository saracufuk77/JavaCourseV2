package ExerciseTasks.LeetCode;

import java.util.Arrays;

public class FindFirstLastPositionElementSortedArray {
    /*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
Input: nums = [5,7,7,8,8,10,11], target = 8
Output: [3,4]
     */
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int tar=8;

        searchRange(arr,tar);
    }

    public static int[] searchRange(int[] nums, int target){
        int [] arr=new int[2];
        int first=-1;
        int last=-1;
        int left=0;
        int right= nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[left] == target) {
                first = left;
                break;
            }
            left++;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(nums[right]==target){
                last= right;
                break;
            }
                right--;
        }
        arr[0]=first;
        arr[1]=last;
        System.out.println("arr = " + Arrays.toString(arr));
        return arr;
    }
}
