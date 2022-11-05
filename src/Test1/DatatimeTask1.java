package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DatatimeTask1 {

    @Test
    public void datetask() {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        today = today.plusYears(10).plusMonths(5);
        System.out.println("future = " + today);
        LocalDate exp = today.parse("2033-03-14");
        Assert.assertEquals(today, exp);
    }

    @Test
    public void age() {
        LocalDate today = LocalDate.now();
        today = today.minusYears(1977);
        int age = today.getYear();
        System.out.println("age = " +age);
        Assert.assertEquals(age, 45);
    }

    @Test
    public void userTime() {
        System.out.println("Please enter a time with the format HH:mm:ss");
        Scanner scan = new Scanner(System.in);
        String usertime=scan.nextLine();
        LocalTime usertime1 = LocalTime.parse(usertime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("usertime = " + usertime1);
        LocalTime mytime = LocalTime.now();
        System.out.println("now = " + mytime);
        boolean isPast=true;
        Duration diff = Duration.between(mytime,usertime1);
        if(diff.isNegative()){
            isPast=false;
            System.out.println("Time is past");
        }else System.out.println(" Time is future");

    }

    public static void main(String[] args) {
        System.out.println("Please enter a time with the format HH:mm:ss");
        Scanner scan = new Scanner(System.in);
        String usertime=scan.nextLine();
        LocalTime usertime1 = LocalTime.parse(usertime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("usertime = " + usertime1);
        LocalTime mytime = LocalTime.now();
        System.out.println("now = " + mytime);
        boolean isPast=true;
        Duration diff = Duration.between(mytime,usertime1);
        if(diff.isNegative()){
            isPast=false;
            System.out.println("Time is past");
        }else System.out.println(" Time is future");

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(6,20,2014));

    }
}
