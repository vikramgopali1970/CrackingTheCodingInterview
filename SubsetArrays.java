package CrackingTheCodingInterview;

public class SubsetArrays {

    public void getSubset(int[] arr){
        Integer[] subsetArr = new Integer[arr.length];
        getSubsets(arr,0,subsetArr);
        return;
    }

    private void getSubsets(int[] arr,int index,Integer[] subsetArr){
        if(index == arr.length){
            this.printSubset(subsetArr);
            return;
        }else{
            subsetArr[index] = null;
            getSubsets(arr,index+1,subsetArr);
            subsetArr[index] = arr[index];
            getSubsets(arr,index+1,subsetArr);
        }
        return;
    }

    private void printSubset(Integer[] arr) {
        for(int i=0;i<arr.length;i++){
            if(null != arr[i]) {
                System.out.print(arr[i]);
            }
        }
        System.out.println("");
    }

}
