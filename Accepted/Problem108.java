package easy;
import java.util.Scanner;

public class Problem108 {

	static int[][] matrix;
	static int[] cumulativeSum;
	
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		while(input.hasNext()) {
			int n = input.nextInt();
			cumulativeSum = new int[n];
			matrix = new int[n][n];
			
			for(int x=0; x<n; x++) {
				for(int y=0; y<n; y++) {
					matrix[x][y] = input.nextInt();
				}	
			}
			
			int maxSum = Integer.MIN_VALUE;
			int result = 0;
			for (int row = 0; row < matrix.length; row++) {
				
				for(int val = 0; val<n; val++) {
					cumulativeSum[val] = 0;
				}
				
				for (int innerLoop = row; innerLoop < matrix[row].length; innerLoop++) {
					calculateCumulativeSum(innerLoop);
					result = maxSum(cumulativeSum, 0, cumulativeSum.length-1);
					if (result > maxSum) {
						maxSum = result;
					}

				}
			}
			System.out.println(maxSum);
		}
		input.close();
	}
	

	public static int[] calculateCumulativeSum(int i) {
		int length = matrix[i].length;
		for (int x = 0; x < length; x++) {
			cumulativeSum[x] = cumulativeSum[x] + matrix[i][x];
		}
		return cumulativeSum;
	}

	private static int maxSum(int[] arr, int low, int high) {
		if( low == high ) {
			return arr[high];
		}
		
		int mid = (low + high)/2;

		int leftSum = maxSum(arr, low, mid);
		int rightSum = maxSum(arr, mid+1, high);
		int crossSum = crossSum(arr, low, mid, high);
		
		int max =  Math.max(leftSum, Math.max(rightSum, crossSum));
		return max;
	}
	
	private static int crossSum(int[] arr, int low, int mid, int high) {
		int sum = 0;
		int leftMax = Integer.MIN_VALUE;  
		for(int i=mid; i>=low; i--)  {
			sum += arr[i];
			if( sum>leftMax ) {
				leftMax = sum;
			}
		}
		sum = 0;
		int rightMax = Integer.MIN_VALUE;
		
		for(int x=mid+1; x<=high; x++) {
			sum += arr[x];
			if( sum>rightMax ) {
				rightMax = sum;
			}
		}
		return leftMax + rightMax;
	}
	
	
}
