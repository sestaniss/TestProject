package Class3;

public class ifElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){
            System.out.println("Male");
        }
        String name="Nat";
        // with non-primitive data types such as String we can`t use == symbol if (name=="Sam") ! means not so it could
        // change true to false or false to true

        if(!name.equals("Sam")){
            System.out.println("Super Amazing student");
        }
    }
}
