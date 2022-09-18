package Day29.Practice;

public class methodPractise1 {
    public static void main(String[] args) {
        methodPractise1 mp=new methodPractise1();

        System.out.println("sonuc= "+mp.maho(5,8,2));

    }
    int maho(int a, int b, int c){
        int sonuc = a*b/c;
        return sonuc;
    }



}
