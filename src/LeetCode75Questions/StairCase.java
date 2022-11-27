package LeetCode75Questions;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(10);

	}

	static void staircase(int n) {

		   int counter=0;
		   for(int i=0; i<n;i++)
		   {
		       counter++;
		       for(int k=n; k>= i;k--)
		       {
		           System.out.print(" "); 
		       } 
		       for(int j=0; j<=counter-1;j++) 
		       {
		           System.out.print("#");
		       }

		       System.out.print("\n");
		   }
		}  
}
