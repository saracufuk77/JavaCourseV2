package Day32.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class day33example {

    public static void main(String[] args) {

        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");


       for (Integer key: errorCodes.keySet()){
           if (errorCodes.get(key).equals("Accepted")){
                errorCodes.put(key,"confirmed");
           }
       }
        System.out.println(errorCodes);

        for (Integer key: errorCodes.keySet()){
            errorCodes.put(key,errorCodes.get(key).toUpperCase());
            }
        System.out.println(errorCodes);



        HashMap<String,Integer> map= new HashMap<>();
        map.put("a",10);
        map.put("b",10);
        map.put("c",10);
        map.put("d",10);
        map.put("e",10);
        map.put("f",10);
        map.put("g",10);

        for (String key: map.keySet()){
            if(key=="a"){
                map.put(key,map.get(key)+10);
                } else if (key.equals("b")){
                    map.put(key,map.get(key)+20);
                }else if(key.equals("c")){
                        map.put(key,map.get(key)+30);
                 } else if(key.equals("d")) {
                            map.put(key, map.get(key) + 40);
                 }else if(key.equals("e")) {
                map.put(key, map.get(key) + 50);
                }else if(key.equals("f")) {
                map.put(key, map.get(key) + 60);
                }else if (key.equals("g")) {
                map.put(key, map.get(key) + 70);
            }

    }
        System.out.println(map);

        HashMap<String, Integer> map1 =  new HashMap<>();
        map1.put("a", 10);
        map1.put("b", 20);
        map1.put("c", 30);
        map1.put("d", 40);
        map1.put("e", 50);
        map1.put("f", 60);
        map1.put("g", 70);

        Set<Map.Entry<String,Integer>> row= new HashSet<>();

}}
