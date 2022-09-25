package Day33.Practice;

import java.util.HashMap;

public class day34task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        printit(map);
        addit(map);


    }

    static void printit(HashMap<String,Integer> map1){
    map1.keySet().forEach((k)-> System.out.println(k+"="+map1.get(k)));
    }

    static void addit(HashMap<String,Integer> map1){
        map1.keySet().forEach((k)-> {
            switch (k){
                case "a": map1.put(k,map1.get(k)+10); break;
                case "b": map1.put(k,map1.get(k)+20); break;
                case "c": map1.put(k,map1.get(k)+30); break;
                case "d": map1.put(k,map1.get(k)+40); break;
                case "e": map1.put(k,map1.get(k)+50); break;
                case "f": map1.put(k,map1.get(k)+60); break;
                case "g": map1.put(k,map1.get(k)+70); break;
            }
        });
        System.out.println(map1);
    }
}
