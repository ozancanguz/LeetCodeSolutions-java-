package LeetCode75Questions;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,1,2,3};
		System.out.println(removeDuplicates(nums));

	}
	
	  public static int removeDuplicates(int[] nums) {

	        int j = 1; 
	        for (int i = 0; i < nums.length - 1; i++) {
	            if(nums[i] != nums[i+1]){
	                nums[j++] = nums[i+1];
	            }
	        }
	        return j;
	    }

}
