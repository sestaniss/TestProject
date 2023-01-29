package homework.homework10;

public class Task4 {
    /*
    4)Create a method that will say Hello in different language based on the country
     that will pass when method is executed
     */

    String hello (String country){
        switch (country){
            case "Egypt":
                return "Ahlan w Sahlan";
            case "Russia":
                return "Privet";
            case "Italy":
                return "Ciao";
            case "Mexico":
                return "Hola";
            case "France":
                return "Salut";
            default:
                return "Invalid country";
        }
    }

    public static void main(String[] args) {
        Task4 greetings = new Task4();
        System.out.println(greetings.hello("Spain"));
    }
}
