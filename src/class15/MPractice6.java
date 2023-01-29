package class15;

public class MPractice6 {

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
    }

    public static void main(String[] args) {
        MPractice6 mp = new MPractice6();
        System.out.println(mp.createEmail("Sam","Estaniss","gmail"));
    }
}
