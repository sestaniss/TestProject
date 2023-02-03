package homework.homework12;

public class Task4 {
    /*
    Write program that have static constructor and observe result.
     */

    String name;
    int age;

    /* error => static keyword is not allowed with constructor:
    static Task4 (String playerName, int playerAge){
        name=playerName;
        age=playerAge;
    }
     */



    void printInfo () {
        System.out.println(name+" is "+age+" years old");
    }
}
