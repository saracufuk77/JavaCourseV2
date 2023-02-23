package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class evenOrNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();

        String isEven="";
        isEven=(num!=0)?((num%2==0)?"number is Even":"number is Odd"):"number is zero";

        System.out.println("isEven = " + isEven);
    }
}
