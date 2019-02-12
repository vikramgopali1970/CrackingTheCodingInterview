package CrackingTheCodingInterview;

public class Puzzles {

    private boolean checkPuzzle(int[][] arr){
        for(int i=0;i<arr[0].length;i++){
            if(arr[0][i] != i+1){
                return false;
            }
        }
        for(int i=arr[0].length-1;i>=0;i--){
            if(arr[arr.length-1][i] != 7-i){
                return false;
            }
        }
        if(arr[1][0] != 8 && arr[1][arr[0].length-1] != 4){
            return false;
        }
        return true;
    }

    private void printPuzzle(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void solvePuzzleOne(int[][] puz1,int i, int j){
        this.solvePuzzleOneHelper(puz1,i,j,false,0,0,0,0);
    }

    public int[][] swap(int[][] arr, int i,int j, int k,int l){
        int temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;
        return arr;
    }

    private int[] checkForZero(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }




    private void solvePuzzleOneHelper(int[][] puz1, int i,int j, boolean solved,int l,int r,int u,int d){

        System.out.println(i+ " "+j);
        this.printPuzzle(puz1);
        if(checkPuzzle(puz1)){
            solved = true;
            this.printPuzzle(puz1);
            return;
        }
        if(solved){
            this.printPuzzle(puz1);
        }

        if(i < 0 || i >= puz1.length || j < 0 || j >= puz1[0].length || i-1 < 0 || i+1 >= puz1.length || j-1 < 0 || j+1 >= puz1[0].length){
            return;

        }else{
            if(d != 1){
                puz1 = this.swap(puz1,i,j,i+1,j);
                System.out.println("swapping with bottom"+ i +" "+j);
                int[] temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                this.solvePuzzleOneHelper(puz1,i,j,solved,l,r,u,1);
                temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                d=0;
            }

            //backtracking

            if(u != 1){
                puz1 = this.swap(puz1,i,j,i-1,j);
                int[] temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                System.out.println("swapping with top"+ i +" "+j);
                this.solvePuzzleOneHelper(puz1,i,j,solved,l,r,1,d);
                temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                u=0;
            }
            //backtracking

            if(r != 1){
                puz1 = this.swap(puz1,i,j,i,j+1);
                int[] temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                System.out.println("swapping with right"+ i +" "+j);
                this.solvePuzzleOneHelper(puz1,i,j,solved,l,1,u,d);
                temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                r=0;
            }
            //backtracking

            if(l !=1){
                puz1 = this.swap(puz1,i,j,i,j-1);
                int[] temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                System.out.println("swapping with left"+ i +" "+j);
                this.solvePuzzleOneHelper(puz1,i,j,solved,1,r,u,d);
                temp = this.checkForZero(puz1);
                i=temp[0];
                j=temp[1];
                l=0;
            }
            //backtracking
//            puz1 = this.swap(puz1,empty[0],empty[1],empty[0],empty[1]-1);
//            puz1 = this.swap(puz1,empty[0],empty[1],empty[0]+1,empty[1]);
//            puz1 = this.swap(puz1,empty[0],empty[1],empty[0]+1,empty[1]);
//            puz1 = this.swap(puz1,empty[0],empty[1],empty[0],empty[1]+1);




        }

    }

}
