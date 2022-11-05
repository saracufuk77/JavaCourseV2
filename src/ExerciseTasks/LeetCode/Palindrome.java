package ExerciseTasks.LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        String str="savas";
        palindrome(str);
    }
    public static void palindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        System.out.println(str);
        System.out.println(sb.reverse());
        String rev= String.valueOf(sb.reverse());
        if(rev.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
