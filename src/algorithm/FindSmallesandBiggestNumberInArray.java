package algorithm;

public class FindSmallesandBiggestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {30,10,40,50};
		System.out.println(findSmallAndGreat(nums));
	}

	
	public static int findSmallAndGreat(int[] nums) {
		
		
		int min=nums[0];
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[i] ) {
					
					min=nums[j];
					
				}
			}
		}
		System.out.println("This is the min number:  "+min);
		
		
		return min;
		
		
		
	}
}
