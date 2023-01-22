package homework7;

public class Task3 {
    public static void main(String[] args) {

        String [][] students={{"Tami","Sam","Emy","Ro"},
                                {"A", "B", "B", "C"}
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals("A") || students[i][j].equals("B")){
                    System.out.println(students[0][j]);
                }
            }
        }
















    }
}
