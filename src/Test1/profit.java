package Test1;


import java.util.Arrays;

public class profit {

    public static int profitMaxDay(int[] prices){
        int min=Integer.MAX_VALUE;
        int profit=0;
        int minindex=0;
        for (int i = 0; i < prices.length; i++) {
                if(prices[i]<min){
                    min=prices[i];
                    minindex=i;
                }
                if (prices[i]-min>profit) {
                    profit=prices[i]-min;
                }else return 0;
            }
        return profit;
        }
    public static void main(String[] args) {
        int[] priceList = {7,4,1,3,6,1};
        int profit = profitMaxDay(priceList);
        System.out.println("profit = " + profit);
    }
}

