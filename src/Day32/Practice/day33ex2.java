package Day32.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class day33ex2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));


        day33ex2 uf=new day33ex2();
        uf.totalComp(compensation);
    }

    HashMap<String, ArrayList<Integer>> totalComp(HashMap<String, ArrayList<Integer>> map1){
        HashMap<String,Integer> toplam=new HashMap<>();
        for (Map.Entry<String ,ArrayList<Integer>> person: map1.entrySet()){
//            System.out.println(person.getKey()+" "+person.getValue());
            int total=0;
            for (int i = 0; i < person.getValue().size(); i++) {
                total+=person.getValue().get(i);
            }
            toplam.put(person.getKey(),total);
        }
        System.out.println("toplam = " + toplam);
        return map1;
    }
}
