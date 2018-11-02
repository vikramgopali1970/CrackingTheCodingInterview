package CrackingTheCodingInterview;

class MinMax {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    public void printMinMax(int[] arr){
        this.min = arr[0];
        this.max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>this.max){
                this.max = arr[i];
            }else if(arr[i]<this.min){
                this.min = arr[i];
            }
        }
        System.out.println("minimum in array is "+this.min+" maximum is "+this.max);
    }
}