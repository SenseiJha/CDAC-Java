package t28027_Sidhant_A03;


import java.util.Scanner;

public class Duplicate_6 {
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

        System.out.println("Duplicate elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyChecked = false;

            // Check if this value appeared earlier.
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Check whether this value appears again.
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements.");
        }

        sc.close();
    }
}
