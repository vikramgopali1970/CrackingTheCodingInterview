package CrackingTheCodingInterview;

import java.util.ArrayList;

public class Triplets {

    public void findTriplets(int[] arr, int sum){
        Integer[] soln = new Integer[arr.length];
        this.findTripletsHelper(arr,sum,0,0,soln);
    }

    private void findTripletsHelper(int[] arr,int sum,int index,int count,Integer[] sol){
        if(sum ==0 && count == 3 && this.solLen(sol)){
            this.printlist(sol);
        }
        if(index == arr.length || count == 3){
            return;
        }
        if(arr[index] > sum && count < 3){
            this.findTripletsHelper(arr,sum,index+1,count,sol);
        }
        if(count < 3){
            sol[index] = null;
            this.findTripletsHelper(arr,sum,index+1,count,sol);
            sol[index] = arr[index];
            this.findTripletsHelper(arr,sum-arr[index],index+1,count+1,sol);
        }else{
            return;
        }
    }

    private void printlist(Integer[] sol){
        for(int i=0;i<sol.length;i++){
            if(sol[i]!=null){
                System.out.print(sol[i]+" ");
            }
        }
        System.out.println();
    }

    private boolean solLen(Integer[] sol){
        int c = 0;
        for(int i=0;i<sol.length;i++){
            if(sol[i] != null){
                c++;
            }
        }
        return c==3;
    }
}
