package ExerciseTasks.LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea1(height);
        maxArea_tp(height);
    }


    public static int maxArea1(int[] height) {
        int maxArea=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length-1; j > i; j--) {
                maxArea=(Math.min(height[i],height[j]))*(j-i)>maxArea?(Math.min(height[i],height[j]))*(j-i):maxArea;
            }
        }
        System.out.println("maxArea = " + maxArea);
        return maxArea;
    }

    public static int maxArea_tp(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max = Math.min(height[left], height[right]) * (right - left);
        while (left < right) {
            // Move the shorter lines each time
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }

            // update the max area
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
        }
        System.out.println("max = " + max);
        return max;
    }
}
