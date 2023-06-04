package Day1;

import java.util.ArrayList;

public class BuySellStock {
    public static void main(String[] args) {

    }
    public static int maximumProfit(ArrayList<Integer> prices){
        int minValue = Integer.MAX_VALUE;
        int profit = 0;
        for(int i =0; i<prices.size(); i++){
            if(prices.get(i) < minValue)
                minValue = prices.get(i);
            else if((prices.get(i)-minValue) > profit)
                profit = prices.get(i) - minValue;

        }

        return profit;
    }
}
