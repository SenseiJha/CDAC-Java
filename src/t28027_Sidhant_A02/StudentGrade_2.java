package t28027_Sidhant_A02;


import java.util.Scanner;

public class StudentGrade_2 {
    static char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else {
            System.out.println("Grade = "
                               + calculateGrade(marks));
        }

        sc.close();
    }
}
