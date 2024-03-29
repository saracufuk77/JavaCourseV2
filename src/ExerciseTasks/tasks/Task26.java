package ExerciseTasks.tasks;

import java.util.HashSet;

public class Task26 {
  /*  Task#25
    Given non-empty array of Integers, every element is repeating except one number, return that number ;*/

    static boolean repeated(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    return true;
                }
            }
        }
     return false;
    }
    static boolean repeated2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 8, 2};
        boolean repeated = repeated2(arr);
        System.out.println(repeated);
    }
}
