package LongestIncreasingSubsequence;

public class LongestIncreaseSubsequence {
	public static int findLength(int[] arr) {
		if (arr.length ==0) {
			return 0;
		}
		int len = 1;
		int maxLen = 1;
		for (int i =1; i< arr.length; i++) {
			if(arr[i-1] < arr[i]) {
				len++;
			} else {
				len = 1;
			}
			maxLen = Math.max(len, maxLen);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		int[] arr = {4,56,1,91,81,6,9};
		int len = findLength(arr);
		System.out.println(len);
	}
}
			
		
	

	
		// TODO Auto-generated method stub

	


