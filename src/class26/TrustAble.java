package class26;

public interface TrustAble {
  public static final int age=10; //Constant -> things that value should not change

 String color= "blah blah blah";
 int trust();

 static void method1(){
     System.out.println("Hello World");
   }

   default void method2(){

   }
   private void method3(){

   }

  }
class Bank implements TrustAble{
    @Override
    public int trust(){
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}
