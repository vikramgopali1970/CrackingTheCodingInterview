package CrackingTheCodingInterview;

import java.util.HashSet;

public class PairSum {

    public void singlePair(int[] arr, int sum){
        HashSet<Integer> comps = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(comps.contains(arr[i])){
                System.out.println("pair found ("+arr[i]+","+(sum-arr[i])+")");
            }else{
                comps.add(sum-arr[i]);
            }
        }
    }
}
