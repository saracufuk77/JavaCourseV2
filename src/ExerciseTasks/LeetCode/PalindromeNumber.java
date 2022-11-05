package ExerciseTasks.LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000000001));
    }


    public static boolean  isPalindrome(int x){
        int sum=0;
        int rem;
        int temp=x;
        while (temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        if(x==sum){
            return true;
        }else return false;
    }
}
