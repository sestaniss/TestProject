package class16;

public class Task3InClass {
    // Create a method that will print whether given String is palindrome or not.
    /* return type => void
    name => palindrome
    parameters => String input str
     */

    String isPalindrome (String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            return "this string is palindrome";
        } else {
            return "This string is not palindrome";
        }
    }

    public static void main(String[] args) {
        Task3InClass newStr = new Task3InClass();
        System.out.println(newStr.isPalindrome("Kayak"));
    }
}
