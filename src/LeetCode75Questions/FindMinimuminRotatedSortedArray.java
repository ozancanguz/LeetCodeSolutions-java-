package LeetCode75Questions;

public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums= {3,4,5,1,2};
		System.out.println(findMin(nums));
	}

	
	
	
	    public static int findMin(int[] nums) {
	        for(int i=0;i<nums.length-1;i++)
	        {
	            if(nums[i]>nums[i+1])
	                return nums[i+1];
	                
	        }
	        return nums[0];
	    
	}
}
