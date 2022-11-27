package LeetCode75Questions;

public class Factoriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FirstFactorial(5));

	}
	
	
	public static int FirstFactorial(int num) {


	 
		int fact=1;
		
		for(int i=2;i<=num;i++) {
			
			fact=fact*i; //2-6-24-120
		}
		int answer=fact;
		
		return answer;
		
		
		
		
	  }

}
