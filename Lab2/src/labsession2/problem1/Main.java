package labsession2.problem1;

import java.util.Scanner;

//Driver class Main
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner instance initialized

		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();

		if (size <= 0) { // Transaction Array of size 0 or negative value not allowed
			System.out.println("Transaction Array Size must be atleast 1");
			sc.close();
			return;
		}

		int arr[] = new int[size];
		System.out.println("Enter the values of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int numberOfTargets = sc.nextInt();

		TargetAchievement ob = new TargetAchievement(); // Instance created for TargetAchievement class

		for (int i = 0; i < numberOfTargets; i++) {

			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();

			// calling method to calculate no of transactions required to meet the target
			int noOfTransactions = ob.checkTargetAchievement(arr, target);

			if (noOfTransactions > 0) {
				System.out.println("Target achieved after " + noOfTransactions + " transactions\n");
			} else {
				System.out.println("Given target is not achieved\n");
			}

		}

		sc.close(); // scanner instance closed preventing resource leak
	}
}
