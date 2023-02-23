package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

/*Task13
        * Create a string and a number. Convert number to char.
if string contains char, return the character itself.
if string doesn't contain char, return "Character doesn't exist in the string"
        * */
public class task13Ufuk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scan.nextLine();
        System.out.println("enter a number");
        int num =scan.nextInt();

        char numChar=(char)num;
        String numCharS= String.valueOf(numChar);

        String result = (str.contains(numCharS))?numCharS:"character does not exist in the string";
        System.out.println("result = " + result);

//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==numChar)
//                System.out.println(numChar);
//            else System.out.println("character does not exist in the string");
//        }
    }
}
