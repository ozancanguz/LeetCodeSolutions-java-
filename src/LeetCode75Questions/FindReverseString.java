package LeetCode75Questions;

public class FindReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FirstReverse("ozan"));

	}
	
	
	  public static String FirstReverse(String str) {
		
		  
		  
		
		    String rev="";
		    
		    for(int i=str.length()-1;i>=0;i--) {
		    	
		    	rev=rev+str.charAt(i);
		    }
		    
		    return rev;
}

}