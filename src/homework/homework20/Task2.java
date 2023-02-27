package homework.homework20;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    2) Create a Person class with following private fields: name, lastName, age, salary.
       Variables should be initialized through constructor.
       Inside the class also create a method to print user details.
       In Test Class create a Map that will store key in ascending order.
       In that map store personId and a Person Object. Print each object details.
     */
    public static void main(String[] args) {
        Map<Integer,Person> usersMap= new TreeMap<>();

        usersMap.put(420, new Person("Sam", "Estaniss", 34, 250000));
        usersMap.put(422, new Person("Tami", "E", 25, 210000));
        usersMap.put(440, new Person("Asghar", "Nazir", 29, 375000));
        usersMap.put(448, new Person("Abeera", "Vibes", 26, 190000));

        var users=usersMap.entrySet();
        for(var user:users){
            System.out.print(user.getKey()+" : ");
            user.getValue().Details();
        }

    }
}
class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    public Person(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void Details(){
        System.out.println("Employee name is "+firstName+" "+lastName+" age is "+age+" and Salary is "+salary);
    }

}