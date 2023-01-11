package class6;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        String country="Egypt";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ // converts the text to lowercase EGYPT=>egypt

            case "egypt":
                System.out.println("Koshary");
                break;
            case "italy":
                    System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");




        }

    }
}
