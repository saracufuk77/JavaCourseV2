package Test1;

import java.time.LocalDate;
import java.time.Month;

public class dersAlistirma {
    public static void main(String[] args) {
        String[] arr = {"ufuk","omer","oruc"};
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds exception");
        }

    }

}
