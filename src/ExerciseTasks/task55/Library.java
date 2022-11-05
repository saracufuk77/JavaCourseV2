package ExerciseTasks.task55;

import java.util.ArrayList;

public class Library{
    static final ArrayList<Book> list=new ArrayList<>();

    static {
       list.add(new Book("Nutuk","Ataturk",1923));
       list.add(new Book("Tutunamayanlar","Oguz Atay",1995));
       list.add(new Book("Sonsuz Nur","Fethullah Gulen",1992));
    }

    public static Book oldestBook(ArrayList<Book> list){
        int max=9999;
        Book oldest = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).year<max){
                max=list.get(i).year;
                 oldest=list.get(i);
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        System.out.println(oldestBook(list));
    }
}

