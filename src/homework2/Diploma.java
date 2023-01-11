package homework2;

public class Diploma {
    public static void main(String[] args) {
        boolean diploma = true;
        double gpa = 3.8;

        if (diploma) {
            System.out.println("Congratulations");
            if (gpa>=3.5){
                System.out.println("You are eligiable of a scholarship");
            }else {
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
