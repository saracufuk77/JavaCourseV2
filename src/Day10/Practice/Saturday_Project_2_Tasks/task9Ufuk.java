package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class task9Ufuk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a string: ");
        String str=scan.nextLine();

        System.out.print("Enter a number as an index: ");
        int num= scan.nextInt();

        char result;
        result=(num>str.length())?'0':(str.charAt(num-1));
        System.out.println("result = " + result);
    }
}
