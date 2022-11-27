package LeetCode75Questions;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	      
	      
	      System.out.println(findDuplicateChar("pop"));
	}

	
	public static char findDuplicateChar(String str) {
		
		 char char1='3';  
		
		char[] charArray=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(charArray[i]==charArray[j]) {
					
				     char1=charArray[j];
					
				     
				}
				
			}
			
		}
		
		return char1;
		}
	
}
