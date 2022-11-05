package Test1.Encapsulation.Task1;

import java.util.ArrayList;

public class School {
    private String name;
    private String phoneMumber;
    private String email;
    private String address;
    private int schoolSize;
    private ArrayList<Student> listOfStudents;

    public School() {
        listOfStudents =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneMumber() {
        return phoneMumber;
    }

    public void setPhoneMumber(String phoneMumber) {
        this.phoneMumber = phoneMumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

//    public void register(Student student) {
//        try {
//            while (this.schoolSize<=listOfStudents.size()){
//                this.listOfStudents.add(student);
//        }
//        }catch (RuntimeException e){
//            System.out.println("School size has been exceeded!");
//        }
//    }

        public void register(Student student) {
            if(listOfStudents.size()+1>schoolSize) {
                throw new RuntimeException("School size has been exceeded!");
            }
                this.listOfStudents.add(student);
            }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneMumber='" + phoneMumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", schoolSize=" + schoolSize +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}
