package Test1;

public class deneme {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println(str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase()));

        }

    }

}
