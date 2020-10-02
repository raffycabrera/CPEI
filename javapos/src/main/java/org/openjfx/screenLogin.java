package org.openjfx;


public class screenLogin {
    int UserNumber;
    public int CheckUser(String User, String Pass){
        if (User.equals("admin")){
            if(Pass.equals("1234")){
                UserNumber = 2;
                return 2;
            }
            else{
                return 0;
            }
        }
        else if (User.equals("user1")){
            if(Pass.equals("pass1")){
                UserNumber = 3;
                return 3;
            }
            else{
                return 0;
            }
        }
        else if (User.equals("user2")){
            if(Pass.equals("pass2")){
                UserNumber = 4;
                return 4;
            }
            else{
                return 0;
            }
        }
        else{
            return 1;
        }
    }

    public int UserNumber() { return UserNumber; }
}