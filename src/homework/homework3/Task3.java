package homework.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your scores for quiz, midterm and final exam");
        int quiz = input.nextInt();
        int midterm = input.nextInt();
        int finalExam = input.nextInt();

        int averageScore = (quiz + midterm + finalExam) / 3;

        if (averageScore >= 90) {
            System.out.println("Grade A");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("Grade B");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("Grade C");
        } else if (averageScore < 50) {
            System.out.println("Grade F");
        }


    }
}
