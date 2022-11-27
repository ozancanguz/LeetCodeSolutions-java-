package LeetCode75Questions;

public class FindAverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums= {2,3,5,6,20};
		
		System.out.println(findAverage(nums));
	}

	
	public static int findAverage(int[] nums) {
		
		int sum=0;
		int n=nums.length;
		
		for(int i=0;i<nums.length;i++) {
			
			sum=sum+nums[i];
		}
		
		return sum/n;
		
		
	}
}
