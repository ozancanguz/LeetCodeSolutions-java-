package LeetCode75Questions;

public class ContainsDuplicate2 {
	
	
	
	
	  public static boolean containsDuplicate(int[] nums) {

		  for(int i=0;i<nums.length;i++) {
			  
			  for(int j=i+1;j<nums.length;j++) {
				  
				  if(nums[i]==nums[j]) {
					  System.out.println(nums[i]);
					  return true;
				  }
				  
			  }
		  }
		  return false;
		  
		
	  }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums=new int[] {4,5,6,7,1,1};
		System.out.println(containsDuplicate(nums));
		
		

	}

}
