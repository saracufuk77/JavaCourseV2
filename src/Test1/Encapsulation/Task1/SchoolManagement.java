package Test1.Encapsulation.Task1;

public class SchoolManagement {
    public static void main(String[] args) {
        School school =new School();
        school.setName("Kabatas");
        school.setPhoneMumber("02122911991");
        school.setEmail("kabatas@gmail.com");
        school.setAddress("Besiktas Istanbul");
        school.setSchoolSize(3);
        school.register(new Student("Mehmet","Aydin"));
        school.register(new Student("ufuk","sarac"));

        System.out.println("school = " + school);
        school.register(new Student("ahmet","oruc"));

        System.out.println(" =================================");
        System.out.println(school.getName());
        System.out.println(school.getAddress());
        System.out.println(school.getPhoneMumber());
        System.out.println(school.getListOfStudents());

    }
}
