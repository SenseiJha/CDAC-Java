package t28027_Sidhant_A03;


import java.util.Scanner;

public class Reverse_5 {
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

        System.out.println("Array in reverse order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
