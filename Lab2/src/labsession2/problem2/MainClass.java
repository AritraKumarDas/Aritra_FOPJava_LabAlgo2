package labsession2.problem2;

import java.util.Scanner;

// Driver MainClass
public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Size of currency denominations must be atleast 1");
			sc.close();
			return;
		}

		int[] denoms = new int[n];
		int[] noOfNotes = new int[n];

		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < n; i++) {
			denoms[i] = sc.nextInt();      // Denominations input from user

			if (denoms[i] <= 0) {          // Invalid denomination check
				System.out.println("Sorry, Currency Denomination of 0 or -ve value not allowed. Try again!");
				sc.close();
				return;
			}
		}

		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		CurrencyDenominations ob = new CurrencyDenominations();

		ob.sortDenoms(denoms); // calling method to sort denominations array

		ob.tenderNotes(denoms, amount, noOfNotes); // method to calculate notes to tender the amount

		sc.close();

	}

}
