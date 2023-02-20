package class25;

public interface Washable{
    void wash(); // by default public abstract, no need to type
}

 class SmartWatch implements Washable {
    public void wash(){
        System.out.println("You can wash this smartwatch without any issues");
    }
}

class Phone implements Washable{
  public   void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
class Inverter implements Washable{
    public void wash (){
        System.out.println(" I am IP65 Rated you can wash me");
    }
}


