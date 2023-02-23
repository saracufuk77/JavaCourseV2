package Day2.Java;

import java.util.Arrays;
import java.util.Random;

public class sil {
    public static void main(String[] args) {
        double num=3.14;
        System.out.println("num= "+num);
        num=(float)num;
        System.out.println("num = " + num);


        String num3="123";
        System.out.println(num3+num+"ufuk");
        int num4=Integer.parseInt(num3);
        System.out.println(num4*2);
        double num5=Double.parseDouble(num3);
        System.out.println("num5 = " + num5);
        System.out.println("*********************");
        String str="                         ufuk bu   7   gun mehmet ali     nin yanin a gitmek isted    i ama gun uygun gun degildi.      ";
        System.out.println(str.trim());
        System.out.println(str.trim().replaceFirst("gun", "GUN"));
        String[] splitA = str.trim().split("7");
        System.out.println(Arrays.stream(splitA).toList());
        System.out.println(Arrays.toString(splitA));
        System.out.println("***********************");

        int i=12;
        int j=13;

        System.out.println(Math.abs(i));
        System.out.println(Math.max(i,j));

        double sayi = 13.844295422;
        System.out.println(Math.round(sayi));
        double sayi2=Math.round(sayi*100.0)/100.0;
        System.out.println(sayi2);

        // Declaring and initializing double number
        double number = 12.983665;

        // Getting the number of decimal places required
        int n = 3;

        number = Math.round(number * Math.pow(10, n))
                / Math.pow(10, n);

        System.out.println("number = " + number);

        System.out.println(Math.round(Math.random()*100.0)/100.0);
        Random rand= new Random();
        int a= rand.nextInt(100);
        System.out.println("a = " + a);

        String mesaj=(i>j)?"buyukmus":"kucukmus";
        System.out.println("mesaj = " + mesaj);

        if(i>j){
            System.out.println("buyuk");
        }
        else {
            System.out.println("kucuk");
        }

        for (int k = 1; k <= 10; k++) {

            if(k==5){
                continue;}
            System.out.print(k+" ");
        }



    }
}
