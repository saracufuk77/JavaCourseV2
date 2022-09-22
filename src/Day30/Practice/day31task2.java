package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day31task2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> listOfLists = new ArrayList<ArrayList<Character>>();

        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('c','a','d'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('z','y'));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('m','s','r'));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

//        List<Character> arrayLists = sortedChars(listOfLists);
//        System.out.println(arrayLists);

    }


//    static List<Character> sortedChars(ArrayList<ArrayList<Character>> listOfList) {
//        List<Character> liste=new ArrayList<>();
//        for (ArrayList<Character> characters : listOfList) {
//            for (int row = 0; row < listOfList.size(); row++) {
//                for (int column = 0; column < listOfList.get(row).size(); column++) {
//                    liste.addAll(Arrays.asList(listOfList.get(row).get(column)));
//                }
//            }
//        }
//        Arrays.sort(liste);
//        System.out.println(liste);
//
//        return liste;
    }

