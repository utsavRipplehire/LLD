package scalar.lld.scalar;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User{

    List<Student> students = new ArrayList<>();

    public Mentor(Long id, String name, String email, List<Student> students, String phoneNumber) {
        super(id, name, email, phoneNumber);
        this.students = students;
    }


}