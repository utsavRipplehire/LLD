package scalar;

import scalar.lld.scalar.SendNotification;

import java.sql.SQLOutput;
import java.util.List;

public class EmailSender implements SendNotification {
    public void emailSender(List<Student> studentList, List<Mentor> mentorList){
        for(Student s: studentList){
            System.out.println("sending email to studentId"+ s.email);
        }
        for(Mentor m: mentorList){
            System.out.println("sending email to mentorList"+ m.email);
        }
    }

    public void emailSenderBetter(List<User> users){
        for(User u: users){
            System.out.println("sending email to studentId"+ u.email);
        }
    }

    @Override
    public void sendNotification(List<scalar.lld.scalar.User> users) {

    }
}
