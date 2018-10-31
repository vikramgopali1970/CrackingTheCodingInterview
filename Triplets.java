package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

    public void findTriplets(int[] nums, int sum){
        Integer[] soln = new Integer[nums.length];
        this.findTripletsHelper(nums,sum,0,0,soln);
    }

    private void findTripletsHelper(int[] nums,int sum,int index,int count,Integer[] sol){
        if(sum ==0 && count == 3 && this.solLen(sol)){
            this.printlist(sol);
        }
        if(index == nums.length || count == 3){
            return;
        }
        if(nums[index] > sum && count < 3){
            this.findTripletsHelper(nums,sum,index+1,count,sol);
        }
        if(count < 3){
            sol[index] = null;
            this.findTripletsHelper(nums,sum,index+1,count,sol);
            sol[index] = nums[index];
            this.findTripletsHelper(nums,sum-nums[index],index+1,count+1,sol);
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


    public ArrayList sumTripletIterative(int[] nums,int sum){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            if(i==0 || nums[i]!= nums[i-1]){
                int l = i+1;
                int r = nums.length -1;
                while(l < r){
                    ArrayList<Integer> temp= new ArrayList<Integer>();
                    if(nums[i]+nums[l]+nums[r] == sum){
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        res.add(temp);
                    }
                    if(nums[i]+nums[l]+nums[r] < sum){
                        int pL = l;
                        while(nums[pL] == nums[l] && l < r){
                            l++;
                        }
                    }else{
                        int pR = r;
                        while(nums[pR] == nums[r] && l<r){
                            r--;
                        }
                    }
                }

            }
        }
    return res;
    }

}
