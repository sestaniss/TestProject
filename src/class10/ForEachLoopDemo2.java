package class10;
/*
Limitations of foreach loop

 */
public class ForEachLoopDemo2 {
    public static void main(String[] args) {

         int[] arr={10,13,20,25,45,50};
         arr[1]=0;
         //print only the odd numbers from this array with the help of normal loop

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }
        //Replace all the odd numbers in this array with the help of normal loop

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0) {
                arr[i]=0;
            }
        }
        System.out.println("After replacing all odd numbers with zeros");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
