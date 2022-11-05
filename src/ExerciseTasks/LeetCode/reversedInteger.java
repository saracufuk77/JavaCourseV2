package ExerciseTasks.LeetCode;

public class reversedInteger {
    public static void main(String[] args) {
        int x = 321;
        //reverse(2147483647);
        reverse2(2147483647);
        System.out.println(Integer.MAX_VALUE);
    }

    public static int reverse(int x) {
        String num = String.valueOf(x);
        StringBuilder sbnum = new StringBuilder(num);
        sbnum.reverse();
        System.out.println("sbnum = " + sbnum);
        int reversed = Integer.parseInt(String.valueOf(sbnum));
        System.out.println("reversed = " + reversed);
        return reversed;
    }

    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        System.out.println("rev = " + rev);
        return rev;
    }
}
