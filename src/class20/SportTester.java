package class20;

public class SportTester {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket","Pakistan","Green helmet");
        crick.display();

        Soccer soc=new Soccer("Soccer", "Argentina", "Oliver`s", 12);
        soc.display();
        soc.displayTeam();
    }
}



