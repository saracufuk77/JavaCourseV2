package Day49.SaturdayProject.UfukSaturdayPTask2;

import java.time.LocalDateTime;

public class User {
    public String name;
    LocalDateTime registrationtime;

    public User(String name) {
        this.name = name;
        registrationtime=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
