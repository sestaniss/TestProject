package class10;

import java.util.Arrays;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        //we can`tt update the elements in for each loop because we don`t have access to the index;
        System.out.println(Arrays.toString(arr));

    }
}
