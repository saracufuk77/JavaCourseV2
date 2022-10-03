package Day34.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class task2 {

    public Map<String, String> firstChar(String[] strings) {
        HashMap<String,String> map=new HashMap<>();
        for(String str: strings){
            map.getOrDefault(String.valueOf(str.charAt(0)),("")+str);
        }

        return map;
    }

}
