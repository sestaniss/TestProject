package class16;

public class Task4InClass {



     /*
    4)Create a method that will say Hello in different language based on the country
     that will pass when method is executed
     name =sayHello
     parameter => String countryName
     */
    String sayHello(String countryName){
        switch (countryName){
            case "usa":
                return "Hello"; //break is not needed when we use the return key word
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4InClass task4 = new Task4InClass();
        System.out.println(task4.sayHello("Italy"));

    }
}
