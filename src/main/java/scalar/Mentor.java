package scalar;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User {

    List<Student> students = new ArrayList<>();

    public Mentor(Long id, String name, String email, List<Student> students, String phoneNumber) {
        super(id, name, email, phoneNumber);
        this.students = students;
    }

    @Override
    public String getContact(){
        String contact = super.getContact();
        if(contact==null){
            throw new RuntimeException("contact detials = null");
        }

        return null;
    }
}