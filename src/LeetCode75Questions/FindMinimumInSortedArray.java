package LeetCode75Questions;

public class FindMinimumInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	  public int findMin(int[] nums) {
	        int i=0;
	        while(i!=(nums.length-1))
	        {
	            if(nums[i]>nums[i+1])
	                return nums[i+1];  
	            i++;
	        }
	        return nums[0];
	    }
}
