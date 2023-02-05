package class19;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=654646532168888l;
        ba.money=100000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("-- Creating an object of Checking account---");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        //features from checking account itself
        check.interest=0;

        check.deposit();//from parent
        check.transfer();//from child

        System.out.println("-- Creating an object of Savings account---");

        Savings save=new Savings();
        save.accountNumber=654646532168888l;
        save.money=7657;
        save.profit=100;
        //save.interest=0; siblings features are not available
        save.deposit(); // from parent
        save.takeProfit(); //comes from savings
        //save.transfer(); not available

        //finish creating SuperSavings object and see which feature available to that class
        SuperSavings superSave=new SuperSavings();
        superSave.accountNumber=546843867415l;
        superSave.money=10000;
        superSave.profit=2000;
        superSave.deposit();
        superSave.takeProfit();
        // superSave.transfer(); not available
        superSave.superSaving();

    }

}
