package scalar.lld.scalar;

import java.util.ArrayList;
import java.util.List;

public class User {
    Long id;
    String name;
    String email;

    public User(Long id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public int method(Integer x){
        return 0;
    }
    public int method(int x){
        return 0;
    }
    public User (){}
    public void printDetails(){
        System.out.println(name+" "+ email );
    }


    String phoneNumber;
}
