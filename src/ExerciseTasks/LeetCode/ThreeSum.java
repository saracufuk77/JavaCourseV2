package ExerciseTasks.LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4,3,1,-2};
        threeSum(nums);
        threeSum2(nums);
    }
    public static ArrayList<List<Integer>> threeSum(int[] nums){
        HashSet<List<Integer>> temp = new HashSet<>();
        Arrays.sort(nums); //dublicatelerden kurtulmak icin
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1 ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    List<Integer> karr=new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0 && (i!=j && j!=k)){
                        temp.add(Arrays.asList(nums[i],nums[j],nums[k]));
                       // System.out.println("temp = " + temp);
                    }
                }
            }
        }
        ArrayList<List<Integer>> arr = new ArrayList<>(temp);
        System.out.println("arr = " + arr);
        return arr;
    }

    ///Other approach
    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int newTarget = 0 - nums[i] - nums[j];
                if (set.contains(newTarget)) {
                    ans.add(Arrays.asList(nums[i], newTarget, nums[j]));
                }
                else set.add(nums[j]);
            }
        }
        System.out.println("ans = " + ans);
        return new ArrayList(ans);
    }

}



