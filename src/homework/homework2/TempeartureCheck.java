package homework.homework2;

public class TempeartureCheck {
    public static void main(String[] args) {
        int temp = 38;
        if (temp < 32){
            System.out.println("water will freeze with temperature "+temp);
        }else {
            System.out.println("water will not freeze with temperature "+temp);
        }
    }
}
