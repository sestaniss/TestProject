package Class4;

public class NestIfDemo6 {
    public static void main(String[] args) {

        int money = 1000;  //money:1000
        String day = "Sunday"; //day:"Sunday"
        boolean mood = true;  //mood:true

        if (money > 700) {   //money:1000

            if (mood) {    //
                System.out.println("lets go shopping");
            }
        } else {
            System.out.println("lets save some money first");
        }

    }
}

