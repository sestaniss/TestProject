package class8;

public class ContinueKeyWordDemo1{
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            if (i%3==0){
                continue; // skip
            }else {
                System.out.println(i); // lines is never executed when i =3,6,9
                System.out.println("Hello Java");
            }
        }
    }
}
