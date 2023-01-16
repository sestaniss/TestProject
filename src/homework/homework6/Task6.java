package homework.homework6;

public class Task6 {
    public static void main(String[] args) {

        String [] countries={"Egypt","Greece","Italy", "France", "Japan"};
        String capital;

        for (int i = 0; i < countries.length ; i++) {

            switch (countries[i]){
                case"Egypt":
                    System.out.println("Cairo");
                  break;

                case"Greece":
                    System.out.println("Athens");
                    break;

                case"Italy":
                    System.out.println("Rome");
                    break;

                case"France":
                        System.out.println("Paris");
                        break;

                case"Japan":
                    System.out.println("Tokyo");
                    break;


            }

            }

        }

    }


