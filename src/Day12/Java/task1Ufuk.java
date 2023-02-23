package Day12.Java;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Scanner;

/*
        using scanner, create a number and convert character.
        using switch statement, print months of a year.
        Example:
        1 - January
        2 - February
        etc...
        if character is not within 1-12, return wrong input

         */
public class task1Ufuk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for the month");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("ay icin gecersiz sayi");
        }
    }
}
