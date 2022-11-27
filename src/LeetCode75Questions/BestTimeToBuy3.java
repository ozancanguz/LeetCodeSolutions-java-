package LeetCode75Questions;

public class BestTimeToBuy3 {
	
    public static int maxProfit(int[] prices) {


        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){

            int profit=prices[j]-prices[i];
            maxProfit=Math.max(maxProfit,profit);
        }
        
    }
    return maxProfit;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,7,5,3,5,4};
		System.out.println(maxProfit(nums));
		
	}

}
