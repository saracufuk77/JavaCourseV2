package Day34.Practice;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;
import java.util.Map;

public class Day35task1 {
    public static void main(String[] args) {

    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
    if ((map.get("a") != null) && (map.get("b") == null)){
        map.put("a",map.get("b"));
    }else if((map.get("a") == null) && (map.get("b") != null)){
        map.put("b",map.get("a"));
    }else if((map.get("a") != null) && (map.get("b") != null)){
        return map;
    }
        return map;
    }
}


