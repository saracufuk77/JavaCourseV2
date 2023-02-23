package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class task7Ufuk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();

        boolean numOfChar=(str.length())%2==0?false:true;
        System.out.println(numOfChar);

    }
}
