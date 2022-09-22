package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day31task1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7,9,11));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,7,8,0,12));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(21,3,6,-33,6,5,9,2,3,4,5,0));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        Integer arrayLists = maxnum(listOfLists);
        System.out.println(arrayLists);


    }

    static Integer maxnum(ArrayList<ArrayList<Integer>> listOfList) {
        Integer maxnum = 0;
        for (int row = 0; row < listOfList.size(); row++) {
            for (int column = 0; column < listOfList.get(row).size(); column++) {
                maxnum = Collections.max(listOfList.get(row));
            }
        }
        return maxnum;
    }
}
