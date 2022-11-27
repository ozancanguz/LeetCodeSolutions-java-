package LeetCode75Questions;

public class IsPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("ozan"));
		System.out.println(isPalindrome("radar"));
		

	}

	
	 public static boolean isPalindrome(String str) {
		 
		 String temp=str;
		 String rev="";
		 
		 for(int i=str.length()-1;i>=0;i--) {
			 
			 rev=rev+str.charAt(i);
			 
		 }
		if(str.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
		 
	 }
}
