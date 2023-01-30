package homework.homework11;

public class Task2 {
    static String reverseStr (String input){
        StringBuilder st = new StringBuilder(input);
        st.reverse();
        String revSt = st.toString();
        return revSt;

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("Habibi"));
    }
}
