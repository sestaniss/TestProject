package class8;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j < 5 ; j++){ // inner for loop
                if (j==1||j==2){
                    continue;
                }
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
