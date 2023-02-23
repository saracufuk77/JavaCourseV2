package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class task14Ufuk {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();

        String[] arrS= str.split(" ");
        int len=0;
        int index=0;
        for (int i = 0; i < arrS.length; i++) {
            if(arrS[i].length()>len){
                len=arrS[i].length();
                index=i;
            }
        }
        System.out.println("the longest word is: "+arrS[index]);


    }
}
