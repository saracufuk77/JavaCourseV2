package Test1.exceptinHandling;

import com.sun.source.tree.BreakTree;

public class array1 {
    public static void main(String[] args) {
        int[] arr={2,3,6};
        myMethod(arr);
    }


    public static boolean myMethod(int [] arr){
        boolean result= false;
        int product=1;
        for (int i=0; i<arr.length; i++){
            for (int w: arr){
                product= product*w;
            }
            if (arr[i]== product/ arr[i]){
                result=true;
            }{
                product=1;
            }
        }
        System.out.println("result = " + result);

        return result;
    }
}
