package homework.Project2;

public abstract class Marks {

    abstract void getPercentage();
}
class StudentA extends Marks {
    int mathGrade;
    int historyGrade;
    int geographyGrade;

    StudentA(int historyGrade, int mathGrade, int geographyGrade) {
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.geographyGrade = geographyGrade;
    }

    void getPercentage() {
        int averageGrade = (historyGrade + mathGrade + geographyGrade) / 3;
        if (averageGrade >= 90) {
            System.out.println("Student A's average mark is A");
        } else if (averageGrade >= 80 && averageGrade < 90) {
            System.out.println("Student A's average mark is B");
        } else if (averageGrade >= 70 && averageGrade < 80) {
            System.out.println("Student A's average mark is C");
        } else if (averageGrade >= 50 && averageGrade < 70) {
            System.out.println("Student A's average mark is D");
        } else {
            System.out.println("Student A's average mark is F");
        }

    }
}

class StudentB extends Marks {
    int mathGrade;
    int historyGrade;
    int geographyGrade;
    int englishGrade;

    StudentB(int historyGrade, int mathGrade, int geographyGrade, int englishGrade) {
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.geographyGrade = geographyGrade;
        this.englishGrade= englishGrade;
    }

    void getPercentage() {
        int averageGrade = (historyGrade + mathGrade + geographyGrade + englishGrade) / 4;
        if (averageGrade >= 90) {
            System.out.println("Student B's average mark is A");
        } else if (averageGrade >= 80 && averageGrade < 90) {
            System.out.println("Student B's average mark is B");
        } else if (averageGrade >= 70 && averageGrade < 80) {
            System.out.println("Student B's average mark is C");
        } else if (averageGrade >= 50 && averageGrade < 70) {
            System.out.println("Student B's average mark is D");
        } else {
            System.out.println("Student B's average mark is F");
        }

    }
}

