package ExerciseTasks.LeetCode;

public class DivideTwoIntegers {
    public static void main(String[] args) {

        divide(-2147483648,2);

    }
    public static int divide(int dividend, int divisor){
        int counter=0;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if(dividend==-2147483648){
            dividend=-2147483647;
            counter=1;
        }
        int a=Math.abs(dividend);
        int b=Math.abs(divisor);

        while (a>=b){
            a-=b;
            counter++;
        }
        if((dividend<0 || divisor<0) &&!(dividend<0 && divisor<0)){
            counter=0-counter;
        }
        System.out.println("counter = " + counter);
        return counter;
    }

}
