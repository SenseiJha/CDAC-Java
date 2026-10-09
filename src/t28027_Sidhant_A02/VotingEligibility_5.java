package t28027_Sidhant_A02;


import java.util.Scanner;

public class VotingEligibility_5 {
    static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (isEligible(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        sc.close();
    }
}
