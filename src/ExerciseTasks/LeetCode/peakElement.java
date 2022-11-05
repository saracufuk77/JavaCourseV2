package ExerciseTasks.LeetCode;

public class peakElement {
    public static void main(String[] args) {
        int[] arrr = {9,2,1,3,5,6,4};
        peakElementIndex(arrr);

    }

    public static int peakElementIndex(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("max = " + left);
        return left;
    }
}
