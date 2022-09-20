package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class day30task2 {

    public static void main(String[] args) {

        int[][] arr=new int[3][4];

        ArrayList<ArrayList<String>> listoflists = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("istanbul","Kocaeli","Sakarya","Edirne"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("ordu","samsun","trabzon","Kastamonu","Sinop"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Van","Mus","bingol","Erzurum"));

        listoflists.add(list1);
        listoflists.add(list2);
        listoflists.add(list3);


        System.out.println(listoflists);
        System.out.println(camelCase(listoflists));
        System.out.println();


    }

    static ArrayList<ArrayList<String>> camelCase (ArrayList<ArrayList<String>> listoflistStr) {
        for (int row = 0; row < listoflistStr.size(); row++) {
            for (int column = 0; column < listoflistStr.get(row).size(); column++) {

                String firstLetter=listoflistStr.get(row).get(column).substring(0,1).toUpperCase();
                String others=listoflistStr.get(row).get(column).substring(1).toLowerCase();
                listoflistStr.get(row).set(column,firstLetter+others);
            }
        }
        return(listoflistStr);
    }
}
