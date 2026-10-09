package t28027_Sidhant_A03;


import java.util.Scanner;

public class PositiveNegative_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zeros = 0;

        System.out.print("Positive numbers: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Negative numbers: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            } else if (arr[i] == 0) {
                zeros++;
            }
        }

        System.out.println();
        System.out.println("Zero values: " + zeros);

        sc.close();
    }
}
