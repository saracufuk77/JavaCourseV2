package Day34.Practice;

import java.util.Map;

public class task3 {
    public static void main(String[] args) {

    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.get("a")==null || map.get("b")==null){
            return map;
        }
        if(map.get("a").length()>map.get("b").length()){
            map.putIfAbsent("c",map.get("a"));
        } else if (map.get("b").length()>map.get("a").length()) {
            map.putIfAbsent("c", map.get("b"));
        }else {
            map.replace("a","");
            map.replace("b","");
        }
        return map;

    }
}
