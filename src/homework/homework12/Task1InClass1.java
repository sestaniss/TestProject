package homework.homework12;

public class Task1InClass1 {
    private Task1InClass1(){
        System.out.println("Constructor without any parameters");
    }

    Task1InClass1(String name){
        System.out.println("Constructor with a String as parameter");
    }

    protected Task1InClass1(int number){
        System.out.println("Constructor with an int as parameter");
    }

    public Task1InClass1(char c){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Task1InClass1 task1InClass1 =new Task1InClass1();
        Task1InClass1 task2=new Task1InClass1("Java");
        Task1InClass1 task3=new Task1InClass1(1000);
        Task1InClass1 task4=new Task1InClass1('G');
    }

}
