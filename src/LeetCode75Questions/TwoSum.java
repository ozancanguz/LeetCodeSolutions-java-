package LeetCode75Questions;

public class TwoSum {
	
	
	public static  int[] twoSum(int[] nums, int target) {
		
		
		// time com : o(n^2) 
		         for(int i=0;i<nums.length;i++) {
		        	 
		        	 for(int j=i+1;j<nums.length;j++) {
		        		 
		        		 int complement=target-nums[i];
		        		 if(nums[j]==complement) {
		        			 return new int[] {i,j};
		        			 
		        		 }
		        	 }
		         }

		         return new int[] {0,0};
	    
	        
	    }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums= {4,5,6,8,1};

		   System.out.println(twoSum(nums,9)); 
	   

	}

}
