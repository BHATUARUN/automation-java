package test;
import java.util.Scanner;

public class assignq30{
    static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81) {
            System.out.println("Grade: AB");
        } else if (marks >= 71) {
            System.out.println("Grade: BB");
        } else if (marks >= 61) {
            System.out.println("Grade: BC");
        } else if (marks >= 51) {
            System.out.println("Grade: CD");
        } else if (marks >= 41) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        displayGrade(marks);

        sc.close();
    }
}