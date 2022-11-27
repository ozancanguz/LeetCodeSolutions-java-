package LeetCode75Questions;

public class FindSmallestIntegerInArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values= {1,0,9,3};
		
		
		System.out.print(findSmallest(values));


	}

	
	static int findSmallest(int[] values) {
		
		
          int min=values[0];
          for(int i=0;i<values.length;i++) {
        	  
        	  if(values[i]<min) {
        		  
        		  min=values[i];
        	  }
          }
          return min;
		        
		 
}
}
