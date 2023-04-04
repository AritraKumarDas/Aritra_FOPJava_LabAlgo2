package labsession2.problem1;

public class TargetAchievement {
	
	// calculates the number of transactions required to meet the target
	public int checkTargetAchievement(int[] arr, int target) {

		int numberOfTransactions = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum >= target) {
				numberOfTransactions = i + 1;
				break;
			}
		}
		return numberOfTransactions;
	}
}