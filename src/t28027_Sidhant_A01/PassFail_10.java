package t28027_Sidhant_A01;


import java.util.Scanner;

public class PassFail_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        if (marks >= 40) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        sc.close();
    }
}
