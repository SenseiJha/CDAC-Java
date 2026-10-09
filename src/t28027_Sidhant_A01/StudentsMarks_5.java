package t28027_Sidhant_A01;


import java.util.Scanner;

public class StudentsMarks_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double average = total / 3;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
