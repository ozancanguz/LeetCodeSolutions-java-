package algorithm;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ispalindrome(101));
	}
	
	
	public static boolean ispalindrome(int x) {
		
		
		int reversed=0;
		
		int temp=x;
		while(x!=0) {
			
			reversed=reversed*10 + x%10;
			x=x/10;
			
		}
	;
		if(temp==reversed) {
			
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
