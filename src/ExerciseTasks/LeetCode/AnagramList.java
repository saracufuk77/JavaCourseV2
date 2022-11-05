package ExerciseTasks.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramList {
    public static void main(String[] args) {
        char[] newStr="ufuk".toCharArray();
        //System.out.println("newStr = " + Arrays.toString(newStr));
        String []strings = {"eat", "tea","nat","ate","bat","tan"};
        anagramList(strings);
    }

    public static void anagramList(String[] str){
        ArrayList<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] newStr=str[i].toCharArray();
            Arrays.sort(newStr);
            String sorted=new String(newStr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str[i]);
        }

        //System.out.println("newStr = " + Arrays.toString(newStr));
        System.out.println("map = " + map);
        list.addAll(map.values());
        System.out.println("list = " + list);

    }



    }

