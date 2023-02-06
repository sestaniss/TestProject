package class20;

public class BaseClass {

    String name="Tami";

    void  hello(){
        System.out.println("Hello method from Base");
    }
}

class Child extends BaseClass{

    String name="Sam";

    void callMe(){

        System.out.println(name);//Sam
        System.out.println(super.name);//Tami
    }

    void hello(){
        System.out.println("Hello method from ChildClass");
    }

    void callingParentMethod(){
              hello();
        super.hello();
    }
}
