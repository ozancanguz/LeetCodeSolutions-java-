package LeetCode75Questions;

public class FindLargestELementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {23,24,25,2,99};
		
		System.out.println(findlargest(nums));

	}
	
	
	static int findlargest(int[] nums) {
		
	
		
		     int max=nums[0];
		     
		     for(int i=0;i<nums.length;i++) {
		    	 
		    	 if(max<nums[i]) {
		    		 
		    		 max=nums[i];
		    	 }
		    	 
		     }
		     return max;
		     
		     
		
		
	}

}
