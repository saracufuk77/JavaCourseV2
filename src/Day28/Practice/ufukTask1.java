package Day28.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ufukTask1 {
    public static void main(String[] args) {
        // create a method, which will have as a parameter ArrayList<String>
        // "java", "is", "fun", "i", "love", "java"
        // remove all strings which have less than 3 characters
        // use for loop
        // return ArrayList<String>

        ufukTask1 ut= new ufukTask1();

        ArrayList<String> str = new ArrayList<>(Arrays.asList ("java", "is", "fun", "i", "love", "java"));

        System.out.println(ut.javamethod(str));
    }

     ArrayList<String> javamethod ( ArrayList<String>list){


    for (int i = 0; i < list.size(); i++) {
        if(list.get(i).length()<3){
            list.remove(i);
            i--;
        }
    }

    return list;
}


}
