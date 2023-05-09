package scalar;

import java.util.List;

public class SMSSender {
    public static void sendSms(List<User> users){
        for(User u: users){
            System.out.println("sending sms to "+ u.phoneNumber);
        }
    }
}
