package homework.homework9;

public class Task4 {
    public static void main(String[] args) {

        /*StringBuilder st=new StringBuilder("This is sentence I want to reverse");
        System.out.println(st.reverse());
        String str=st.toString(); //converting a StringBuilder to String so that we can call methods from String
        str.sp*/

        String str="This is sentence I want to reverse";
        String [] arr=str.split(" ");

        for (String word:arr) {
            for (int i = word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");
        }

        for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println(" ");
        }

        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");

        }


    }
}
