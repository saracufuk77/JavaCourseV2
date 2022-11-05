package ExerciseTasks.LeetCode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = new int[]{3,3,4,2,5,1,7};
        twoSum(arr,6);
        twoSum2(arr,6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }


    /////other approach
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
            System.out.println("map = " + map);
        }


        return new int[]{-1,-1};    // is never reached
    }
}

