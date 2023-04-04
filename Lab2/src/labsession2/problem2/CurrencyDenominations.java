package labsession2.problem2;

public class CurrencyDenominations {

	// method for sorting denominations array in descending order .
	public void sortDenoms(int[] arr) {
		
		// implementing insertion sort technique
		for (int i = 1; i < arr.length; i++) {  
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	// calculating number of notes for each denomination that needs to be tendered
	public void tenderNotes(int[] denoms, int amount, int[] noOfNotes) {

		int i = 0;

		while (amount > 0 && i < denoms.length) {

			noOfNotes[i] = amount / denoms[i];   // calculating notes of current denomination
			amount = amount % denoms[i];		 // calculating remaining balance
			i++;

		}

		if (amount > 0) {
			System.out.println("Not enough denominations to tender");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			for (int j = 0; j < denoms.length; j++) {
				if (noOfNotes[j] > 0) {

					System.out.println(denoms[j] + " : " + noOfNotes[j]);
				}
			}
		}
	}
}
