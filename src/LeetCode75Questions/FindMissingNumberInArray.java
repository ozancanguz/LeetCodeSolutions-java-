package LeetCode75Questions;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,3,4,5,6,7,9};
		
		System.out.println(missingNumber(nums));
		
		
		
	}
	
	
	
	
	
	  public static int missingNumber(int[] nums) {
	        
		
		        int n=nums.length+1;
		       int sum1=n*(n+1)/2;
		       
		       int sum2=0;
		       for(int i=0;i<nums.length;i++) {
		    	   
		    	   sum2=sum2+nums[i];
		       }
		       
		       return sum1-sum2;
		       
		  
		   
	 
	  }
	    }

