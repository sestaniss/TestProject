package class20;

public class UserClass {
    String name, number;

    UserClass(String name, String number){
        this.name=name;
        this.number=number;
    }

}

class UserInfo extends UserClass {
    String address;

    UserInfo(String name, String number, String address){
        super (name, number);
        this.address=address;
    }

    void userDetails () {
        System.out.println("Name: "+name+", mobile number: "+number+", address: "+address);
    }
}


