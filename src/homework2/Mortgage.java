package homework2;

public class Mortgage {
    public static void main(String[] args) {
        double rate = 3.5;
        int price = 220000;

        if (rate>4.5) {
            System.out.println("Client will not buy a house");
        }else {
            System.out.println("Client will consider buying");
            if (price>200000){
                System.out.println("client will take a loan");
            }else {
                System.out.println("Client will be paying cash");
            }
        }
    }
}
