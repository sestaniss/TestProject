package Class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";
/*
Java executes code from top to bottom but if we have multiple operations on the same lines
it will execute them from left to right
 */
        System.out.println("*******"+firstName+" "+lastName+"*********");
        System.out.println("firstName ="+firstName);
        System.out.println("lastName= " + lastName);

        System.out.println("10"+"10");
        String space= " ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);

    }
}
