package homework.Project1;

public class Task11 {
    public static void main(String[] args) {

        String[] arr = {"David", "John", "Tami", "David", "Maged", "Soso", "Maged"};

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i].equals(arr[j])) && (i != j) )
                {
                    System.out.println("The duplicate name is: "+arr[j]);
                }
            }
        }



















    }
}
