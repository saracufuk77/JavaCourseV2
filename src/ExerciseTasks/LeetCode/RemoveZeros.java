package ExerciseTasks.LeetCode;

import java.util.ArrayList;

public class RemoveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,0,15,0,0,21};
        removeZeros(arr);

    }
    public static ArrayList<Integer> removeZeros(int[] arr){
        int counter=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                counter++;
            }else {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < counter; i++) {
            list.add(0);
        }
        System.out.println("list = " + list);
        return list;
    }





}
