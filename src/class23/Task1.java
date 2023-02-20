package class23;

public class Task1 {
    /*
    String
    Scanner
    StringBuffer
    Math
     */
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(100,10);
        cc.calculateInterest();

        Visa v=new Visa(100,10);
        v.calculateInterest();

        AX ax = new AX(100,10);
        ax.calculateInterest();

    }
}
class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest(){
        System.out.println("Interest "+(balance*interest)/100);
    }

}

class Visa extends CreditCard{
    public Visa(double balance, double interest){
        super(balance, interest);
    }
}

class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest "+(balance*interest)/100+50);
    }
}


