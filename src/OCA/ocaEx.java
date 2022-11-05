package OCA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ocaEx {

    public static void main(String[] args) {
//        String str="abc";
//        str.concat("element");
//        System.out.println("str = " + str);
        String Date=LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date = " + Date);



    }
}
