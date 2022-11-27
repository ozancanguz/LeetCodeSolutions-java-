package LeetCode75Questions;

public class FindReverseInteger {
	
	
	   public static int reverse(int x) {

	   
		      

		       int rev=0;
		       
		       while(x!=0) {
		    	   
		    	   rev=rev*10 + x%10;
		    	   x=x/10;
		    			   
		       }
		       return rev;
		       
		    

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(1234));
		System.out.println(reverse(0));
	}

}
