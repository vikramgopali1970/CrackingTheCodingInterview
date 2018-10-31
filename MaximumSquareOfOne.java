package CrackingTheCodingInterview;

import java.util.Arrays;

public class MaximumSquareOfOne {
    private int[][] soln;
    private int[][] mat;
    private int m,n;

    public MaximumSquareOfOne(int[][] mat){
        this.m = mat.length;
        this.n = mat[0].length;
        this.soln = new int[this.m][this.n];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(this.soln[i],0);
        }
        this.mat = mat;
    }

    public int getMaxSquare(){
        int max = 0;
        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.n;j++){
                if(this.mat[i][j] == 0){
                    continue;
                }
                if(i==0 || j==0){
                    this.soln[i][j] = this.mat[i][j];
                }else{
                    this.soln[i][j] = Math.min(Math.min(this.soln[i][j-1],this.soln[i-1][j-1]),this.soln[i-1][j]) + this.mat[i][j];
                }
                if(this.soln[i][j] > max){
                    max = this.soln[i][j];
                }
            }
        }
//        this.printMatrix(this.soln);
        return max;
    }

    private void printMatrix(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
