package homework.homework6;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String [] names={"Tami","Sam","Yulia", "Omid", "Tatiana"};

        System.out.println(names[1]);

        System.out.println("***************");

        String [] names2 = new String [5];

        names2[0]="Tami";
        names2[1]="Sam";
        names2[2]="Yulia";
        names2[3]="Omid";
        names2[4]="Tatiana";


        System.out.println(names2[1]);
    }
    }

