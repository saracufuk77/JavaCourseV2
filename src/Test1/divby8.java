package Test1;

import java.util.ArrayList;
import java.util.Random;

public class divby8 {
    public static void main(String[] args) {
        divByEight(20);
    }

    public static ArrayList<Integer> divByEight(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random rnd = new Random();
            list.add(rnd.nextInt(100));
        }
        System.out.println("list = " + list);
        ArrayList newlist= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(list.get(i)%8==0){
                newlist.add(list.get(i));
            }
        }
        int count= newlist.size();
        System.out.println("count = " + count);
        System.out.println("newlist = " + newlist);
        return newlist;
    }
}
