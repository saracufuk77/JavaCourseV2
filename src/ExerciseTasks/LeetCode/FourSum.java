package ExerciseTasks.LeetCode;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int [] arr={1,0,-1,0,-2,2};
        int tar=0;
        fourSum(arr,tar);

    }
    public static List<List<Integer>> fourSum(int[] nums, int target){
        HashSet<List<Integer>> s =new HashSet<>();
//        List<Integer> arr =new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    for (int l = k+1; l < nums.length ; l++) {
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target && (i!=j && j!=k && k!=l && i!=l)) {
//                            arr.add(0,nums[i]);
//                            arr.add(1,nums[j]);
//                            arr.add(2,nums[k]);
//                            arr.add(3,nums[l]);
                            s.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }
                }
            }
        }
        ArrayList<List<Integer>> arrs = new ArrayList<>(s);
        System.out.println("arr = " + arrs);
        return arrs;
    }
}
