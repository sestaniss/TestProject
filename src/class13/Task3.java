package class13;

public class Task3 {
    public static void main(String[] args) {


        String dadsName="Samuel";
        String momsName="Tami";
        String expectation="Boy";

        if (expectation.equalsIgnoreCase("boy")){
            String firstHalf=dadsName.substring(0,dadsName.length()/2);
            String secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);

        }
    }
}
