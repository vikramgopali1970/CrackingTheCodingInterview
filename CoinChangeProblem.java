package CrackingTheCodingInterview;

public class CoinChangeProblem {

    public int getSubsets(int[] coins, int sum){
        return getCoinsSubset(coins,coins.length -1,sum);
    }

    private int getCoinsSubset(int[] coins,int index, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(index <0 && sum >0){
            return 0;
        }
        return getCoinsSubset(coins,index-1,sum) + getCoinsSubset(coins,index,sum - coins[index]);
    }

}
