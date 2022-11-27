package LeetCode75Questions;

public class IsPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(isPalindrome(101));

	}
	
	
	
	
	
	   public static boolean isPalindrome(int x) {

     
		             
		        int temp=x;
		        int rev=0;
		        while(x!=0) {
		        	
		        	rev=rev*10+ x%10; 
		        	x=x/10;
		        }
	              
                  if(rev==temp) {
                	  return true;
                  }else {
                	  return false;
                  }

       }

}
