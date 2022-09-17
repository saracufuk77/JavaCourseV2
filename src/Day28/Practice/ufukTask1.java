package Day28.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ufukTask1 {
static ArrayList<String> javamethod ( ArrayList<String> liste){


    for (int i = 0; i < liste.size(); i++) {
        if(liste.get(i).length()<3){
            liste.remove(i);
        }
        i--;

    }

    return liste;
}

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList ("java", "is", "fun", "i", "love", "java"));

//        ufukTask1 ut= new ufukTask1();

//        javamethod(str);
        System.out.println(javamethod(str));
    }
}
