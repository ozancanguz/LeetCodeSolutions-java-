package algorithm;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,3,3,4};
		System.out.println(findDuplicate(nums));
		
		
		
		
	}
	
	
	
	public static int findDuplicate(int[] nums) {
		
		int duplicate=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]==nums[j]) {
					duplicate=nums[j];
				}
			}
		}
		return duplicate;
		
	}
	
	
	
	
	
	
	


}
