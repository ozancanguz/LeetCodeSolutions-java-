package LeetCode75Questions;

public class FindDigit6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(findDigits(2802311));
	}
	
	
	
	
	
	
    public static int findDigits(int n) {
    // Write your code here
            
  
    	    int count=0;
    	    
    	    while(n!=0) {
    	    	
    	    	n=n/10;
    	    	count++;
    	    }
    	    
    	    
    	     return count;
    	  
    }
}
