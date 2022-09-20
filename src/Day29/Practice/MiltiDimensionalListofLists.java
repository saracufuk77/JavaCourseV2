package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MiltiDimensionalListofLists {
    public static void main(String[] args) {

        int[][] arr=new int[3][4];

        ArrayList<ArrayList<String>> listoflists = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Istanbul","Kocaeli","Sakarya","Edirne"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Ordu","Samsun","Trabzon","Kastamonu","Sinop"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Van","Mus","Bingol","Erzurum"));

        listoflists.add(list1);
        listoflists.add(list2);
        listoflists.add(list3);

        for (ArrayList<String> listoflist : listoflists) {
            for (String s : listoflist) {
                System.out.print(s+" ");
            }
            System.out.println();
        }


    }
}
