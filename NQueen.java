package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {
    private int[][] chessBoard;
    private Integer[] qRes;
    private int n;
    private ArrayList<String> res;

    public NQueen(int n){
        this.n = n;
        this.chessBoard = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(this.chessBoard[i],0);
        }
        this.qRes = new Integer[n];
        this.res = new ArrayList<>();
    }

    public ArrayList<String> findNQueens(){
        this.findNQueensHelper(0);
        return this.res;
    }

    private void findNQueensHelper(int index){
        if(index >= this.n){
            String str = this.printCoOrdinates();
            if(null != str && !str.isEmpty()){
                this.res.add(str);
            }
            return;
        }
        for(int i=0;i<this.n;i++){
            if(index >0 && null != this.qRes[index-1]){
                //check for conditions
                if(this.checkForThreat(index,i)){
                    this.qRes[index] = i;
                    this.findNQueensHelper(index+1);
                }
            }else{
                this.qRes[index] = i;
                this.findNQueensHelper(index+1);
            }
        }
    }

    private boolean checkForThreat(Integer index,int x){
        for(int i=0;i<index;i++){
            if(this.qRes[i] == x){
                return false;
            }else if (Math.abs(index - i)== Math.abs(x - this.qRes[i])){
                return false;
            }
        }
        return true;
    }

    private String printCoOrdinates(){
        StringBuilder strb = new StringBuilder();
        strb.append("[ ");
        for(int i=0;i<this.n;i++){
            if(null != this.qRes){
                strb.append("("+i+","+this.qRes[i]+")");
            }
        }
        strb.append(" ]");
        return strb.toString();
    }
}
